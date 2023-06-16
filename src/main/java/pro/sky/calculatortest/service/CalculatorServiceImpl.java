package pro.sky.calculatortest.service;

public class CalculatorServiceImpl implements CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }
    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }
    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return (double) (num1 / num2);
    }
}
