package com.hermes.util;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapBuilderTest {
    @Test
    public void testMapBuilder() {
        // given
        String strKey = "strKey";
        String strValue = "strValue";

        // when
        Map<String, String> result = MapBuilder.<String, String>mapBuilder()
                .put(strKey, strValue)
                .build();

        // then
        assertEquals(strValue, result.get(strKey));
    }
}
