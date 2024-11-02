package com.example.service;

import java.util.List;

public class CalculationResult {
    private String result;
    private List<String> history;

    public CalculationResult(String result, List<String> history) {
        this.result = result;
        this.history = history;
    }

    public String getResult() {
        return result;
    }

    public List<String> getHistory() {
        return history;
    }
}
