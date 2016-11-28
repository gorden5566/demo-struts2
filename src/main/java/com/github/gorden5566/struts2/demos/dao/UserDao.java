package com.github.gorden5566.struts2.demos.dao;

import com.github.gorden5566.struts2.demos.dto.User;

import java.util.List;

public interface UserDao {

    public User getUserById(Long id);

    public List<User> getAllUser();
}
