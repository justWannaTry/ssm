package com.ssm.test;

import com.ssm.bean.TBlogger;
import com.ssm.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Seven on 2017/6/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml"})
public class TestService {
    @Autowired
    private BlogService service;
    @Test
    public void testSelectOne(){
        TBlogger blogger =service.selectByPrimaryKey(2);
        System.out.println(blogger);
    }
    @Test
    public void testInsertBlogger(){
        TBlogger blogger=new TBlogger();
        blogger.setUsername("123");
        blogger.setPassword("12345");
        service.insertBlogger(blogger);

    }
}
