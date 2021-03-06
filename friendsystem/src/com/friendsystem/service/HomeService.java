package com.friendsystem.service;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.friendsystem.DTO.Article_DetailsDTO;
import com.friendsystem.DTO.Article_Like_CollectionDTO;
import com.friendsystem.DTO.CommentDTO;
import com.friendsystem.DTO.KeywordDTO;
import com.friendsystem.DTO.LikeDTO;
import com.friendsystem.DTO.UserAttentionDTO;
import com.friendsystem.DTO.UserLikeAndTimeDTO;
import com.friendsystem.DTO.User_LikeDTO;
import com.friendsystem.mapper.ArticleMapper;
import com.friendsystem.mapper.AttentionPeopleMapper;
import com.friendsystem.mapper.CollectionMapper;
import com.friendsystem.mapper.CommentMapper;
import com.friendsystem.mapper.KeywordMapper;
import com.friendsystem.mapper.LikesMapper;
import com.friendsystem.mapper.ProjectMapper;
import com.friendsystem.mapper.RecommendedMapper;
import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.ArticleExample;
import com.friendsystem.pojo.AttentionPeople;
import com.friendsystem.pojo.AttentionPeopleExample;
import com.friendsystem.pojo.CollectionExample;
import com.friendsystem.pojo.Comment;
import com.friendsystem.pojo.CommentExample;
import com.friendsystem.pojo.Keyword;
import com.friendsystem.pojo.KeywordExample;
import com.friendsystem.pojo.KeywordExample.Criteria;
import com.friendsystem.pojo.Likes;
import com.friendsystem.pojo.LikesExample;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.ProjectExample;
import com.friendsystem.pojo.Recommended;
import com.friendsystem.pojo.RecommendedExample;
import com.friendsystem.pojo.User;
import com.friendsystem.pojo.UserExample;
import com.friendsystem.util.BuildUuid;
import com.friendsystem.util.JiebaSegmenterUtil;
import com.friendsystem.util.RemoveHTML;
import com.friendsystem.util.TimeUtil;;


@Service("homeService")
public class HomeService
{
    @Resource
    private ArticleMapper articleMapper;// 文章DAO

    @Resource
    private ProjectMapper projectMapper;// 专题DAO

    @Resource
    private RecommendedMapper recommendedMapper;// 推荐DAO

    @Resource
    private LikesMapper likeMapper;// 点赞DAO

    @Resource
    private CollectionMapper collectionMapper;// 收藏DAO

    @Resource
    private UserMapper userMapper;// 用户DAO

    @Resource
    private AttentionPeopleMapper attentionPeopleMapper;// 关注DAO

    @Resource
    private KeywordMapper keywordMapper;// 关键字DAO

    @Resource
    private CommentMapper commentMapper;// 添加评论字DAO

    /**
     * 查询所有专题
     * 
     * @return
     */
    public List<Project> getAllProject()
    {
        ProjectExample projectExample = new ProjectExample();

        List<Project> listProject = projectMapper.selectByExample(projectExample);
        if (listProject.size() > 0)
        {
            return listProject;
        }
        return null;
    }

    /**
     * 查询所有推荐
     * 
     * @return listRecommended
     */
    public List<Recommended> getRecommended()
    {
        RecommendedExample recommendedExample = new RecommendedExample();
        List<Recommended> listRecommended = recommendedMapper.selectByExample(recommendedExample);
        if (listRecommended.size() > 0)
        {
            return listRecommended;
        }
        return null;
    }

