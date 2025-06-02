import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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
}

