package com.lyh;

import com.lyh.servlet.VerifyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author shenhj
 * @version 1.0.0
 * @date 2019/10/19 16:21
 */
@SpringBootApplication
public class Application04 {
    public static void main(String[] args) {
        SpringApplication.run(Application04.class, args);
    }

    /**
     * 注入验证码servlet
     */
    @Bean
    public ServletRegistrationBean indexServletRegistration(){
        ServletRegistrationBean registration = new ServletRegistrationBean(new VerifyServlet());
        registration.addUrlMappings("/getVerifyCode");
        return registration;
    }

}
