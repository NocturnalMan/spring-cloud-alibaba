package com.gao.nocturnal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/17 11:01
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApp7002 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp7002.class, args);
    }
}

