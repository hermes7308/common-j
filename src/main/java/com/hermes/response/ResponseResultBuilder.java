package com.hermes.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseResultBuilder {

    public static final String STATUS = "status";
    public static final String MESSAGE = "message";
    public static final String EXCEPTION = "exception";
    public static final String RESULT = "result";
    private Map<String, Object> apiResult;

    private ResponseResultBuilder(String key, ResponseStatus status) {
        apiResult = new HashMap<>();
        apiResult.put(key, status);
    }

    public static ResponseResultBuilder success() {
        return new ResponseResultBuilder(STATUS, ResponseStatus.SUCCESS);
    }

    public static ResponseResultBuilder fail() {
        return new ResponseResultBuilder(STATUS, ResponseStatus.FAIL);
    }

    public static ResponseResultBuilder error() {
        return new ResponseResultBuilder(STATUS, ResponseStatus.ERROR);
    }

    public ResponseResultBuilder message(String message) {
        apiResult.put(MESSAGE, message);
        return this;
    }

    public ResponseResultBuilder exception(Exception exception) {
        apiResult.put(EXCEPTION, exception);
        return this;
    }

    public ResponseResultBuilder result(Map<String, Object> result) {
        apiResult.put(RESULT, result);
        return this;
    }

    public ResponseResultBuilder put(String key, Object value) {
        apiResult.put(key, value);
        return this;
    }

    public Map<String, Object> build() {
        return apiResult;
    }

}