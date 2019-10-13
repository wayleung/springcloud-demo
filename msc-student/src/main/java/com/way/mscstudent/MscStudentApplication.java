package com.way.mscstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
//druid 是一个servlet 需要让SpingBoot支持servlet 且访问地址是 http://127.0.0.1:8762/druid/ 不是localhost
@ServletComponentScan
public class MscStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscStudentApplication.class, args);
    }

}
