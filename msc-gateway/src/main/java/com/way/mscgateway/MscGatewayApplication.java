package com.way.mscgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MscGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscGatewayApplication.class, args);
    }

}
