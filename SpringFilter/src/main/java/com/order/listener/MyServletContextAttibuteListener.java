package com.order.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttibuteListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();
        Object value = servletContextAttributeEvent.getValue();
        Object source = servletContextAttributeEvent.getSource();
        ServletContext servletContext = servletContextAttributeEvent.getServletContext();
        System.out.println("监听sevletContext被添加属性,name:"+name
                +",value:"+value+",source:"+source+",servletContext:"+servletContext);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();
        Object value = servletContextAttributeEvent.getValue();
        Object source = servletContextAttributeEvent.getSource();
        ServletContext servletContext = servletContextAttributeEvent.getServletContext();
        System.out.println("监听sevletContext被删除属性,name:"+name
                +",value:"+value+",source:"+source+",servletContext:"+servletContext);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();
        Object value = servletContextAttributeEvent.getValue();
        Object source = servletContextAttributeEvent.getSource();
        ServletContext servletContext = servletContextAttributeEvent.getServletContext();
        System.out.println("监听sevletContext被替换属性,name:"+name
                +",value:"+value+",source:"+source+",servletContext:"+servletContext);
    }
}
