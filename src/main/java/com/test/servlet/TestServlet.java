package com.test.servlet;

import com.test.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhang_htao on 2019/8/13.
 */
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) servletContext.getAttribute("ctx");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
