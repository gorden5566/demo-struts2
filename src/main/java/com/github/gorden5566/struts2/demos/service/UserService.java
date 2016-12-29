package com.github.gorden5566.struts2.demos.service;

import com.github.gorden5566.struts2.demos.dto.User;

import java.util.List;

public interface UserService {

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    public User getUserById(Long id);

    /**
     * 获取所有用户信息
     * @return
     */
    public List<User> getAllUser();

    /**
     * 添加用户
     * @param user
     * @return
     */
    public Long addUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    public Integer deleteUserById(Long id);

}
