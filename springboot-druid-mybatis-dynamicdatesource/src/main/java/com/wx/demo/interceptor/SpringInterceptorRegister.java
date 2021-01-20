package com.wx.demo.interceptor;


import com.wx.demo.servlet.JackServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *  这个类就是类似于xml里面的拦截器定义
 */

@Configuration
public class SpringInterceptorRegister extends WebMvcConfigurerAdapter {

    /**
     * 配置Interceptor具体的类和过滤路径
     * registry.addInterceptor(new JackInterceptor()).addPathPatterns("/**");
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JackInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Bean
    public ServletRegistrationBean jackServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new JackServlet(),"/jack/*");
        return servletRegistrationBean;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // TODO Auto-generated method stub
        registry.addResourceHandler("/img1/**")
                .addResourceLocations("classpath:/img1/");
        super.addResourceHandlers(registry);
    }

  /*  @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.enableContentNegotiation(new MappingJackson2JsonView());
        registry.jsp("/jsp/", ".jsp");
    }*/
}
