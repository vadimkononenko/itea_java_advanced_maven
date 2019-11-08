package com.itea.homeworks.task6.serdeser;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private String name;
    private String surname;
    private int age;
    private List<String> hobbies;

    public Person() {
    }

    public Person(String name, String surname, int age, List<String> hobbies) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hobbies = hobbies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
