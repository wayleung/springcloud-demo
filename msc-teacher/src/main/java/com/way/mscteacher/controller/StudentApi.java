package com.way.mscteacher.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "msc-student")
public interface StudentApi {

    @GetMapping(value = "hi")
    String hi(@RequestParam(value = "name",defaultValue = "way") String name);
}
