package com.way.mscteacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//druid 是一个servlet 需要让SpingBoot支持servlet 且访问地址是 http://127.0.0.1:8762/druid/ 不是localhost
@ServletComponentScan
public class MscTeacherApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscTeacherApplication.class, args);
    }

    @Bean
    @LoadBalanced
//    @LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
    RestTemplate getRestemplate(){
        return new RestTemplate();
    }
}
