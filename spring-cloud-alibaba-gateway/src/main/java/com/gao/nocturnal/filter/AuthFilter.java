package com.gao.nocturnal.filter;

import com.alibaba.nacos.client.utils.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author NocturnalGao
 * @Project spring-cloud-alibaba
 * @Time 2019/9/17 16:45
 * @Description
 */
@Component
public class AuthFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String token = request.getQueryParams().getFirst("token");

        if(StringUtils.isBlank(token)){
            ServerHttpResponse response = exchange.getResponse();
            Map<String, String> responseDate = new HashMap<>();
            responseDate.put("code", "401");
            responseDate.put("msg", "非法请求");
            responseDate.put("cause", "Token is empty");
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                byte[] bytes = objectMapper.writeValueAsBytes(responseDate);
                DataBuffer dataBuffer = response.bufferFactory().wrap(bytes);
                response.setStatusCode(HttpStatus.UNAUTHORIZED);
                response.getHeaders().add("Content-Type", "application/json;charset=utf-8");
                return response.writeWith(Mono.just(dataBuffer));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