    /**
     * @return listALCDTO
     */
    public List<Article_Like_CollectionDTO> getRandomArticles(int startRow2)
    {
        List<Article_Like_CollectionDTO> listALCDTO = new ArrayList<>();
        ArticleExample articleExample = new ArticleExample();
        articleExample.setPageSize(10);
        articleExample.setStartRow(startRow2 * articleExample.getPageSize());
        articleExample.setOrderByClause("RAND()");
        List<Article> listArticle = articleMapper.selectByExample(articleExample);// 得到十条随机文章
        if (listArticle.size() > 0)
        {
            for (Article article : listArticle)
            {
                LikesExample likeExample = new LikesExample();
                com.friendsystem.pojo.LikesExample.Criteria criteria = likeExample.createCriteria();
                criteria.andLikearticleEqualTo(article.getArticleId());
                int likeNumber = likeMapper.countByExample(likeExample);// 得到所有点赞的人数
                CollectionExample collectionExample = new CollectionExample();
                com.friendsystem.pojo.CollectionExample.Criteria criteria2 = collectionExample.createCriteria();
                criteria2.andCollectionArticleEqualTo(article.getArticleId());
                int collectionNumber = collectionMapper.countByExample(collectionExample);// 得到收藏人数
                Article_Like_CollectionDTO ALCDTO = new Article_Like_CollectionDTO();
                User user = new User();
                user = userMapper.selectByPrimaryKey(article.getArticleByUser());
                String outline = "";
                outline = RemoveHTML.Html2Text(article.getArticleContent(), 100);
                ALCDTO.setOutline(outline);
                ALCDTO.setUser(user);
                ALCDTO.setArticle(article);
                ALCDTO.setCollectionNumber(collectionNumber);
                ALCDTO.setLikeNumber(likeNumber);
                if (ALCDTO != null)
                {
                    listALCDTO.add(ALCDTO);
                }
            }
            return listALCDTO;
        }
        return null;
    }

    /**
     * 显示推荐作者
     * 
     * @return listRandomUsers
     */
    public List<User_LikeDTO> getRandomUsers(User userSession)
    {
        List<User_LikeDTO> listRandomUsers = new ArrayList<>();
        List<User> listUsers = new ArrayList<>();
        if (userSession.getUserType().equals("tourists"))
        {
            // type为游客，随机五个人
            listUsers = userMapper.getRandomUsers();
        }
        else
        {
            List<String> list = new ArrayList<String>();
            list.add(userSession.getUserId());
            List<AttentionPeople> listAttentionPeople = new ArrayList<>();
            AttentionPeopleExample attentionPeopleExample = new AttentionPeopleExample();
            com.friendsystem.pojo.AttentionPeopleExample.Criteria criteria = attentionPeopleExample.createCriteria();
            criteria.andAttentionPeopleUserOneEqualTo(userSession.getUserId());
            listAttentionPeople = attentionPeopleMapper.selectByExample(attentionPeopleExample);
            for (AttentionPeople attentionPeople : listAttentionPeople)
            {
                User userA = new User();
                userA = userMapper.selectByPrimaryKey(attentionPeople.getAttentionPeopleUserTwo());
                list.add(userA.getUserId());
            }
            listUsers = userMapper.getRandomUsersNoOneSelft(list);
        }
        // 先遍历用户，然后遍历用户写的文章，遍历文章得到的赞
        if (listUsers.size() > 0)
        {
            for (User user : listUsers)
            {
                User_LikeDTO ULDTO = new User_LikeDTO();
                ArticleExample articleExample = new ArticleExample();
                com.friendsystem.pojo.ArticleExample.Criteria criteria = articleExample.createCriteria();
                criteria.andArticleByUserEqualTo(user.getUserId());
                criteria.andArticleIsDeleteEqualTo("0");
                List<Article> listArticleByUser = articleMapper.selectByExample(articleExample);// 得到用户所写的文章
                // 定义点赞数
                int all = 0;
                int i = 0;
                for (Article article : listArticleByUser)
                {
                    // 遍历文章所得到的赞
                    LikesExample likeExample = new LikesExample();
                    com.friendsystem.pojo.LikesExample.Criteria criteria2 = likeExample.createCriteria();
                    criteria2.andLikearticleEqualTo(article.getArticleId());
                    int likeByArticle = likeMapper.countByExample(likeExample);
                    all = all + likeByArticle;
                    i++ ;
                    // 如果i等于集合的长度，吧all加入到DTO中
                    if (i == listArticleByUser.size())
                    {
                        ULDTO.setLike(all);
                    }
                }
                ULDTO.setUser(user);
                listRandomUsers.add(ULDTO);
            }
            return listRandomUsers;
        }
        return null;
    }

