package test;

import calculator.CalculatorService;
import calculator.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void testSum() {
        assertEquals(100, calculatorService.sum(47, 53));
    }

    @Test
    public void testMul() {
        assertEquals(64, calculatorService.mul(8, 8));
    }
}
