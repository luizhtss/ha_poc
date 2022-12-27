package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

import java.util.Random;
import java.util.UUID;

@RestController
public class ContainerInfoController {

    private static final String uuidString = UUID.randomUUID().toString();

    @GetMapping("/container_info")
    public ContainerInfo getContainerInfo() throws Exception {
        System.out.println("Respondendo requisição. UUID do container: " + uuidString);
        return new ContainerInfo(uuidString);
    }
}
