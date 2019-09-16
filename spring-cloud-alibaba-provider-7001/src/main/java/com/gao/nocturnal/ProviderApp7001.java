package com.gao.nocturnal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/16 16:12
 * @Description 服务提供方启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApp7001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp7001.class, args);
    }
}
