package com.example.weatherapp.Entity;

import org.springframework.stereotype.Component;

@Component
public class ResponseEntity {
    private Object result;
    private Integer status;
    private String message;

    public ResponseEntity ok(Object obj, String... message) {
        this.updateResultAndStatusAndMessage(obj, 200, message);
        return this;
    }

    public ResponseEntity serverError(Object obj, String... message) {
        this.updateResultAndStatusAndMessage(obj, 500, message);
        return this;
    }

    public ResponseEntity notFoundError(Object obj, String... message) {
        this.updateResultAndStatusAndMessage(obj, 404, message);
        return this;
    }

    public void updateResultAndStatusAndMessage(Object obj, Integer status, String... message) {
        this.setResult(obj);
        this.setStatus(status);
        if(message.length > 0) {
            this.setMessage(message[0]);
        }
        else {
            this.setMessage("Success");
        }
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
