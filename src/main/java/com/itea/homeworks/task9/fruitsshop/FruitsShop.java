package com.itea.homeworks.task9.fruitsshop;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FruitsShop {
    private static Logger log = Logger.getLogger(FruitsShop.class);

    private List<Fruits> fruits;

    public FruitsShop() {
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruits fruit) {
        this.fruits.add(fruit);
    }

    public void addFruits(String pathToJsonFile) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<Fruits> fruitsFile = (List<Fruits>) objectMapper.readValue(new File(pathToJsonFile), Fruits.class);
            fruits.addAll(fruitsFile);
        } catch (IOException e) {
            log.error(e);
        }
    }

    public void save(String pathToJsonFile) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File(pathToJsonFile), fruits);
        } catch (IOException e) {
            log.error(e);
        }
    }

    public void load(String pathToJsonFile) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            fruits = objectMapper.readValue(new File(pathToJsonFile), fruits.getClass());
        } catch (IOException e) {
            log.error(e);
        }
    }
}
