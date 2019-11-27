package com.itea.homeworks.task9.converters.structure;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "student")
public class Student {
    private Set<String> name;

    public Student(Set<String> name) {
        this.name = name;
    }
}
