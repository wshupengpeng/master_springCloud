package com.order.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class MySessionActivationListener implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        Object source = httpSessionEvent.getSource();
        System.out.println("监听session钝化,session"+session+",source"+source);
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        Object source = httpSessionEvent.getSource();
        System.out.println("监听session活化,session"+session+",source"+source);
    }
}
