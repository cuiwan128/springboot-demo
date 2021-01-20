package com.wx.demo.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // WebApplicationContext: initialization completed
        // spring容器启动完成后会调用到listener的这个方法 一般用来初始化资源
        System.out.println("Listener ---> contextInitialized: "+sce.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //extShutdownHook ---> ThreadPoolTaskExecutor
        //Shutting down ExecutorService 'applicationTaskExecutor
        //如果有filter先调用filter的destroy方法
        //tomcat停止会调用这个方法 一般用来释放资源
        System.out.println("Listener ---> contextDestroyed: "+sce.getServletContext());
    }
}
