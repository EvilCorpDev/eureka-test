package com.test.ribbonserver;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("server")
@RequiredArgsConstructor
public class MyController {

    private final TestFeignClient testFeignClient;

    @GetMapping
    public String getTextFromFeign() {
        return testFeignClient.getSomeText();
    }

}
