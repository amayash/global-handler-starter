package com.exception.handler.error;

import java.time.LocalDateTime;

/**
 * Класс, представляющий детали ошибки.
 * Используется для хранения информации об ошибке.
 */
public class ErrorDetails {
    /**
     * Класс, в котором произошла ошибка.
     */
    private String className;

    /**
     * Имя исключения, которое было выброшено.
     */
    private String exceptionName;

    /**
     * Сообщение об ошибке.
     */
    private String message;

    /**
     * Время, когда возникла ошибка.
     */
    private LocalDateTime time;

    public ErrorDetails() {
    }

    public ErrorDetails(String className, String exceptionName, String message, LocalDateTime time) {
        this.className = className;
        this.exceptionName = exceptionName;
        this.message = message;
        this.time = time;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getExceptionName() {
        return exceptionName;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
