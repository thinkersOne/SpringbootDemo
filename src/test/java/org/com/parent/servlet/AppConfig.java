package org.com.parent.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot整合Servlet   启动Servlet时需要进行扫描
 */
//@SpringBootApplication
//@ServletComponentScan
public class AppConfig {
    //该方法等价于在TestServlet上面加上@WebServlet+@ServletComponentScan  SpringBoot注册，即将其注册到spring容器中
    @Bean
    public ServletRegistrationBean testServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new TestServlet());
        servletRegistrationBean.addUrlMappings("testServlet");
        return servletRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean testFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new TestFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
    @Bean
    public ServletListenerRegistrationBean<TestListener> testListener(){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new TestListener());
        return servletListenerRegistrationBean;
    }
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class,args);
    }
}
