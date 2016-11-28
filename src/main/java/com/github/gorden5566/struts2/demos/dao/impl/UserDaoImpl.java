package com.github.gorden5566.struts2.demos.dao.impl;

import com.github.gorden5566.struts2.demos.dao.UserDao;
import com.github.gorden5566.struts2.demos.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public User getUserById(Long id) {
        logger.info("userId: {}", id);
        return (User) getSqlMapClientTemplate().queryForObject("getUserById", id);
    }

    @Override
    public List<User> getAllUser() {
        return getSqlMapClientTemplate().queryForList("getAllUser");
    }
}
