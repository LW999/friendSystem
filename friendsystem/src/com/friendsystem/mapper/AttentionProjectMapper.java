package com.friendsystem.mapper;

import com.friendsystem.pojo.AttentionProject;
import com.friendsystem.pojo.AttentionProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttentionProjectMapper {
    int countByExample(AttentionProjectExample example);

    int deleteByExample(AttentionProjectExample example);

    int deleteByPrimaryKey(String attentionProjectId);

    int insert(AttentionProject record);

    int insertSelective(AttentionProject record);

    List<AttentionProject> selectByExample(AttentionProjectExample example);

    AttentionProject selectByPrimaryKey(String attentionProjectId);

    int updateByExampleSelective(@Param("record") AttentionProject record, @Param("example") AttentionProjectExample example);

    int updateByExample(@Param("record") AttentionProject record, @Param("example") AttentionProjectExample example);

    int updateByPrimaryKeySelective(AttentionProject record);

    int updateByPrimaryKey(AttentionProject record);
}