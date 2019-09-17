package com.gao.nocturnal.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/17 9:52
 * @Description
 */
@FeignClient(value = "cloud-provider")
public interface ConsumerFeignService {

    @GetMapping("/output/{param}")
    public String output(@PathVariable("param") String param);
}
