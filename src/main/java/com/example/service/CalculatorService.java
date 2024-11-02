package com.example.service;

import com.example.utils.MyBigNumber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorService {

    public CalculationResult calculateSum(String number1, String number2) {
        MyBigNumber myBigNumber = new MyBigNumber();
        List<String> history = new ArrayList<>();

        myBigNumber.setLoggerHistory(history::add);

        // Thực hiện phép tính và lưu kết quả
        String result = myBigNumber.sum(number1, number2);

        return new CalculationResult(result, history);
    }
}
