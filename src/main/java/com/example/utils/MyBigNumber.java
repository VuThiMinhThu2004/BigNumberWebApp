package com.example.utils;

import java.util.logging.Logger;

public class MyBigNumber {
    private static final Logger logger = Logger.getLogger(MyBigNumber.class.getName());

    public String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;  // lưu giá trị nhớ

        int length1 = stn1.length();
        int length2 = stn2.length();
        int maxLength = Math.max(length1, length2);

        stn1 = String.format("%" + maxLength + "s", stn1).replace(' ', '0');
        stn2 = String.format("%" + maxLength + "s", stn2).replace(' ', '0');

        // Duyệt các chữ số từ phải sang trái
        for (int i = maxLength - 1; i >= 0; i--) {
            int digit1 = stn1.charAt(i) - '0';  
            int digit2 = stn2.charAt(i) - '0';  
            int sum = digit1 + digit2 + carry;  

            result.insert(0, sum % 10);  // Lấy phần đơn vị của kết quả cộng
            carry = sum / 10;  // Lấy phần nhớ cho bước tiếp theo

            logger.info("Bước " + (maxLength - i) + ": Lấy " + digit1 + " cộng " + digit2 + " cộng với nhớ " + carry + " được " + sum + ". Lưu " + (sum % 10) + " vào kết quả và nhớ " + carry + ".");
        }

        if (carry > 0) {
            result.insert(0, carry);
            logger.info("Thêm phần nhớ cuối cùng " + carry + " vào kết quả.");
        }

        return result.toString();
    }
}
