package com.hermes.util;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ListBuilderTest {
    @Test
    public void testListBuilder() {
        // given
        String message = "Hello";

        // when
        List<String> list = ListBuilder.<String>listBuilder()
                .add(message)
                .build();

        // then
        assertTrue(StringUtils.equals(message, list.get(0)));
    }
}
