package com.github.gorden5566.demos.struts2.user.dao;

import com.github.gorden5566.demos.struts2.user.dto.User;

import java.util.List;

public interface UserDao {

    public User getUserById(Long id);

    public List<User> getAllUser();

    public Long addUser(User user);

    public Integer deleteUserById(Long id);
}
