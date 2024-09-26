package com.example.sharedlibrary.service;

import org.springframework.stereotype.Service;

@Service
public class CommonService {
    public String getAdminHello() {
        return "Hello from admin";
    }

    public String getClientHello() {
        return "Hello from user";
    }
}
