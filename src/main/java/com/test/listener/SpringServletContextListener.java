package com.test.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.tools.java.ClassPath;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by zhang_htao on 2019/8/13.
 */

public class SpringServletContextListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String config = (String) sce.getServletContext().getInitParameter("configLocation");
        //1.加载spring的配置文件
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //2.把spring容器加载到ServletContext
        sce.getServletContext().setAttribute("ctx", ctx);
    }
}
