package com.github.gorden5566.struts2.demos.dao.impl;

import com.github.gorden5566.struts2.demos.dao.UserDao;
import com.github.gorden5566.struts2.demos.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public User getUserById(Long id) {
        logger.info("userId: {}", id);
        try {
            return (User) getSqlMapClientTemplate().queryForObject("getUserById", id);
        } catch (Exception e) {
            logger.error("getUserById", e);
            return null;
        }
    }

    @Override
    public List<User> getAllUser() {
        try {
            return getSqlMapClientTemplate().queryForList("getAllUser");
        } catch (Exception e) {
            logger.error("getAllUser error,", e);
            return null;
        }

    }

    @Override
    public Long addUser(User user) {
        try {
            return (Long) getSqlMapClientTemplate().insert("addUser", user);
        } catch (Exception e) {
            logger.error("addUser error,", e);
            return null;
        }
    }

    @Override
    public Integer deleteUserById(Long id) {
        try {
            return getSqlMapClientTemplate().delete("deleteUserById", id);
        } catch (Exception e) {
            logger.error("deleteUserById error,", e);
            return null;
        }

    }
}