    public LikeDTO getLikes(String article_Id, String user_Id)
    {
        LikeDTO likeDTO = new LikeDTO();
        String message = "";

        /* Article article = new Article(); */
        LikesExample likesExample = new LikesExample();
        com.friendsystem.pojo.LikesExample.Criteria criteria = likesExample.createCriteria();
        criteria.andLikepeopleEqualTo(user_Id);
        criteria.andLikearticleEqualTo(article_Id);
        List<Likes> listLike = likeMapper.selectByExample(likesExample);// 查询用户是否点赞
        LikesExample likesExample2 = new LikesExample();
        com.friendsystem.pojo.LikesExample.Criteria criteria2 = likesExample2.createCriteria();
        criteria2.andLikearticleEqualTo(article_Id);
        int likes = likeMapper.countByExample(likesExample2);// 该文章的点赞数
        if (listLike.size() > 0)
        {
            message = "cancel";
            likes = likes - 1;
            likeDTO.setLikes(likes);
            likeDTO.setMessage(message);
            likeMapper.deleteByPrimaryKey(listLike.get(0).getLikeid());

        }
        else
        {
            message = "success";
            likes = likes + 1;
            likeDTO.setLikes(likes);
            likeDTO.setMessage(message);
            Likes likes2 = new Likes();
            likes2.setLikeid(BuildUuid.getUuid());
            likes2.setLikearticle(article_Id);
            likes2.setLikecreatetime(TimeUtil.getStringSecond());
            likes2.setLikemodifytime(TimeUtil.getStringSecond());
            likes2.setLikepeople(user_Id);
            likeMapper.insert(likes2);
        }
        return likeDTO;
    }

    /**
     * 查看文章点赞的有什么用户
     * 
     * @param article_Id
     * @return
     */
    public List<UserLikeAndTimeDTO> getUserLike(String article_Id)
    {
        List<UserLikeAndTimeDTO> listU = new ArrayList<>();

        List<Likes> listLike = new ArrayList<>();
        LikesExample likesExample = new LikesExample();
        com.friendsystem.pojo.LikesExample.Criteria criteria = likesExample.createCriteria();
        criteria.andLikearticleEqualTo(article_Id);
        listLike = likeMapper.selectByExample(likesExample);
        if (listLike.size() > 0)
        {
            for (Likes likes : listLike)
            {
                UserLikeAndTimeDTO DTO = new UserLikeAndTimeDTO();
                User user = new User();
                user = userMapper.selectByPrimaryKey(likes.getLikepeople());
                DTO.setUser(user);
                DTO.setTime(likes.getLikecreatetime());
                listU.add(DTO);
            }
        }
        return listU;
    }

