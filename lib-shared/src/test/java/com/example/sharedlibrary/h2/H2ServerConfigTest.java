package com.example.sharedlibrary.h2;

import com.example.sharedlibrary.config.TestConfig;
import org.h2.tools.Server;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes = {TestConfig.class})
public class H2ServerConfigTest {

    @Nested
    @TestPropertySource(properties = {"h2.server.enabled=true", "h2.server.port=2500"})
    @DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
    class H2EnabledTests {

        @Autowired
        private ApplicationContext context;

        @Test
        void h2ServerStartsWhenEnabled() throws SQLException {
            // 从上下文中获取 Server bean
            Server h2Server = context.getBean(Server.class);
            assertThat(h2Server).isNotNull();  // 断言H2 Server已启动
            assertThat(h2Server.getPort()).isEqualTo(2500); // 断言端口号为配置的端口
        }
    }

    @Nested
    @TestPropertySource(properties = {"h2.server.enabled=false"})
    @DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
    class H2DisabledTests {

        @Autowired
        private ApplicationContext context;

        @Test
        void h2ServerDoesNotStartWhenDisabled() {
            // 确认 H2 Server 不存在
            assertThat(context.containsBean("inMemoryH2DatabaseServer")).isFalse();
        }
    }
}