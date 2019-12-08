package com.itea.homeworks.task9.converters;

import com.itea.homeworks.task9.converters.structure.Student;
import com.itea.homeworks.task9.converters.structure.StudentGroup;
import com.itea.homeworks.task9.converters.structure.StudentsFaculty;
import com.itea.homeworks.task9.converters.structure.StudentsFacultyList;
import com.itea.homeworks.task9.converters.tojson.ServiceJson;
import com.itea.homeworks.task9.converters.toxml.ServiceXml;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        ServiceJson serviceJson = new ServiceJson();
        serviceJson.convertToJson(create());
        serviceJson.convertJsonToList();

        ServiceXml serviceXml = new ServiceXml();
        serviceXml.convertToXml(create());
        serviceXml.convertXmlToList();
    }

    public static StudentsFacultyList create() {
        Set students = new HashSet();
        students.add("Ivan");
        students.add("Oleh");
        Student student = new Student(students);

        List group = new ArrayList<>();
        group.add(student);
        StudentGroup studentGroup = new StudentGroup(group);

        Map faculty = new HashMap();
        faculty.put(1,"FEA");
        faculty.put(2,"FTI");
        StudentsFaculty studentsFaculty = new StudentsFaculty(faculty);

        List fList = new ArrayList();
        fList.add(faculty);
        StudentsFacultyList studentsFacultyList = new StudentsFacultyList(fList);

        return studentsFacultyList;
    }
}
