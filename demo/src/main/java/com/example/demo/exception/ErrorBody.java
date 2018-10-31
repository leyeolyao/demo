package com.example.demo.exception;

import java.io.Serializable;

public class ErrorBody implements Serializable {
    private Integer code;
    private String message;
    private long timestamp = System.currentTimeMillis();

    // get set
    @Override
    public String toString() {
        return "ErrorBody{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

}
