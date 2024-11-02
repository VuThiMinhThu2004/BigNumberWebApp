package com.example.controller;

import com.example.service.CalculationResult;
import com.example.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/")
    public String showForm() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculateSum(
            @RequestParam("number1") String number1,
            @RequestParam("number2") String number2,
            Model model) {
        CalculationResult calculationResult = calculatorService.calculateSum(number1, number2);

        // Tạo chuỗi kết quả theo định dạng "number1 + number2 = result"
        String resultString = number1 + " + " + number2 + " = " + calculationResult.getResult();

        model.addAttribute("resultString", resultString);
        model.addAttribute("history", calculationResult.getHistory());
        return "result";
    }
}
