package com.itea.homeworks.task6.immutableStudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class Student {
    private final String name;
    private final List<String> hobbies;
    private final List<String> lessonsArrears;
    private final HashMap<String, Integer> marks;
    private final HashMap<String, Integer> examsOrder;

    public Student(String name, List<String> hobbies, List<String> lessonArrears, HashMap<String, Integer> marks, HashMap<String, Integer> exams) {
        this.name = name;
        this.hobbies = hobbies;
        this.lessonsArrears = lessonArrears;
        this.marks = marks;
        this.examsOrder = exams;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    public List<String> getLessonsArrears() {
        return new ArrayList<>(lessonsArrears);
    }

    public HashMap<String, Integer> getMarks() {
        return (HashMap<String, Integer>) marks.clone();
    }

    public HashMap<String, Integer> getExamsOrder() {
        return (HashMap<String, Integer>) examsOrder.clone();
    }
}
