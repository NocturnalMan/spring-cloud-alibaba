package com.gao.nocturnal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/16 22:59
 * @Description 服务消费方Controller
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hello/{param}")
    public String hello(@PathVariable String param){
        ServiceInstance instance = loadBalancerClient.choose("cloud-provider");
        String url = String.format("http://%s:%s/output/%s", instance.getHost(), instance.getPort(), param);
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}
