package com.itea.homeworks.collections.hashmap;

public interface HashMapG<K,V> {
    Object get(K key);

    boolean put(K key, V value);

    void clear();

    void remove(K key);

    int size();
}
