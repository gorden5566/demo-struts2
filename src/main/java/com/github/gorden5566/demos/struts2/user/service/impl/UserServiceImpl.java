package com.github.gorden5566.demos.struts2.user.service.impl;

import com.github.gorden5566.demos.struts2.user.dao.UserDao;
import com.github.gorden5566.demos.struts2.user.dto.User;
import com.github.gorden5566.demos.struts2.user.service.UserService;
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

    @Override
    public Long addUser(User user) {
        Long userId = null;
        if (user != null) {
            userId = userDao.addUser(user);
        }
        return userId;
    }

    @Override
    public Integer deleteUserById(Long id) {
        if (id == null) {
            return 0;
        }
        return userDao.deleteUserById(id);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
