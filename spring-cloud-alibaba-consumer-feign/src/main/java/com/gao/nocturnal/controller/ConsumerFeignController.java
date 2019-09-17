package com.gao.nocturnal.controller;

import com.gao.nocturnal.service.ConsumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/17 9:54
 * @Description
 */
@RestController
public class ConsumerFeignController {

    @Autowired
    private ConsumerFeignService consumerFeignService;

    @GetMapping("/feignOutput/{param}")
    public String feignOutput(@PathVariable String param){
        String output = consumerFeignService.output(param);
        return output;
    }
}
