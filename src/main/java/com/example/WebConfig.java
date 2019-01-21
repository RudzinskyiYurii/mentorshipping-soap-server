package com.example;

import com.example.biographysoap.service.impl.DefaultAuthorModelService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

//    @Bean
//    public AuthorModelService getAuthorModelService(){
//        return new DefaultAuthorModelService();
//    }
}
