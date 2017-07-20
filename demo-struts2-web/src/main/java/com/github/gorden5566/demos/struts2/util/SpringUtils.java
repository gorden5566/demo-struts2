package com.github.gorden5566.demos.struts2.util;

import org.springframework.context.ApplicationContext;

/**
 * Created by gorden5566 on 17-7-20.
 */
public class SpringUtils {
    private static ApplicationContext applicationContext;

    public static void initial(ApplicationContext context) {
        applicationContext = context;
    }

    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    public static <T>T getBean(String beanName, Class<T> clazz) {
        return applicationContext.getBean(beanName, clazz);
    }
}
