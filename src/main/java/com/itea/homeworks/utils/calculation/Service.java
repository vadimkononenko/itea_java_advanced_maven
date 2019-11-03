package com.itea.homeworks.utils.calculation;

import java.util.Arrays;

public class Service {
    public double calculate(double a, double b, char c) {
        CalculationUtils operations = Arrays.stream(CalculationUtils.values())
                .filter(f -> f.getOperation().equals(c))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        return operations.calc(a, b);
    }
}
