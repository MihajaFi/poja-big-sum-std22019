package com.hei.school.endpoint.rest.controller.bigsum;

import com.hei.school.service.event.BigSumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {
    private final BigSumService service;

    public BigSumController(BigSumService service) {
        this.service = service;
    }

    @GetMapping("/big-sum")
    public BigInteger add(@RequestParam(name = "a") String a,
                          @RequestParam(name = "b") String b) {
        return service.add(a, b);
    }
}
