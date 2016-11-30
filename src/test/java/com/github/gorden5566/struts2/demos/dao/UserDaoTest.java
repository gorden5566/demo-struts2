package com.github.gorden5566.struts2.demos.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:/spring/applicationContext.xml",
        "classpath:/spring/applicationContext-demos.xml"
})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testGetUserById() {
        userDao.getUserById(1L);
    }

    @Test
    public void testGetAllUser() {
        userDao.getAllUser();
    }
}