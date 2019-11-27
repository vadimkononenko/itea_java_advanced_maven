package com.itea.homeworks.task9.converters.structure;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "studentGroup")
public class StudentGroup {
    private List<Student> list;

    public StudentGroup(List<Student> list) {
        this.list = list;
    }
}
