package com.test.eurekaclient;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    @GetMapping()
    public String getSomeText(@Value("${local.server.port}") int port) throws UnknownHostException {
        return String.format("Client on host: %s on port: %d", InetAddress.getLocalHost().getHostName(), port);
    }
}
