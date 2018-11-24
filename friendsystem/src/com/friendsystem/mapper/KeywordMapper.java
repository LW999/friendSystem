package com.friendsystem.mapper;

import com.friendsystem.pojo.Keyword;
import com.friendsystem.pojo.KeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordMapper {
    int countByExample(KeywordExample example);

    int deleteByExample(KeywordExample example);

    int deleteByPrimaryKey(String keywordId);

    int insert(Keyword record);

    int insertSelective(Keyword record);

    List<Keyword> selectByExample(KeywordExample example);

    Keyword selectByPrimaryKey(String keywordId);

    int updateByExampleSelective(@Param("record") Keyword record, @Param("example") KeywordExample example);

    int updateByExample(@Param("record") Keyword record, @Param("example") KeywordExample example);

    int updateByPrimaryKeySelective(Keyword record);

    int updateByPrimaryKey(Keyword record);
}