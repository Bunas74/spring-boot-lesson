package com.dmdev.springboot.lesson.config;

import com.dmdev.springboot.lesson.conditional.FirstConditional;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Conditional(FirstConditional.class)
@Configuration
public class ApplicationConfiguration {

    @PostConstruct
    public void init() {

        log.warn("app is loaded!!!");
    }
}