    /**
     * 根据传回来的用户ID查询该User关注的所有人
     * 
     * @param user_Id
     * @return
     */
    public List<UserAttentionDTO> getUserAttention(String user_Id, User userSession)
    {

        List<UserAttentionDTO> listU = new ArrayList<>();

        AttentionPeopleExample attentionPeopleExample = new AttentionPeopleExample();
        com.friendsystem.pojo.AttentionPeopleExample.Criteria criteria = attentionPeopleExample.createCriteria();

        List<AttentionPeople> listAttention = new ArrayList<>();
        List<String> values = new ArrayList<>();// 用户关注的人
        if (user_Id.equals(userSession.getUserId())
            || userSession.getUserType().equals("tourists"))
        {
            criteria.andAttentionPeopleUserOneEqualTo(user_Id);
            listAttention = attentionPeopleMapper.selectByExample(attentionPeopleExample);
        }
        else
        {

            List<AttentionPeople> listAttentionMy = new ArrayList<>();
            AttentionPeopleExample attentionPeopleExampleMy = new AttentionPeopleExample();
            com.friendsystem.pojo.AttentionPeopleExample.Criteria criteriaMy = attentionPeopleExampleMy.createCriteria();
            criteriaMy.andAttentionPeopleUserOneEqualTo(userSession.getUserId());
            listAttentionMy = attentionPeopleMapper.selectByExample(attentionPeopleExampleMy);
            for (AttentionPeople attentionPeople : listAttentionMy)
            {
                values.add(attentionPeople.getAttentionPeopleUserTwo());// NB
            }
            criteria.andAttentionPeopleUserOneEqualTo(user_Id);
            // criteria.andAttentionPeopleUserTwoNotIn(values);
            listAttention = attentionPeopleMapper.selectByExample(attentionPeopleExample);
        }
        for (AttentionPeople attentionPeople : listAttention)
        {
            String isAttention = "";
            UserAttentionDTO userAttentionDTO = new UserAttentionDTO();
            User user2 = new User();
            user2 = userMapper.selectByPrimaryKey(attentionPeople.getAttentionPeopleUserTwo());

            if (user2 != null)
            {
                if (values.contains(user2.getUserId()))
                {
                    isAttention = "yes";
                }
                else
                {
                    isAttention = "no";
                }
                userAttentionDTO.setUser(user2);
                userAttentionDTO.setIsAttention(isAttention);
            }
            AttentionPeopleExample attentionPeopleExample2 = new AttentionPeopleExample();
            com.friendsystem.pojo.AttentionPeopleExample.Criteria criteria2 = attentionPeopleExample2.createCriteria();
            criteria2.andAttentionPeopleUserOneEqualTo(
                attentionPeople.getAttentionPeopleUserTwo());
            int attention = attentionPeopleMapper.countByExample(attentionPeopleExample2);
            userAttentionDTO.setAttention(attention);// 用户的关注
            AttentionPeopleExample attentionPeopleExample3 = new AttentionPeopleExample();
            com.friendsystem.pojo.AttentionPeopleExample.Criteria criteria3 = attentionPeopleExample3.createCriteria();
            criteria3.andAttentionPeopleUserTwoEqualTo(
                attentionPeople.getAttentionPeopleUserTwo());
            int fans = attentionPeopleMapper.countByExample(attentionPeopleExample3);
            userAttentionDTO.setFans(fans);// 用户的粉丝
            ArticleExample articleExample = new ArticleExample();
            com.friendsystem.pojo.ArticleExample.Criteria criteria4 = articleExample.createCriteria();
            criteria4.andArticleByUserEqualTo(attentionPeople.getAttentionPeopleUserTwo());
            int article = articleMapper.countByExample(articleExample);
            userAttentionDTO.setArticle(article);// 用户发表的文章数
            List<Article> listA = new ArrayList<>();
            listA = articleMapper.selectByExample(articleExample);
            int all = 0;
            int i = 0;
            int allview = 0;
            for (Article article2 : listA)
            {
                LikesExample likesExample = new LikesExample();
                com.friendsystem.pojo.LikesExample.Criteria criteria5 = likesExample.createCriteria();
                criteria5.andLikearticleEqualTo(article2.getArticleId());
                int like = likeMapper.countByExample(likesExample);
                String view = article2.getArticleViews();
                allview = allview + Integer.parseInt(view);
                i++ ;
                all = all + like;
                if (i == listA.size())
                {
                    userAttentionDTO.setView(allview);
                    userAttentionDTO.setLikes(all);
                }
            }
            listU.add(userAttentionDTO);
        }
        return listU;
    }

