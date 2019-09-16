package com.gao.nocturnal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/16 16:20
 * @Description
 */
@RestController
public class ProviderContrller {

    @GetMapping("/output/{param}")
    public String output(@PathVariable("param") String param){
        System.out.println(param);
        return param;
    }
}
