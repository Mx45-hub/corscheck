package com.corsapp.corsapplication.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

 @Override
    public void addCorsMappings(CorsRegistry registry) {
       WebMvcConfigurer.super.addCorsMappings(registry);
       registry
       .addMapping("/api/coffee")
       .allowedOrigins("*")
       .allowedMethods("GET", "POST", "PUT", "DELETE");
       //.maxAge(3600)
       //.allowedOrigins("http://localhost:5173", "http://example.com", "http://anotherdomain.com")
       //.allowCredentials(true) auth and allow credentials
       //.allowedHeaders("Authorization", "Cache-Control", "Content-Type")

   }

}
