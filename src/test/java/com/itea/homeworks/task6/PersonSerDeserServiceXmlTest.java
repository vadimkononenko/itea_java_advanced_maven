package com.itea.homeworks.task6;

import com.itea.homeworks.task6.serialize.Person;
import com.itea.homeworks.task6.serialize.SerializeUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonSerDeserServiceXmlTest {
    private Person person;
    private SerializeUtils sd;

    @Before
    public void setUp() {
        person = new Person();
        sd = new SerializeUtils();
    }

    @Test
    public void shouldSerializeDeserializeFieldsCorrectly() throws IOException, ClassNotFoundException {
        person.setName("Vadim");
        person.setSurname("Kononenko");
        person.setAge(18);
        person.setHobbies(Arrays.asList("football", "programming"));

        sd.serialize(person,"/Users/vadimkononenko/Desktop/task6/Task6");
        Person person1 = (Person) sd.deserialize("/Users/vadimkononenko/Desktop/task6/Task6");

        assertEquals(person.getName(),person1.getName());
        assertEquals(person.getSurname(),person1.getSurname());
        assertEquals(person.getAge(),person1.getAge());
        assertEquals(person.getHobbies(),person1.getHobbies());
    }
}
