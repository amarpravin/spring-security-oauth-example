//package com.techprimers.security.springsecurityclient.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.web.context.request.RequestContextListener;
//import org.springframework.web.servlet.config.annotation.*;
//
//@EnableWebMvc
//@Configuration
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//        //allow to control webpage which gonna hit
//    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
//
//        registry.addViewController("/")
//                .setViewName("forward:/index");
//
//        registry.addViewController("/index");
//        registry.addViewController("/secure");
//
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**", "/**")
//                .addResourceLocations("/resources/", "/");
//    }
//
//    @Bean
//    public RequestContextListener requestContextListener() {
//        return new RequestContextListener();
//        //need to initialize this so that tomcat list this requestContextListner
//    }
//
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//}
