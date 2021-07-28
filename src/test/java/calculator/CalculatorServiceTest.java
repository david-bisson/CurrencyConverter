package calculator;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void calculate() {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.initiate();
        double actualCalculate = calculatorService.calculate(33, Coins.EUR);
        Assert.assertEquals(actualCalculate, 139.59, "Failed in .....");

    }
}