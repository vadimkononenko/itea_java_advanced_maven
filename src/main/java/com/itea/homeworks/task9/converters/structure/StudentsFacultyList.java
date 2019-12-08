package com.itea.homeworks.task9.converters.structure;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@NoArgsConstructor
@XmlRootElement(name = "studentFacultyList")
public class StudentsFacultyList {
    private List<StudentsFaculty> list;

    public StudentsFacultyList(List<StudentsFaculty> list) {
        this.list = list;
    }
}
