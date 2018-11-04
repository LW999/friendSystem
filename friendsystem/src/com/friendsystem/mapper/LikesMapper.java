package com.friendsystem.mapper;

import com.friendsystem.pojo.Likes;
import com.friendsystem.pojo.LikesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LikesMapper {
    int countByExample(LikesExample example);

    int deleteByExample(LikesExample example);

    int deleteByPrimaryKey(String likeid);

    int insert(Likes record);

    int insertSelective(Likes record);

    List<Likes> selectByExample(LikesExample example);

    Likes selectByPrimaryKey(String likeid);

    int updateByExampleSelective(@Param("record") Likes record, @Param("example") LikesExample example);

    int updateByExample(@Param("record") Likes record, @Param("example") LikesExample example);

    int updateByPrimaryKeySelective(Likes record);

    int updateByPrimaryKey(Likes record);
}