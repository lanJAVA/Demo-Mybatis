package com.lans.mybatis.dao;

import com.lans.mybatis.bean.Month;
import com.lans.mybatis.bean.MonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthMapper {
    long countByExample(MonthExample example);

    int deleteByExample(MonthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Month record);

    int insertSelective(Month record);

    List<Month> selectByExample(MonthExample example);

    Month selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Month record, @Param("example") MonthExample example);

    int updateByExample(@Param("record") Month record, @Param("example") MonthExample example);

    int updateByPrimaryKeySelective(Month record);

    int updateByPrimaryKey(Month record);
}