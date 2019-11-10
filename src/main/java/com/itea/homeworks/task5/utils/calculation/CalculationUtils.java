package com.itea.homeworks.task5.utils.calculation;

public enum  CalculationUtils implements OperType{
    ADD('+', (a, b) -> (a + b)),
    SUBTRACT('-', (a, b) -> (a - b)),
    DIVIDE('/', (a, b) -> (a / b)),
    MULTIPLY('*', (a, b) -> (a * b)),
    SQUARE('√', (a, b) -> Math.pow(a, 1.0 / b)),
    POW('^', (a, b) -> Math.pow(a, b)),
    POWADVANCED('~', (a, b) -> Math.pow(((a + b) / a) + 117, 2));

    private final char oper;
    private final OperType operation;

    CalculationUtils(char oper, OperType operation) {
        this.oper = oper;
        this.operation = operation;
    }

    public Character getOperation() {
        return oper;
    }

    public OperType getOper() {
        return operation;
    }

    @Override
    public double calc(double a, double b) {
        return operation.calc(a,b);
    }
}
