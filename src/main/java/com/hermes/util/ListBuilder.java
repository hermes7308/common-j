package com.hermes.util;

import java.util.ArrayList;
import java.util.List;

public class ListBuilder<T> {
    private List<T> list = new ArrayList<>();

    public static <T> ListBuilder<T> listBuilder() {
        return new ListBuilder<T>();
    }

    public ListBuilder<T> add(T item) {
        list.add(item);
        return this;
    }

    public List<T> build() {
        return this.list;
    }
}
