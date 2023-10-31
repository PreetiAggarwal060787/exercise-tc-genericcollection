package com.stackroute.genericcollection; 
import com.stackroute.genericcollection.GenericMapOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericMapOperationsTests {

    private GenericMapOperations<Integer, Integer> integerMap;
    private GenericMapOperations<String, String> stringMap;

    @BeforeEach
    public void setUp() {
        integerMap = new GenericMapOperations<>(5); 
        stringMap = new GenericMapOperations<>(3); 
    }

    @Test
    public void testSetAndGetForInteger() {
        integerMap.set(1, 10);
        integerMap.set(2, 20);

        assertEquals(10, integerMap.find(1));
        assertEquals(20, integerMap.find(2));
    }

    @Test
    public void testSetAndGetForString() {
        stringMap.set("one", "first");
        stringMap.set("two", "second");

        assertEquals("first", stringMap.find("one"));
        assertEquals("second", stringMap.find("two"));
    }

    @Test
    public void testSetAndUpdate() {
        integerMap.set(1, 10);
        integerMap.set(1, 20);

        assertEquals(20, integerMap.find(1));
    }

    @Test
    public void testRemoveEldestEntry() {
        integerMap.set(1, 10);
        integerMap.set(2, 20);
        integerMap.set(3, 30);
        integerMap.set(4, 40);
        integerMap.set(5, 50);
        integerMap.set(6, 60); 

        assertNull(integerMap.find(1)); 
        assertEquals(20, integerMap.find(2)); 
    }

    @Test
    public void testSetWithNullKey() {
        assertThrows(NullPointerException.class, () -> integerMap.set(null, 10));
    }

    @Test
    public void testSetWithNullValue() {
        assertThrows(NullPointerException.class, () -> integerMap.set(1, null));
    }

    @Test
    public void testSetWithEmptyKey() {
        assertThrows(NullPointerException.class, () -> stringMap.set("", "empty"));
    }

    @Test
    public void testSetWithEmptyValue() {
        assertThrows(NullPointerException.class, () -> stringMap.set("key", ""));
    }
    @Test
    public void testSetAndGetForDifferentTypes() {
        integerMap.set(1, 10);
        stringMap.set("one", "first");

        assertEquals(10, integerMap.find(1));
        assertEquals("first", stringMap.find("one"));
    }

    @Test
    public void testSetWithMoreElementsThanCapacity() {
        integerMap.set(1, 10);
        integerMap.set(2, 20);
        integerMap.set(3, 30);
        integerMap.set(4, 40);
        integerMap.set(5, 50);
        integerMap.set(6, 60);
        integerMap.set(7, 70);
        integerMap.set(8, 80);

        assertNull(integerMap.find(1)); 
        assertEquals(80, integerMap.find(8)); 
    }

    @Test
    public void testFindNonExistentKey() {
        integerMap.set(1, 10);
        integerMap.set(2, 20);

        assertNull(integerMap.find(3)); 
    }
}