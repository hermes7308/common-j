package com.hermes.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseResultBuilder {
    private Map<String, Object> apiResult;

    private ResponseResultBuilder(String key, ResponseStatus status) {
        apiResult = new HashMap<>();
        apiResult.put(key, status);
    }

    public static ResponseResultBuilder success() {
        return new ResponseResultBuilder("status", ResponseStatus.SUCCESS);
    }

    public static ResponseResultBuilder fail() {
        return new ResponseResultBuilder("status", ResponseStatus.FAIL);
    }

    public static ResponseResultBuilder error() {
        return new ResponseResultBuilder("status", ResponseStatus.ERROR);
    }

    public ResponseResultBuilder message(String message) {
        apiResult.put("message", message);
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