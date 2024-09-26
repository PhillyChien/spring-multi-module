package com.example.sharedlibrary.h2;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Configuration
public class H2ServerConfig {

    @Value("${h2.server.port:9090}")
    private String h2ServerPort;

    @Bean(initMethod = "start", destroyMethod = "stop")
    @ConditionalOnProperty(name = "h2.server.enabled", havingValue = "true", matchIfMissing = false)
    public Server inMemoryH2DatabaseServer() throws SQLException {
        System.out.println("Starting H2 Server on port " + h2ServerPort);
        return Server.createTcpServer(
                "-tcp", "-tcpAllowOthers", "-tcpPort", h2ServerPort);
    }
}