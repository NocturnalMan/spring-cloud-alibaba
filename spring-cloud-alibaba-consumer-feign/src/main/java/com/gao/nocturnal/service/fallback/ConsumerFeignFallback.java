package com.gao.nocturnal.service.fallback;

import com.gao.nocturnal.service.ConsumerFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/17 14:04
 * @Description 熔断处理类
 */
@Component
public class ConsumerFeignFallback implements ConsumerFeignService {
    @Override
    public String output(String param) {
        return "请求失败，请检查网络";
    }
}
