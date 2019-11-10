package com.itea.homeworks.task6;

import com.itea.homeworks.task6.immutableStudent.Student;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ImmutableServiceTest {

    @Test
    public void classShouldBeImmutable() {
        String name = "Vadim";

        List<String> hobbies = Arrays.asList("football", "programming");

        List<String> lessonsArrears = Arrays.asList("bhjvcx", "ll");

        Map<String, Integer> marks = new HashMap<>();
        marks.put("fg", 30);
        marks.put("sdf", 90);

        Map<String, Integer> examsOrder = new HashMap<>();
        examsOrder.put("ty", 1);
        examsOrder.put("kl", 2);
        examsOrder.put("nbcv", 3);

        Student student = new Student(name, hobbies, lessonsArrears, marks, examsOrder);

        name = "Unknown";
        hobbies = Arrays.asList("added");
        lessonsArrears = Arrays.asList("added");
        marks.put("Added", 100);
        examsOrder.put("Added", 200);

        assertEquals("Vadim", student.getName());
        assertEquals(Arrays.asList("football", "programming"), student.getHobbies());
        assertEquals(Arrays.asList("bhjvcx", "ll"), student.getLessons());
        assertEquals(marks, student.getMarks());
        assertEquals(examsOrder, student.getExamsOrder());
    }

}
