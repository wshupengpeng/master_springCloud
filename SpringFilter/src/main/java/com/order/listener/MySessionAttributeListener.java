package com.order.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        Object source = httpSessionBindingEvent.getSource();
        HttpSession session = httpSessionBindingEvent.getSession();
        System.out.println("监听session新增属性,name:"+name
                +",value:"+value+",source:"+source+",session:"+session);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        Object source = httpSessionBindingEvent.getSource();
        HttpSession session = httpSessionBindingEvent.getSession();
        System.out.println("监听session删除属性,name:"+name
                +",value:"+value+",source:"+source+",session:"+session);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        Object source = httpSessionBindingEvent.getSource();
        HttpSession session = httpSessionBindingEvent.getSession();
        System.out.println("监听session替换属性,name:"+name
                +",value:"+value+",source:"+source+",session:"+session);
    }
}
