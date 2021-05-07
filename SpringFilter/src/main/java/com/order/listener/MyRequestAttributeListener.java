package com.order.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyRequestAttributeListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        String name = servletRequestAttributeEvent.getName();
        Object value = servletRequestAttributeEvent.getValue();
        Object source = servletRequestAttributeEvent.getSource();
        ServletRequest servletRequest = servletRequestAttributeEvent.getServletRequest();
        System.out.println("监听request被添加属性,name:"+name
                +",value:"+value+",source:"+source+",servletRequest:"+servletRequest);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        String name = servletRequestAttributeEvent.getName();
        Object value = servletRequestAttributeEvent.getValue();
        Object source = servletRequestAttributeEvent.getSource();
        ServletRequest servletRequest = servletRequestAttributeEvent.getServletRequest();
        System.out.println("监听request删除属性,name:"+name
                +",value:"+value+",source:"+source+",servletRequest:"+servletRequest);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        String name = servletRequestAttributeEvent.getName();
        Object value = servletRequestAttributeEvent.getValue();
        Object source = servletRequestAttributeEvent.getSource();
        ServletRequest servletRequest = servletRequestAttributeEvent.getServletRequest();
        System.out.println("监听request替换属性,name:"+name
                +",value:"+value+",source:"+source+",servletRequest:"+servletRequest);
    }
}
