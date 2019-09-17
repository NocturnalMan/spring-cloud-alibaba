package com.gao.nocturnal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/16 16:20
 * @Description
 */
@RestController
public class ProviderContrller {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @GetMapping("/output/{param}")
    public String output(@PathVariable("param") String param){
        System.out.println(param);
        int serverPort = httpServletRequest.getServerPort();
        return param + "===端口：" + serverPort;
    }
}
