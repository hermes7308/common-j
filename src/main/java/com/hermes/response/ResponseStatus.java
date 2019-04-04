package com.hermes.response;

import org.apache.commons.lang3.StringUtils;

public enum ResponseStatus {
    SUCCESS,
    FAIL,
    ERROR;

    public boolean isSuccess(String success) {
        return SUCCESS.equals(success);
    }

    public boolean isFail(String fail) {
        return FAIL.equals(fail);
    }

    public boolean isError(String error) {
        return ERROR.equals(error);
    }

    private boolean equals(String name) {
        return StringUtils.equalsIgnoreCase(this.name(), name);
    }
}
