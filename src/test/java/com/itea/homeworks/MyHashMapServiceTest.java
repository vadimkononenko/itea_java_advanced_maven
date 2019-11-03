package com.itea.homeworks;

import com.itea.homeworks.collections.hashmap.HashMapG;
import com.itea.homeworks.collections.hashmap.MyHashMapG;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MyHashMapServiceTest {
    private HashMapG<Integer,String> map = new MyHashMapG<>();

    @Test
    public void elementsFromMapShouldBePutCorrectly(){
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        assertEquals("one",map.get(1));
        assertEquals("two",map.get(2));
        assertEquals("three",map.get(3));
        assertEquals("four",map.get(4));
    }

    @Test
    public void elementsFromMapShouldBeRemovedCorrectly(){
        map.put(11,"1");
        map.put(22,"2");
        map.put(33,"3");

        map.remove(11);

        assertNull(map.get(11));
    }

    @Test
    public void mapShouldReturnSizeCorrectly(){
        map.put(123,"CS:GO");
        map.put(321,"DOTA2");

        assertEquals(16,map.size());
    }

    @Test
    public void elementFromMapShouldBeNull(){
        map.put(123,"hello");
        map.put(321,"man");

        map.clear();

        assertNull(map.get(123));
        assertNull(map.get(321));
    }

}
