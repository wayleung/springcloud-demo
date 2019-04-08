package com.way.mscstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MscStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscStudentApplication.class, args);
    }

}
