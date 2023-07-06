package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Clock;
import com.atguigu.crud.bean.ClockExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClockMapper {
    long countByExample(ClockExample example);

    int deleteByExample(ClockExample example);

    int deleteByPrimaryKey(Integer clockId);

    int insert(Clock record);

    int insertSelective(Clock record);

    List<Clock> selectByExample(ClockExample example);

    Clock selectByPrimaryKey(Integer clockId);

    int updateByExampleSelective(@Param("record") Clock record, @Param("example") ClockExample example);

    int updateByExample(@Param("record") Clock record, @Param("example") ClockExample example);

    int updateByPrimaryKeySelective(Clock record);

    int updateByPrimaryKey(Clock record);
}