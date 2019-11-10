package com.itea.homeworks.task6;

import com.itea.homeworks.task6.serialize.SerializeUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import static org.junit.Assert.assertEquals;

public class SerDeserServiceTest {
    private String[] array;
    private List<String> list;
    private Set set;
    private HashMap hashMap;
    private SerializeUtils sd;

    @Before
    public void setUp() {
        sd = new SerializeUtils();
        list = new ArrayList<>();
        set = new HashSet<String>();
        hashMap = new HashMap();
    }

    @Test
    public void shouldSerDeserArrayCorrectly() throws IOException, ClassNotFoundException {
        array = new String[]{"first", "second", "third"};

        sd.serialize(array, "/Users/vadimkononenko/Desktop/task6/SerDeserArray");
        String[] dataDeser = (String[]) sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserArray");

        assertEquals(array[0], dataDeser[0]);
        assertEquals(array[1], dataDeser[1]);
        assertEquals(array[2], dataDeser[2]);
    }

    @Test
    public void shouldSerDeserListCorrectly() throws IOException, ClassNotFoundException {
        list.add("1");
        list.add("2");
        list.add("3");

        sd.serialize(list, "/Users/vadimkononenko/Desktop/task6/SerDeserList");

        assertEquals(list.get(0), ((ArrayList<String>) sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserList"))
                .get(0));
        assertEquals(list.get(1), ((ArrayList<String>) sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserList"))
                .get(1));
        assertEquals(list.get(2), ((ArrayList<String>) sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserList"))
                .get(2));
    }

    @Test
    public void shouldSerDeserSetCorrectly() throws IOException, ClassNotFoundException {
        set.add("first");
        set.add("second");
        set.add("third");

        sd.serialize(set, "/Users/vadimkononenko/Desktop/task6/SerDeserSet");


        assertEquals(set, sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserSet"));
    }

    @Test
    public void shouldSerDeserHashMapCorrectly() throws IOException, ClassNotFoundException {
        hashMap.put("first",1);
        hashMap.put("second",1);
        hashMap.put("third",1);

        sd.serialize(hashMap,"/Users/vadimkononenko/Desktop/task6/SerDeserHashMap");
        HashMap hashMap1 = (HashMap) sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserHashMap");

        assertEquals(hashMap.get("first"),hashMap1.get("first"));
        assertEquals(hashMap.get("second"),hashMap1.get("second"));
        assertEquals(hashMap.get("third"),hashMap1.get("third"));
    }
}
