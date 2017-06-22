package com.ssm.service.impl;

import com.ssm.bean.TBlogger;
import com.ssm.mapper.TBloggerMapper;
import com.ssm.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Seven on 2017/6/12.
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    TBloggerMapper bloggerMapper;

    @Override
    public TBlogger selectByPrimaryKey(Integer id) {
        TBlogger blogger= bloggerMapper.selectByPrimaryKey(id);
        if(null!=blogger){
            return  blogger;
        }
        return null;
    }

    @Override
    public void insertBlogger(TBlogger blogger) {
        System.out.println("bloggerMapper: "+bloggerMapper);
        bloggerMapper.insert(blogger);
    }
}
