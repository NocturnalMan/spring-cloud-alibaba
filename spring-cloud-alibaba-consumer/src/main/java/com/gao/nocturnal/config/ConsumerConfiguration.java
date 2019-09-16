package com.gao.nocturnal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/16 22:57
 * @Description 配置类
 */
@Component
public class ConsumerConfiguration {

    @Bean
    public RestTemplate getRest(){
        return new RestTemplate();
    }
}
