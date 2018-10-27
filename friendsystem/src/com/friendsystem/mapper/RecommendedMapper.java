package com.friendsystem.mapper;

import com.friendsystem.pojo.Recommended;
import com.friendsystem.pojo.RecommendedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendedMapper {
    int countByExample(RecommendedExample example);

    int deleteByExample(RecommendedExample example);

    int deleteByPrimaryKey(String recommendedId);

    int insert(Recommended record);

    int insertSelective(Recommended record);

    List<Recommended> selectByExample(RecommendedExample example);

    Recommended selectByPrimaryKey(String recommendedId);

    int updateByExampleSelective(@Param("record") Recommended record, @Param("example") RecommendedExample example);

    int updateByExample(@Param("record") Recommended record, @Param("example") RecommendedExample example);

    int updateByPrimaryKeySelective(Recommended record);

    int updateByPrimaryKey(Recommended record);
}