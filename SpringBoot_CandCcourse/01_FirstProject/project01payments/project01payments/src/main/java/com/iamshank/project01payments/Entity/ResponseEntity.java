package com.iamshank.project01payments.Entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ResponseEntity {
    private Object result;
    private Integer status;
    private String message;

    public ResponseEntity ok(Object obj, String... message) {
        this.setStatus(200);
        if(message.length > 0) {
            this.setMessage(message[0]);
        }
        else {
            this.setMessage("Success");
        }
        this.setResult(obj);
        return this;
    }

    public ResponseEntity serverError(Object... obj) {
        this.setStatus(500);
        if(obj.length > 0) {
            this.setResult(obj[0]);
        }
        this.setMessage("Server Error");
        return this;
    }

    public ResponseEntity notFoundError(Object... obj) {
        this.setStatus(404);
        if(obj.length > 0) {
            this.setResult(obj[0]);
        }
        this.setMessage("Error : Not Found");
        return this;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
