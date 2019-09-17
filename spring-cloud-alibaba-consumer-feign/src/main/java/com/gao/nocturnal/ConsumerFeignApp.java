package com.gao.nocturnal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/17 9:49
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApp.class, args);
    }
}
