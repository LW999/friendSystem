package com.friendsystem.mapper;

import com.friendsystem.pojo.AttentionPeople;
import com.friendsystem.pojo.AttentionPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttentionPeopleMapper {
    int countByExample(AttentionPeopleExample example);

    int deleteByExample(AttentionPeopleExample example);

    int deleteByPrimaryKey(String attentionPeopleId);

    int insert(AttentionPeople record);

    int insertSelective(AttentionPeople record);

    List<AttentionPeople> selectByExample(AttentionPeopleExample example);

    AttentionPeople selectByPrimaryKey(String attentionPeopleId);

    int updateByExampleSelective(@Param("record") AttentionPeople record, @Param("example") AttentionPeopleExample example);

    int updateByExample(@Param("record") AttentionPeople record, @Param("example") AttentionPeopleExample example);

    int updateByPrimaryKeySelective(AttentionPeople record);

    int updateByPrimaryKey(AttentionPeople record);
}