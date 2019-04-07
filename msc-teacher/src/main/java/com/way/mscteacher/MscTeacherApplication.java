package com.way.mscteacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MscTeacherApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscTeacherApplication.class, args);
    }

}
