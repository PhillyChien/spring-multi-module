package com.example.admin.controller;

import com.example.sharedlibrary.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final CommonService commonService;

    @Autowired
    public HelloController(CommonService commonService) {
        this.commonService = commonService;
    }


    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(String.format("Hello: %s", commonService.getAdminHello()));
    }
}
