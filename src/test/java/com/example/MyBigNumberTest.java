package com.example;

import com.example.utils.MyBigNumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyBigNumberTest {

    @Test
    public void testSumSimple() {
        MyBigNumber myBigNumber = new MyBigNumber();
        assertEquals("135", myBigNumber.sum("123", "12"), "Cộng 123 và 12 phải ra kết quả là 135");
    }

    @Test
    public void testSumWithCarry() {
        MyBigNumber myBigNumber = new MyBigNumber();
        assertEquals("1000", myBigNumber.sum("999", "1"), "Cộng 999 và 1 phải ra kết quả là 1000");
    }

    @Test
    public void testSumLargeNumbers() {
        MyBigNumber myBigNumber = new MyBigNumber();
        assertEquals("1111111110", myBigNumber.sum("123456789", "987654321"), "Cộng 123456789 và 987654321 phải ra kết quả là 1111111110");
    }
    
    @Test
    public void testSumDifferentLengths() {
        MyBigNumber myBigNumber = new MyBigNumber();
        assertEquals("100", myBigNumber.sum("1", "99"), "Cộng 1 và 99 phải ra kết quả là 100");
    }
}