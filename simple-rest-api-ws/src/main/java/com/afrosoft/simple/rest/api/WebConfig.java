package com.afrosoft.simple.rest.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.afrosoft.simple.rest")
@EnableWebMvc
public class WebConfig {
}
