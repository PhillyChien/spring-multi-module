package com.example.sharedlibrary.service;

import com.example.sharedlibrary.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = {TestConfig.class})
public class CommonServiceTest {

    @Autowired
    private CommonService commonService;

    @Test
    public void testGetAdminHello() {
        String result = commonService.getAdminHello();
        assertEquals("Hello from admin", result);
    }

    @Test
    public void testGetClientHello() {
        String result = commonService.getClientHello();
        assertEquals("Hello from user", result);
    }
}
