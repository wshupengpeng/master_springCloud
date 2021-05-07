package com.order.controller;


import com.order.listener.MySessionBingdingListener;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class OrderController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setStatus(HttpStatus.METHOD_NOT_ALLOWED.value());
        resp.getWriter().write(new String("服务器不支持post请求".getBytes(),"UTF-8"));
    }

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
//      添加req参数
        req.setAttribute("reqParam","reqValue");
//      添加session 参数
        HttpSession session = req.getSession();
        session.setAttribute("sessionParam","sessionValue");
        session.setMaxInactiveInterval(10);
//        感知session 被绑定事件
        session.setAttribute("event",new MySessionBingdingListener());
//      添加sevletContext参数
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("scParam","scValue");


        resp.getWriter().write("请求成功");
    }

}
