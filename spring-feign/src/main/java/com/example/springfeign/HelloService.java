package com.example.springfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "spring-client")
public interface HelloService {
    @RequestMapping(value = "/hello1")
    String hello();
}
