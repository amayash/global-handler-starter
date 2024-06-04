package com.exception.handler;

import com.exception.handler.config.ExceptionHandlerConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HandlerApplicationTests {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(ExceptionHandlerConfiguration.class));

    @Test
    void shouldContainAdviceControllerBean() {
        contextRunner.run(context -> assertTrue(context.containsBean("globalExceptionHandler")));
    }
}
