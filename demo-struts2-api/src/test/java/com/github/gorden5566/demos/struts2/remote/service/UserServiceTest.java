package com.github.gorden5566.demos.struts2.remote.service;

import com.caucho.hessian.client.HessianProxyFactory;

public class UserServiceTest {
    public static void main(String[] args) {
        try {
            String url = "http://localhost:8080/remote/remoteUserService";
            HessianProxyFactory factory = new HessianProxyFactory();
            UserService userService = (UserService) factory.create(UserService.class, url);
            userService.getAllUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}