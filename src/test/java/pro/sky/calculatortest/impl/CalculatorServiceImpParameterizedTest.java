package pro.sky.calculatortest.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculatortest.service.CalculatorService;
import pro.sky.calculatortest.service.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceImpParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> argumentProviderForSum() {
        return Stream.of(
                Arguments.of(0, 0, 0),
                Arguments.of(10, 10, 20),
                Arguments.of(-10, -10, -20)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForSum")
    public void shouldCheckCalculationOfSum(int num1, int num2, int expectedSum) {

        Integer actualSum = calculatorService.add(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    private static Stream<Arguments> argumentProviderForSubtract() {
        return Stream.of(
                Arguments.of(0, 1, -1),
                Arguments.of(10, 10, 0),
                Arguments.of(100, 10, 90)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForSubtract")
    public void shouldCheckCalculationOfSubtract(int num1, int num2, int expectedSubtract) {

        Integer actualSubtract = calculatorService.subtract(num1, num2);

        Assertions.assertEquals(expectedSubtract, actualSubtract);
    }

    private static Stream<Arguments> argumentProviderForMultiply() {
        return Stream.of(
                Arguments.of(0, 1, 0),
                Arguments.of(10, 10, 100),
                Arguments.of(100, 10, 1000)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForMultiply")
    public void shouldCheckCalculationOfMultiply(int num1, int num2, int expectedMultiply) {

        Integer actualMultiply = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedMultiply, actualMultiply);
    }

    private static Stream<Arguments> argumentProviderForDivide() {
        return Stream.of(
                Arguments.of(0, 1, 0),
                Arguments.of(10, 10, 1),
                Arguments.of(100, 10, 10)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForDivide")
    public void shouldCheckCalculationOfDivide(int num1, int num2, int expectedDivide) {

        Double actualDivide = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedDivide, actualDivide);
    }
}

