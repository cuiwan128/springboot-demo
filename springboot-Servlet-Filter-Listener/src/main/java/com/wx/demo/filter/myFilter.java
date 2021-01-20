package com.wx.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class myFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //listener --->contextInitialized之后调用过滤器的init方法
        System.out.println("Filter ---> init： "+filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter ---> doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        //Shutting down ExecutorService 'applicationTaskExecutor'
        //早于 listener--->contextDestroyed的方法调用
        System.out.println("Filter ---> destroy");
    }
}
