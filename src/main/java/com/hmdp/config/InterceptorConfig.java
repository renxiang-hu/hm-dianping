package com.hmdp.config;

import com.hmdp.utils.SampleInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private SampleInterceptor sampleInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(sampleInterceptor)
                .addPathPatterns("/**").excludePathPatterns("/**/LoginController/**/","/**/error")
                .excludePathPatterns("/error");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
