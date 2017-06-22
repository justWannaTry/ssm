package com.ssm.mapper;

import com.ssm.bean.TBlogger;
import org.springframework.stereotype.Repository;
@Repository
public interface TBloggerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBlogger record);

    int insertSelective(TBlogger record);

    TBlogger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBlogger record);

    int updateByPrimaryKeyWithBLOBs(TBlogger record);

    int updateByPrimaryKey(TBlogger record);
}