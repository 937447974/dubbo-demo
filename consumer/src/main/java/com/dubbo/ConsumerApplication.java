package com.dubbo;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Configuration
@SpringBootApplication
@EnableAsync(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.dubbo.**"})
@DubboComponentScan(basePackages = {"com.dubbo.**"})
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }



}
