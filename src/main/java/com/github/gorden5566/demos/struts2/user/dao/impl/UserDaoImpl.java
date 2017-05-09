package com.github.gorden5566.demos.struts2.user.dao.impl;

import com.github.gorden5566.demos.struts2.user.dao.UserDao;
import com.github.gorden5566.demos.struts2.user.dto.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public User getUserById(Long id) {
        logger.info("userId: {}", id);
        try {
            return (User) getSqlSession().selectOne("getUserById", id);
        } catch (Exception e) {
            logger.error("getUserById", e);
            return null;
        }
    }

    @Override
    public List<User> getAllUser() {
        try {
            return getSqlSession().selectList("getAllUser");
        } catch (Exception e) {
            logger.error("getAllUser error,", e);
            return null;
        }

    }

    @Override
    public Long addUser(User user) {
        try {
            Integer userId = getSqlSession().insert("addUser", user);
            return Long.valueOf(userId);
        } catch (Exception e) {
            logger.error("addUser error,", e);
            return null;
        }
    }

    @Override
    public Integer deleteUserById(Long id) {
        try {
            return getSqlSession().delete("deleteUserById", id);
        } catch (Exception e) {
            logger.error("deleteUserById error,", e);
            return null;
        }

    }
}