    /**
     * 关键字搜索，最多只查5条
     * 
     * @param keyword
     * @return
     */
    public KeywordDTO getSearch(String search)
    {
        if (search != null && search.trim().length() > 0)
        {}
        else
        {
            search = "哈哈";
        }
        if (search != null && search.trim().length() > 0)
        {
            KeywordExample keywordExample = new KeywordExample();
            Criteria criteria = keywordExample.createCriteria();
            criteria.andKeywordContentEqualTo(search);
            criteria.andKeywordCreatetimeBetween(TimeUtil.getStringSecondByUp(),
                TimeUtil.getStringSecond());
            List<Keyword> keyword = keywordMapper.selectByExample(keywordExample);
            if (keyword.size() > 0)
            {
                keyword.get(0).setKeywordNumber(keyword.get(0).getKeywordNumber() + 1);
                keyword.get(0).setKeywordModifytime(TimeUtil.getStringSecond());
                keywordMapper.updateByPrimaryKey(keyword.get(0));
            }
            else
            {
                Keyword keyword2 = new Keyword();
                keyword2.setKeywordId(BuildUuid.getUuid());
                keyword2.setKeywordContent(search);
                keyword2.setKeywordNumber(1);
                keyword2.setKeywordModifytime(TimeUtil.getStringSecond());
                keyword2.setKeywordCreatetime(TimeUtil.getStringSecond());
                keywordMapper.insert(keyword2);
            }
            List<String> list = JiebaSegmenterUtil.testDemo(search);

            KeywordDTO kDto = new KeywordDTO();
            List<UserAttentionDTO> listU = new ArrayList<>();// 用户
            List<Article_DetailsDTO> listA = new ArrayList<>();// 相关文章

            List<User> listUser = new ArrayList<>();
            for (String string : list)
            {
                if (string.trim().length() < 0) continue;
                List<User> listUser2 = new ArrayList<>();
                UserExample userExample = new UserExample();
                com.friendsystem.pojo.UserExample.Criteria criteriaU = userExample.createCriteria();
                criteriaU.andUserNameLike("%" + string + "%");
                listUser2 = userMapper.selectByExample(userExample);
                listUser.addAll(listUser2);
            }
            if (listUser.size() > 0)
            {
                gg: for (User user : listUser)
                {
                    UserAttentionDTO userDTO = new UserAttentionDTO();
                    AttentionPeopleExample attentionPeopleExample = new AttentionPeopleExample();
                    com.friendsystem.pojo.AttentionPeopleExample.Criteria criteriaAttrntionPeople = attentionPeopleExample.createCriteria();
                    for (String string : list)
                    {
                        user.setUserName(user.getUserName().replaceAll(string,
                            "<em class=\"search-result-highlight\">" + string + "</em>"));// 变色
                    }
                    criteriaAttrntionPeople.andAttentionPeopleUserOneEqualTo(user.getUserId());
                    userDTO.setFans(attentionPeopleMapper.countByExample(attentionPeopleExample));
                    for (UserAttentionDTO DTO : listU)
                    {
                        System.out.println("MMMMMM:DTO.getUser().getUserId()"
                                           + DTO.getUser().getUserId().equals(user.getUserId()));
                        if (DTO.getUser().getUserId().equals(user.getUserId())) continue gg;
                    }
                    userDTO.setUser(user);
                    listU.add(userDTO);

                }

            }
            List<Article> listArticle = new ArrayList<>();
            for (String string : list)
            {
                List<Article> listArticle2 = new ArrayList<>();
                ArticleExample articleExample = new ArticleExample();
                articleExample.setPageSize(2);
                com.friendsystem.pojo.ArticleExample.Criteria criteriaArticle = articleExample.createCriteria();
                // criteriaArticle.andArticleContentLike("%" + string + "%");
                criteriaArticle.andArticleTitleLike("%" + string + "%");
                listArticle2 = articleMapper.selectByExample(articleExample);
                listArticle.addAll(listArticle2);
            }
            mm: for (Article article : listArticle)
            {

                for (String string : list)
                {
                    /*
                     * article.setOutline(((article.getOutline()).toLowerCase()).replaceAll(string,
                     * "<span style=\"color: #ea6f5a\">" + string + "</span>"));
                     */
                    article.setArticleTitle(((article.getArticleTitle()).toLowerCase()).replaceAll(
                        string, "<span style=\"color: #ea6f5a\">" + string + "</span>"));

                }
                Article_DetailsDTO article_DetailsDTO = new Article_DetailsDTO();
                for (Article_DetailsDTO DTO : listA)
                {
                    if (DTO.getArticle().getArticleId().equals(article.getArticleId()))
                        continue mm;
                }
                User user = new User();
                user = userMapper.selectByPrimaryKey(article.getArticleByUser());
                article_DetailsDTO.setUser(user);
                article_DetailsDTO.setArticle(article);
                listA.add(article_DetailsDTO);
            }
            if (listU.size() > 0)
            {
                kDto.setListU(listU);
            }
            if (listA.size() > 0)
            {
                kDto.setListA(listA);
            }
            return kDto;
        }
        return null;
    }

