package com.example.client.controller;

import com.example.sharedlibrary.service.CommonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final CommonService commonService;

    public HelloController(CommonService commonService) {
        this.commonService = commonService;
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(String.format("Hello: %s", commonService.getClientHello()));
    }
}
