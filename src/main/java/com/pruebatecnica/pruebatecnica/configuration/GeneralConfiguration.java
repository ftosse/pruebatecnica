package com.pruebatecnica.pruebatecnica.configuration;

import com.pruebatecnica.pruebatecnica.bean.MyBeanWithProperties;
import com.pruebatecnica.pruebatecnica.bean.MyBeanWithPropertiesImplement;
import com.pruebatecnica.pruebatecnica.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.lastname}")
    private String lastname;

    @Value("${value.email}")
    private String email;

    @Value("${value.profile}")
    private String profile;

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImplement(name, lastname);
    }
}
