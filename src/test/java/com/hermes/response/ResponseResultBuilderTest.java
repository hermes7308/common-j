package com.hermes.response;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ResponseResultBuilderTest {
    @Test
    public void testIsSuccess() {
        // given

        // when
        Map<String, Object> result = ResponseResultBuilder.success()
                .build();

        ResponseStatus responseStatus = (ResponseStatus) result.get(ResponseResultBuilder.STATUS);

        // then
        assertTrue(responseStatus.isSuccess());
    }

    @Test
    public void testIsFail() {
        // given

        // when
        Map<String, Object> result = ResponseResultBuilder.fail()
                .build();

        ResponseStatus responseStatus = (ResponseStatus) result.get(ResponseResultBuilder.STATUS);

        // then
        assertTrue(responseStatus.isFail());
    }

    @Test
    public void testIsError() {
        // given

        // when
        Map<String, Object> result = ResponseResultBuilder.error()
                .build();

        ResponseStatus responseStatus = (ResponseStatus) result.get(ResponseResultBuilder.STATUS);

        // then
        assertTrue(responseStatus.isError());
    }

    @Test
    public void testMessage() {
        // given
        String message = "This is Error";
        int errorCode = 404;

        // when
        Map<String, Object> result = ResponseResultBuilder.error()
                .message(message)
                .put("errorCode", errorCode)
                .build();

        // then
        assertEquals(message, result.get(ResponseResultBuilder.MESSAGE));
        assertEquals(errorCode, result.get("errorCode"));
    }

    @Test
    public void testEquals() {
        // given
        ResponseStatus success = ResponseStatus.SUCCESS;

        // when
        boolean result = success.equals("SUCCESS");

        // then
        assertTrue(result);
    }
}
