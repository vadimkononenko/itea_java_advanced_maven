package com.itea.homeworks.task6;

import com.itea.homeworks.task6.serdeser.Person;
import com.itea.homeworks.task6.serdeser.SerDeser;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonSerDeserServiceTest {
    private Person person;
    private SerDeser sd;

    @Before
    public void setUp() {
        person = new Person();
        sd = new SerDeser();
    }

    @Test
    public void shouldSerializeDeserializeFieldsCorrectly() throws IOException, ClassNotFoundException {
        person.setName("Vadim");
        person.setSurname("Kononenko");
        person.setAge(18);
        person.setHobbies(Arrays.asList("football", "programming"));

        sd.serialization(person,"/Users/vadimkononenko/Desktop/task6/Task6");
        Person person1 = (Person) sd.deserialization("/Users/vadimkononenko/Desktop/task6/Task6");

        assertEquals(person.getName(),person1.getName());
        assertEquals(person.getSurname(),person1.getSurname());
        assertEquals(person.getAge(),person1.getAge());
        assertEquals(person.getHobbies(),person1.getHobbies());
    }
}
