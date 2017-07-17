package com.github.gorden5566.demos.struts2.remote.service;

import com.caucho.hessian.client.HessianProxyFactory;
import com.github.gorden5566.demos.struts2.remote.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        try {
            String url = "http://localhost:8080/remote/remoteUserService";
            HessianProxyFactory factory = new HessianProxyFactory();
            UserService userService = (UserService) factory.create(UserService.class, url);
            List<User> users = userService.getAllUser();
            logger.info("size = {}", users.size());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    public static void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-client.xml");
        UserService userService = (UserService) context.getBean("remoteUserService");
        List<User> users = userService.getAllUser();
        logger.info("size = {}", users.size());
    }

}