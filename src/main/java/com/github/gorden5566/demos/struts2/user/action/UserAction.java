package com.github.gorden5566.demos.struts2.user.action;

import com.github.gorden5566.demos.struts2.user.dto.User;
import com.github.gorden5566.demos.struts2.user.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserAction {

    private static final Logger logger = LoggerFactory.getLogger(UserAction.class);

    private UserService userService;

    private List<User> users;

    private String userName;

    private Long id;

    public String showAllUsers() {
        users = userService.getAllUser();
        if (CollectionUtils.isNotEmpty(users)) {
            logger.info("userSize: {}", users.size());
            for (User user : users) {
                logger.info("userId: {}, userName: {}", user.getId(), user.getUserName());
            }
        }

        return "success";
    }

    public String addUser() {
        logger.info("userName: {}", userName);
        if (StringUtils.isNotBlank(userName)) {
            User user = new User();
            user.setUserName(userName.trim());
            Long userId = userService.addUser(user);
            logger.info("userId: {}", userId);
        }

        return "success";
    }

    public String deleteUserById() {
        logger.info("id: {}", id);
        if (id != null) {
            userService.deleteUserById(id);
        }
        return "success";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
