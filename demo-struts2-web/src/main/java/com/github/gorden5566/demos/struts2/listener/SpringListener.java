package com.github.gorden5566.demos.struts2.listener;

import com.github.gorden5566.demos.struts2.util.SpringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;

/**
 * Created by gorden5566 on 17-7-20.
 */
public class SpringListener extends ContextLoaderListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        super.contextInitialized(event);
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
        SpringUtils.initial(context);
    }
}
