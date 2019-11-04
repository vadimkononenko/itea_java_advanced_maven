package com.itea.homeworks.utils.calculation;

import java.util.Arrays;

public class Service {
    public double calculate(double first, double second, char operation) {
        CalculationUtils operations = Arrays.stream(CalculationUtils.values())
                .filter(f -> f.getOperation().equals(operation))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        return operations.calc(first, second);
    }
}
