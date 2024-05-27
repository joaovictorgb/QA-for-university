package test;

import entities.MapToListAdapter;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MapToListAdapterTest {

    private MapToListAdapter<Integer> list;
    private MapToListAdapter<Integer> list2;

    @Before
    public void setUp() {
        list = new MapToListAdapter<>();
        list.add(1);
        list.add(2);
    }

    @Test
    public void testAdd() {
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
    }

    @Test
    public void testClear() {
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testContains() {
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertFalse(list.contains(3));
    }

    @Test
    public void testEquals() {
        MapToListAdapter<Integer> list2 = new MapToListAdapter<>();
        list2.add(1);
        list2.add(2);
        assertTrue(list.equals(list2));
    }

    @Test
    public void testGet() {;
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
    }

    @Test
    public void testIsEmpty() {
        list2 = new MapToListAdapter<>();
        assertTrue(list2.isEmpty());
        list2.add(1);
        assertFalse(list2.isEmpty());
    }

    @Test
    public void testRemove() {
        list.remove(1);
        assertEquals(1, list.size());
    }

    @Test
    public void testSize() {
        assertEquals(2, list.size());
    }

    @Test
    public void testToArray() {
        Integer[] expectedArray = {1, 2};
        assertArrayEquals(expectedArray, list.toArray());
    }

}
