package com.github.gorden5566.demos.struts2.util;

import com.github.gorden5566.demos.struts2.listener.SpringListener;

/**
 * Created by gorden5566 on 17-7-20.
 */
public class SpringUtils {

    public static Object getBean(String beanName) {
        return SpringListener.getBean(beanName);
    }

    public static <T>T getBean(String beanName, Class<T> clazz) {
        return SpringListener.getBean(beanName, clazz);
    }
}
