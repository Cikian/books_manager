package com.cikian.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.cikian.controller", "com.cikian.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
