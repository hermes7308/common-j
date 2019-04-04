package com.hermes.response;

import org.apache.commons.lang3.StringUtils;

public enum ResponseStatus {
    SUCCESS,
    FAIL,
    ERROR;

    public boolean isSuccess() {
        return this == SUCCESS;
    }

    public boolean isFail() {
        return this == FAIL;
    }

    public boolean isError() {
        return this == ERROR;
    }

    public boolean equals(String name) {
        return StringUtils.equalsIgnoreCase(this.name(), name);
    }
}
