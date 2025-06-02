import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {
    @Test
    void getGop() {
        int expected = 6;
        Cal c = new Cal();

        int res = c.getGop(2, 3);
        assertEquals(expected, res);
    }

    @Test
    void testDivideNormalCase() {
        Cal cal = new Cal();
        float result = cal.getDivide(10, 2);
        assertEquals(5.0f, result);
    }

    @Test
    void testDivideByZero() {
        Cal cal = new Cal();
        float result = cal.getDivide(10, 0);
        assertEquals(0.0f, result);
    }

    @Test
    void testNegativeDivision() {
        Cal cal = new Cal();
        float result = cal.getDivide(-10, 2);
        assertEquals(-5.0f, result);
    }

    @Test
    void testZeroNumerator() {
        Cal cal = new Cal();
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
    void minus() {
        int result = 3;
        int a = 5;
        int b = 2;
        Cal c = new Cal();

        assertEquals(result, c.minus(a,b));
    }


    @Test
    void sum() {
        int result = 7;
        int a = 5;
        int b = 2;
        Cal c = new Cal();

        assertEquals(result, c.getSum(a,b));
    }

    @Test
    void sum2() {
        int result = 12;
        int a = 3;
        int b = 9;
        Cal c = new Cal();

        assertEquals(result, c.getSum(a,b));
    }

    @Test
    void getNegativeSumSum() {
        Cal calculator = new Cal();
        int expected = (-1)+(-2)+(-3);

        int result = calculator.getSumSum(-1,-2,-3);

        assertEquals(expected, result);
    }
}

