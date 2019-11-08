package com.itea.homeworks.task6;

import com.itea.homeworks.task6.immutableStudent.Student;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ImmutableServiceTest {

    @Test
    public void ClassShouldBeImmutable() {
        String name = "Vadim";

        List<String> hobbies = Arrays.asList("football","programming");

        List<String> lessonsArrears = Arrays.asList("ТОЕ","ТВЕ");

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("ТОЕ", 30);
        marks.put("ФП", 90);

        HashMap<String, Integer> examsOrder = new HashMap<>();
        examsOrder.put("КИТ", 1);
        examsOrder.put("ТОЕ", 2);
        examsOrder.put("Вышмат", 3);

        Student student = new Student(name, hobbies, lessonsArrears, marks, examsOrder);

        name = "Unknown";
        hobbies = Arrays.asList("added");
        lessonsArrears = Arrays.asList("added");
        marks.put("Added",100);
        examsOrder.put("Added",200);

        assertEquals("Vadim", student.getName());
        assertEquals(Arrays.asList("football","programming"),student.getHobbies());
        assertEquals(Arrays.asList("ТОЕ","ТВЕ"),student.getLessonsArrears());
        assertEquals(marks,student.getMarks());
        assertEquals(examsOrder,student.getExamsOrder());
    }

}
