package com.friendsystem.mapper;

import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapper {
	int countByExample(ArticleExample example);

	int deleteByExample(ArticleExample example);

	int deleteByPrimaryKey(String articleId);

	int insert(Article record);

	int insertSelective(Article record);

	List<Article> selectByExample(ArticleExample example);

	Article selectByPrimaryKey(String articleId);

	int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

	int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

	int updateByPrimaryKeySelective(Article record);

	int updateByPrimaryKey(Article record);

	/**
	 * 随机查询8条文章
	 */
	List<Article> selectByRand();

	List<Article> getThreeArticle(String userID);
	/**
	 * 模糊查询
	 * 
	 * @param search
	 * @return
	 */
	List<Article> selectLike(String search);

}