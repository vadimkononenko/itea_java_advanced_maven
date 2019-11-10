package com.itea.homeworks.task6;

import com.itea.homeworks.task6.serialize.SerializeUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;


import static org.junit.Assert.assertEquals;

public class SerializeUtilsServiceTest {
    private String[] array;
    private List<String> list;
    private Set set;
    private Map<String, Integer> map;
    private SerializeUtils sd;

    @Before
    public void setUp() {
        sd = new SerializeUtils();
        list = new ArrayList<>();
        set = new HashSet<String>();
        map = new HashMap();
    }

    @Test
    public void shouldSerializeArrayCorrectly() {
        array = new String[]{"first", "second", "third"};

        sd.serialize(array, "/Users/vadimkononenko/Desktop/task6/SerDeserArray");
        String[] dataDeser = (String[]) sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserArray");

        assertEquals(array[0], dataDeser[0]);
        assertEquals(array[1], dataDeser[1]);
        assertEquals(array[2], dataDeser[2]);
    }

    @Test
    public void shouldSerializeListCorrectly() {
        list.add("1");
        list.add("2");
        list.add("3");

        sd.serialize(list, "/Users/vadimkononenko/Desktop/task6/SerDeserList");
        ArrayList<String> deserialize = (ArrayList<String>) sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserList");

        assertEquals(list.get(0), (deserialize.get(0)));
        assertEquals(list.get(1), (deserialize.get(1)));
        assertEquals(list.get(2), (deserialize.get(2)));
    }

    @Test
    public void shouldSerializeSetCorrectly() {
        set.add("first");
        set.add("second");
        set.add("third");

        sd.serialize(set, "/Users/vadimkononenko/Desktop/task6/SerDeserSet");

        assertEquals(set, sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserSet"));
    }

    @Test
    public void shouldSerializeHashMapCorrectly() {
        map.put("first", 1);
        map.put("second", 1);
        map.put("third", 1);

        sd.serialize(map, "/Users/vadimkononenko/Desktop/task6/SerDeserHashMap");
        HashMap hashMap1 = (HashMap) sd.deserialize("/Users/vadimkononenko/Desktop/task6/SerDeserHashMap");

        assertEquals(map.get("first"), hashMap1.get("first"));
        assertEquals(map.get("second"), hashMap1.get("second"));
        assertEquals(map.get("third"), hashMap1.get("third"));
    }
}
