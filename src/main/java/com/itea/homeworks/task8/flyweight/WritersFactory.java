package com.itea.homeworks.task8.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WritersFactory {
    private static Map<String, Writer> writers;

    public WritersFactory() {
        writers = new HashMap<>();
    }

    public Writer getWriter(String key) {
        Writer writer = writers.get(key);

        if (writer == null) {
            switch (key) {
                case "student":
                    System.out.println("Added student");
                    writer = new Student();
                    break;
                case "worker":
                    System.out.println("Added worker");
                    writer = new Worker();
                    break;
                default:
                    throw new RuntimeException("Writer is unknown");
            }
            writers.put(key, writer);
        }

        return writer;
    }
}
