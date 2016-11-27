package com.github.gorden5566.struts2.demos.dao.impl;

import com.github.gorden5566.struts2.demos.dao.UserDao;
import com.github.gorden5566.struts2.demos.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.sql.SQLException;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public User getUserById(Long id) {
        try {
            return (User) getSqlMapClient().queryForObject("getUserById", id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
