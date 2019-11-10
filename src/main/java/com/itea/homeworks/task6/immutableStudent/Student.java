package com.itea.homeworks.task6.immutableStudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Student {
    private final String name;
    private final List<String> hobbies;
    private final List<String> lessons;
    private final Map<String, Integer> marks;
    private final Map<String, Integer> examsOrder;

    public Student(String name, List<String> hobbies, List<String> lessonArrears, Map<String, Integer> marks, Map<String, Integer> exams) {
        this.name = name;
        this.hobbies = hobbies;
        this.lessons = lessonArrears;
        this.marks = marks;
        this.examsOrder = exams;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        List<String> newHobbies = new ArrayList<>(hobbies.size());
        for(String s : hobbies){
            //newHobbies.add(hobbies.clone());
        }
        return newHobbies;
    }

    public List<String> getLessons() {
        List<String> newLessons = new ArrayList<>(lessons.size());
        for(String s : lessons){
            //newLessons.add(lessons.clone());
        }
        return newLessons;
    }

    public HashMap<String, Integer> getMarks() {
        Map<String, Integer> newMarks = new HashMap<>(marks.size());
        for(Map.Entry<String,Integer> m : marks.entrySet()){
            //newMarks.put(m.getKey(),m.getValue().clone());
        }
        return (HashMap<String, Integer>) newMarks;
    }

    public HashMap<String, Integer> getExamsOrder() {
        Map<String, Integer> newOrder = new HashMap<>(examsOrder.size());
        for(Map.Entry<String,Integer> m : examsOrder.entrySet()){
            //newOrder.put(m.getKey(),m.getValue().clone());
        }
        return (HashMap<String, Integer>) newOrder;
    }
}
