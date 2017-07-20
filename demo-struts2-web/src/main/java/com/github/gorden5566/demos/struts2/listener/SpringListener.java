package com.github.gorden5566.demos.struts2.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;

/**
 * Created by gorden5566 on 17-7-20.
 */
public class SpringListener extends ContextLoaderListener {

    private ApplicationContext applicationContext;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        super.contextInitialized(event);
        applicationContext = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
    }

    public Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    public <T>T getBean(String beanName, Class<T> clazz) {
        return applicationContext.getBean(beanName, clazz);
    }
}
