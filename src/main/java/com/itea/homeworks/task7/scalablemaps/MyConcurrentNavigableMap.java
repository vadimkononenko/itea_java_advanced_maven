package com.itea.homeworks.task7.scalablemaps;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MyConcurrentNavigableMap {
    public static void main(String[] args) {
        ConcurrentNavigableMap cnm = new ConcurrentSkipListMap();
        cnm.put("1", 1);
        cnm.put("2", 2);
        cnm.put("3", 3);
        cnm.put("4", 4);

        cnm.descendingKeySet();
        cnm.descendingMap();
        cnm.headMap(4);
        cnm.keySet();
        cnm.subMap(2, 4);
        cnm.tailMap(2);
    }
}