    /**
     * 获取24H内的热门搜索
     * 
     * @return
     */
    public List<Keyword> getKeyword()
    {
        List<Keyword> listK = new ArrayList<>();
        KeywordExample keywordExample = new KeywordExample();
        Criteria criteria = keywordExample.createCriteria();
        criteria.andKeywordCreatetimeBetween(TimeUtil.getStringSecondByUp(),
            TimeUtil.getStringSecond());

        keywordExample.setOrderByClause("keyword_number DESC LIMIT 10");
        listK = keywordMapper.selectByExample(keywordExample);
        return listK;
    }

    /**
     * 换一批搜索
     * 
     * @return
     */
    public List<Keyword> getChange()
    {
        List<Keyword> listK = new ArrayList<>();
        KeywordExample keywordExample = new KeywordExample();
        keywordExample.setOrderByClause("RAND() DESC LIMIT 10");
        listK = keywordMapper.selectByExample(keywordExample);

        return listK;
    }

    /**
     * 查所有
     * 
     * @return
     */
    public List<Article> getAll()
    {
        ArticleExample articleExample = new ArticleExample();
        com.friendsystem.pojo.ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andArticleContentLike("%java%");
        List<Article> list = articleMapper.selectByExample(articleExample);
        return list;
    }

    public int update(Article article)
    {
        int d = 0;
        d = articleMapper.updateByPrimaryKey(article);
        return d;
    }

    public List<User> getAllUser()
    {

        List<User> list = userMapper.selectByExample(null);
        return list;
    }

    /**
     * 添加20人
     * 
     * @param user
     */
    public void addUser20(User user)
    {
        userMapper.insert(user);
    }

    /**
     * 添加一级评论
     * 
     * @param userSession
     * @param not_id
     * @param userTwo_id
     * @param parent_id
     */
    public CommentDTO addCommnet(User userSession, String not_id, String content)
    {
        CommentDTO commentDTO = new CommentDTO();
        CommentExample cExample = new CommentExample();
        com.friendsystem.pojo.CommentExample.Criteria criteria = cExample.createCriteria();
        criteria.andCommentNoteIdEqualTo(not_id);
        Comment comment = new Comment();
        comment.setCommentId(BuildUuid.getUuid());
        comment.setCommentContent(content);
        comment.setCommentUseroneId(userSession.getUserId());
        comment.setCommentNoteId(not_id);
        comment.setCommentParentId(not_id);
        comment.setCommentCreateAt(TimeUtil.getStringSecond());
        comment.setCommentIsGrade(1);
        int floor = commentMapper.countByExample(cExample);
        if (floor == 0)
        {
            comment.setCommentFloor(1);
        }
        else
        {
            comment.setCommentFloor(floor + 1);
        }
        commentMapper.insert(comment);
        commentDTO.setComment(comment);
        commentDTO.setUserOne(userSession);
        return commentDTO;
    }

