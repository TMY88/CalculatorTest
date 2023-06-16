package pro.sky.calculatortest.service;

public interface CalculatorService {
    String greeting();

    Integer add(Integer num1, Integer num2);

    Integer subtract(Integer num1, Integer num2);

    Integer multiply(Integer num1, Integer num2);

    Double divide(Integer num1, Integer num2);
}
