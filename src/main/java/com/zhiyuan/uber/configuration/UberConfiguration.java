package com.zhiyuan.uber.configuration;

import com.zhiyuan.uber.account.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Configuration File
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.zhiyuan.uber")
public class UberConfiguration {

    @Bean
    public Account createAccount(){
        Account bean = new Account();
        bean.setId(1);
        bean.setUsername("Zhiyuan");
        return bean;
    }
}
