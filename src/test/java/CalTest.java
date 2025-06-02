import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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
    void getZerogop() {
        Cal app = new Cal();
        int ret = app.getZerogop(10);
        assertEquals(100, ret);
    }
    
    @Test
    void getZerogop2() {
        Cal app = new Cal();
        int ret = app.getZerogop(8);
        assertEquals(64, ret);
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

    // int[] 배열을 직접 전달하는 방법
    @ParameterizedTest
    @MethodSource("provideIntArrays")
    void addMinusTest(int[] input) {

        Cal c = new Cal();

        assertEquals(input[2], c.minus(input[0],input[1]));
    }

    // int[] 배열을 제공하는 정적 메소드
    static Stream<int[]> provideIntArrays() {
        return Stream.of(
                new int[]{5,3,2},  // 첫 번째 배열
                new int[]{4,1,3},     // 두 번째 배열
                new int[]{3,-3,6},   // 세 번째 배열
                new int[]{0,-1,1}   // 세 번째 배열
        );
    }
    @Test
    void getGop2() {
        int expected = -6;
        Cal c = new Cal();

        int res = c.getGop(-2, 3);

        assertEquals(expected, res);
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

