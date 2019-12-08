package com.itea.homeworks.task9.converters.structure;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

@XmlRootElement(name = "studentFaculty")
public class StudentsFaculty {
    private Map<StudentGroup,String> faculty;

    public StudentsFaculty(Map<StudentGroup, String> faculty) {
        this.faculty = faculty;
    }
}
