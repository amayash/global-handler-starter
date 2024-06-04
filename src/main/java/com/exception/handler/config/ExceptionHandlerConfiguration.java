package com.exception.handler.config;

import com.exception.handler.error.AdviceController;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Настройка глобального обработчика исключений.
 */
@AutoConfiguration
@Configuration
public class ExceptionHandlerConfiguration {
    /**
     * Бин глобального обработчика исключений.
     */
    @Bean
    public AdviceController globalExceptionHandler() {
        return new AdviceController();
    }
}
