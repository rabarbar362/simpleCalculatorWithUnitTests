import com.rabarbar362.SimpleCalculatorWithUnitTests.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


 class CalculatorTest {

    private Calculator calculator = new Calculator();

    private int x = 3;
    private int y = 3;

    @Test
     void addTest() {
        assertEquals(6, calculator.add(x, y));
    }

    @Test
     void subtractTest() {
        assertEquals(0, calculator.subtract(x, y));
    }

    @Test
     void multiplyTest() {
        assertEquals(9, calculator.multiply(x, y));
    }

    @Test
     void divideByZeroTest() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.divide(x,0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
     void divideTest() {
        assertEquals(1, calculator.divide(x, y));
    }
}
