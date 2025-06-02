import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {

    Cal cal = new Cal();

    @Test
    void testDivideNormalCase() {
        float result = cal.getDivide(10, 2);
        assertEquals(5.0f, result);
    }

    @Test
    void testDivideByZero() {
        float result = cal.getDivide(10, 0);
        assertEquals(0.0f, result);
    }

    @Test
    void testNegativeDivision() {
        float result = cal.getDivide(-10, 2);
        assertEquals(-5.0f, result);
    }

    @Test
    void testZeroNumerator() {
        float result = cal.getDivide(0, 5);
        assertEquals(0.0f, result);
    }

    @Test
    void getSumSum() {
        Cal calculator = new Cal();
        int expected = 1+2+3;

        int result = calculator.getSumSum(1,2,3);

        assertEquals(expected, result);
    }

    @Test
    void getNegativeSumSum() {
        Cal calculator = new Cal();
        int expected = (-1)+(-2)+(-3);

        int result = calculator.getSumSum(-1,-2,-3);

        assertEquals(expected, result);
    }
}

