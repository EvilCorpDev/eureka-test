package com.test.ribbonserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("client")
public interface TestFeignClient {

    @GetMapping("/test")
    String getSomeText();
}
