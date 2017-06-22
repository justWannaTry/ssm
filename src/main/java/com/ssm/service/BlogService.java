package com.ssm.service;

import com.ssm.bean.TBlogger;

/**
 * Created by Seven on 2017/6/12.
 */
public interface BlogService {
    TBlogger selectByPrimaryKey(Integer id);
    void insertBlogger(TBlogger blogger);
}
