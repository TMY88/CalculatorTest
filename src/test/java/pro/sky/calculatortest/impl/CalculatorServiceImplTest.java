package pro.sky.calculatortest.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculatortest.service.CalculatorService;
import pro.sky.calculatortest.service.CalculatorServiceImpl;

public class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCheckCalculationOfSum() {
        int num1 = 5;
        int num2 = 5;
        int expectedSum = num1 + num2;

        Integer actualSum = calculatorService.add(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void shouldCheckCalculationOfSubtract() {
        int num1 = 5;
        int num2 = 5;
        int expectedSubtract = num1 - num2;

        Integer actualSubtract = calculatorService.subtract(num1, num2);

        Assertions.assertEquals(expectedSubtract, actualSubtract);
    }
    @Test
    public void shouldCheckCalculationOfMultiply() {
        int num1 = 5;
        int num2 = 5;
        int expectedMultiply = num1 * num2;

        Integer actualMultiply = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedMultiply, actualMultiply);
    }
    @Test
    public void shouldCheckCalculationOfDivide() {
        int num1 = 5;
        int num2 = 5;
        int expectedDivide = num1 / num2;

        Double actualDivide = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedDivide, actualDivide);
    }

    @Test
    public void shouldCheckWhenSecondNumberIsZero() {
        int num1 = 5;
        int num2 = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num2));

    }
}