    /**
     * 添加二级评论
     * 
     * @param userSession
     * @param not_id
     * @param parent_id
     * @param content
     * @param userTwo_id
     */
    public CommentDTO addCommnetTwo(User userSession, String not_id, String parent_id,
                                    String content, String userTwo_id, Integer floor)
    {
        CommentDTO commentDTO = new CommentDTO();
        Comment comment = new Comment();
        comment.setCommentId(BuildUuid.getUuid());
        comment.setCommentFloor(floor);
        comment.setCommentNoteId(not_id);
        comment.setCommentUseroneId(userSession.getUserId());
        comment.setCommentIsGrade(2);
        comment.setCommentCreateAt(TimeUtil.getStringSecond());
        comment.setCommentParentId(parent_id);
        comment.setCommentUsertwoId(userTwo_id);
        comment.setCommentContent(content);
        commentMapper.insert(comment);
        commentDTO.setComment(comment);
        commentDTO.setUserOne(userSession);
        commentDTO.setUserTWo(userMapper.selectByPrimaryKey(userTwo_id));
        return commentDTO;
    }

    /**
     * 拿到文章的所有评论
     * 
     * @param not_id
     * @return
     */
    public List<CommentDTO> getComment(String not_id)
    {
        List<CommentDTO> listCommentOneDTO = new ArrayList<>();
        CommentExample commentExample = new CommentExample();
        com.friendsystem.pojo.CommentExample.Criteria criteriaOne = commentExample.createCriteria();
        criteriaOne.andCommentIsGradeEqualTo(1);
        criteriaOne.andCommentNoteIdEqualTo(not_id);
        commentExample.setOrderByClause("comment_floor desc");
        List<Comment> listCommentOne = new ArrayList<>();// 获取一级评论
        listCommentOne = commentMapper.selectByExample(commentExample);
        for (Comment comment : listCommentOne)
        {
            CommentDTO commentDTO = new CommentDTO();
            User userOne = new User();
            userOne = userMapper.selectByPrimaryKey(comment.getCommentUseroneId());
            commentDTO.setComment(comment);
            commentDTO.setUserOne(userOne);
            CommentExample commentExampleTwo = new CommentExample();
            com.friendsystem.pojo.CommentExample.Criteria criteriaTwo = commentExampleTwo.createCriteria();
            criteriaTwo.andCommentIsGradeEqualTo(2);
            criteriaTwo.andCommentNoteIdEqualTo(not_id);
            criteriaTwo.andCommentParentIdEqualTo(comment.getCommentId());
            commentExampleTwo.setOrderByClause("comment_create_at desc");
            List<Comment> listCommentTwo = new ArrayList<>();// 获取二级级评论
            listCommentTwo = commentMapper.selectByExample(commentExampleTwo);
            if (listCommentTwo.size() > 0)
            {
                commentDTO.setComment_exist(1);
                List<CommentDTO> listCommentTwoDTO = new ArrayList<>();
                for (Comment comment2 : listCommentTwo)
                {
                    CommentDTO commentDTO2 = new CommentDTO();
                    User user1 = new User();// 二级评论里面的第一个人
                    User user2 = new User();// 二级评论里面的第二个人
                    user1 = userMapper.selectByPrimaryKey(comment2.getCommentUseroneId());
                    user2 = userMapper.selectByPrimaryKey(comment2.getCommentUsertwoId());
                    commentDTO2.setComment(comment2);
                    commentDTO2.setComment_exist(0);
                    commentDTO2.setUserOne(user1);
                    commentDTO2.setUserTWo(user2);
                    listCommentTwoDTO.add(commentDTO2);
                }
                commentDTO.setListCommentDTO(listCommentTwoDTO);
            }
            listCommentOneDTO.add(commentDTO);
        }
        return listCommentOneDTO;
    }

}
