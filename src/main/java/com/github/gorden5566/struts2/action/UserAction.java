package com.github.gorden5566.struts2.action;

import com.github.gorden5566.struts2.demos.dto.User;
import com.github.gorden5566.struts2.demos.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class UserAction {

    private static final Logger logger = LoggerFactory.getLogger(UserAction.class);

    private UserService userService;

    List<User> users;

    public String showAllUsers() {
        users = userService.getAllUser();
        if (!CollectionUtils.isEmpty(users)) {
            logger.info("userSize: {}", users.size());
            for (User user : users) {
                logger.info("userId: {}, userName: {}", user.getId(), user.getUserName());
            }
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
}
