package com.itea.homeworks.task9.converters.tojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itea.homeworks.task9.converters.structure.StudentsFacultyList;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class ServiceJson {
    private static Logger log = Logger.getLogger(ServiceJson.class);

    public void convertToJson(StudentsFacultyList list) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("/Users/vadimkononenko/Desktop/Structure.json"), list);
        } catch (IOException e) {
            log.error(e);
        }
    }

    public void convertJsonToList() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            StudentsFacultyList list = mapper.readValue(new File("/Users/vadimkononenko/Desktop/Structure.json"), StudentsFacultyList.class);
        } catch (IOException e) {
            log.error(e);
        }
    }
}
