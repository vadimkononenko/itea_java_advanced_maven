package com.itea.homeworks.task9.converters.toxml;

import com.itea.homeworks.task9.converters.structure.StudentsFacultyList;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ServiceXml {
    private static Logger log = Logger.getLogger(ServiceXml.class);

    public void convertToXml(StudentsFacultyList list){
        try {
            JAXBContext context = JAXBContext.newInstance(StudentsFacultyList.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(list, new FileOutputStream("/Users/vadimkononenko/Desktop/Students.xml"));
        } catch (JAXBException | FileNotFoundException e) {
            log.error(e);
        }
    }

    public void convertXmlToList(){
        try {
            JAXBContext context = JAXBContext.newInstance(StudentsFacultyList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StudentsFacultyList list = (StudentsFacultyList) unmarshaller.unmarshal(new File("/Users/vadimkononenko/Desktop/Students.xml"));
        } catch (JAXBException e) {
            log.error(e);
        }
    }
}
