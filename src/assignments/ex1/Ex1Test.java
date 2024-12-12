package assignments.ex1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * This JUnit class represents test cases for the Ex1 implementation.
 */
public class Ex1Test {

    @Test
    void testNumber2Int() {
        assertEquals(9, Ex1.number2Int("1001b2"));
        assertEquals(4, Ex1.number2Int("11b3"));
        assertEquals(29, Ex1.number2Int("1DbG"));
        assertEquals(-1, Ex1.number2Int("1b")); // Invalid
    }

    @Test
    void testIsNumber() {
        assertTrue(Ex1.isNumber("1001b2"));
        assertTrue(Ex1.isNumber("1DbG"));
        assertFalse(Ex1.isNumber("b2"));
        assertFalse(Ex1.isNumber(""));
    }

    @Test
    void testInt2Number() {
        assertEquals("1001b2", Ex1.int2Number(9, 2));
        assertEquals("1FbG", Ex1.int2Number(31, 16));
        assertEquals("", Ex1.int2Number(-1, 2)); // Invalid
        assertEquals("", Ex1.int2Number(10, 17)); // Invalid base
    }

    @Test
    void testEquals() {
        assertTrue(Ex1.equals("1001b2", "9b10"));
        assertFalse(Ex1.equals("1001b2", "10b10"));
    }

    @Test
    void testMaxIndex() {
        String[] numbers = {"1001b2", "11b3", "1DbG"};
        assertEquals(2, Ex1.maxIndex(numbers));

        String[] mixedNumbers = {"123bA", "", "GGbG", null, "10b10"};
        assertEquals(4, Ex1.maxIndex(mixedNumbers));
}
}
