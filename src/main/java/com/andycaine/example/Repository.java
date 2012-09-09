package com.andycaine.example;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.Collection;

public class Repository<T> {

    private Collection<T> items = new ArrayList<T>();

    public void deleteAll() {
        items.clear();
    }

    public void store(T item) {
        items.add(item);
    }

    public T findFirst() {
        return items.iterator().next();
    }

    public T find(Predicate<T> predicate) {
        return Iterables.find(items, predicate);
    }

}
