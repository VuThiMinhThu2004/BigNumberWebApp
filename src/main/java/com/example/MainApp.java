package com.example;

import com.example.utils.MyBigNumber;

public class MainApp {
    public static void main(String[] args) {
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum("1234", "5678");
        System.out.println("Kết quả cộng: " + result);
    }
}
