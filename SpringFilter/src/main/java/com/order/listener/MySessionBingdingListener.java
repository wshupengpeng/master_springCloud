package com.order.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class MySessionBingdingListener implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        HttpSession session = httpSessionBindingEvent.getSession();
        System.out.println("监听到session属性绑定，name："+name+",value:"+value
        +",session"+session);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        HttpSession session = httpSessionBindingEvent.getSession();
        System.out.println("监听到session属性解绑，name："+name+",value:"+value
                +",session"+session);
    }
}
