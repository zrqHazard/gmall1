package com.zrq.gmall.web.pms.vo;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
@Slf4j
public class MyListner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.debug("容器创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.debug("容器销毁");
    }
}
