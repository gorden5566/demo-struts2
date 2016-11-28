package com.github.gorden5566.struts2.demos.service.impl;

import com.github.gorden5566.struts2.demos.dao.UserDao;
import com.github.gorden5566.struts2.demos.dto.User;
import com.github.gorden5566.struts2.demos.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserServiceImpl implements UserService{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserDao userDao;

    @Override
    public User getUserById(Long id) {
        if (id == null) {
            logger.error("invalid userId!");
            return new User();
        }
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
