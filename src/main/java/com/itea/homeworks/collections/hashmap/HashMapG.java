package com.itea.homeworks.collections.hashmap;

public interface HashMapG<K,V> {
    MyHashMapG.Entry get(K key);

    void put(K key, V value);

    void clear();

    void remove(K key);

    int size();
}
