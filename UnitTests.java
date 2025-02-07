package com.example.TinhToan.TinhToan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTests {


    @Test
    public void testIsInteger() {
        Assertions.assertTrue(isInteger(5, 10));
        Assertions.assertTrue(isInteger(-3, 4));
        Assertions.assertFalse(isInteger(2.5, 3));
        Assertions.assertFalse(isInteger(3, 4.1));
        Assertions.assertFalse(isInteger(2.2, 3.3));
        Assertions.assertFalse(isInteger(4, 2.4));
        Assertions.assertFalse(isInteger(6, 1.3));
        Assertions.assertFalse(isInteger(3, 3.4));
        Assertions.assertFalse(isInteger(7, 10.3));
        Assertions.assertFalse(isInteger(2.6, 6.3));
    }

    public boolean isInteger(Number a, Number b) {
        return a instanceof Integer && b instanceof Integer;
    }



    // Bài 2

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> divide(10, 0));
        Assertions.assertThrows(ArithmeticException.class, () -> divide(-5, 0));
        Assertions.assertDoesNotThrow(() -> divide(10, 2));
        Assertions.assertDoesNotThrow(() -> divide(-6, 3));
    }

    public int divide(int a, int b) {
        return a / b;
    }



    // Bài 3

    @Test
    public void testAverage() {
        Assertions.assertEquals(5, calculateAverage(new int[]{5, 5, 5}));
        Assertions.assertEquals(0, calculateAverage(new int[]{0, 0, 0}));
        Assertions.assertThrows(ArithmeticException.class, () -> calculateAverage(new int[]{}));
    }

    public int calculateAverage(int[] numbers) {
        if (numbers.length == 0) throw new ArithmeticException("Danh sach rong");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }



    // Bài 4

    @Test
    public void testGetElementAtIndex() {
        Assertions.assertEquals(3, getElementAtIndex(new int[]{1, 2, 3, 4}, 2));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> getElementAtIndex(new int[]{1, 2, 3}, 5));
    }

    public int getElementAtIndex(int[] array, int index) {
        return array[index];
    }



    // Bài 5

    @Test
    public void testGetName() {
        Assertions.assertEquals("John", getName(new User("John")));
        Assertions.assertThrows(NullPointerException.class, () -> getName(null));
    }

    public String getName(User user) {
        if (user == null) throw new NullPointerException("Ho so rong");
        return user.getName();
    }

    class User {
        private String name;
        public User(String name) { this.name = name; }
        public String getName() { return name; }
    }



    // Bài 6

    @Test
    public void testFindMin() {
        Assertions.assertEquals(1, findMin(new int[]{3, 1, 4, 1, 5}));
        Assertions.assertThrows(IllegalArgumentException.class, () -> findMin(new int[]{}));
    }

    public int findMin(int[] numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("Mang rong");
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
        }
        return min;
    }
}
