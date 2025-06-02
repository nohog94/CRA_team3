import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalTest {

    @Test
    void getSumSum() {
        Cal calculator = new Cal();
        int expected = 1+2+3;

        int result = calculator.getSumSum(1,2,3);

        assertEquals(expected, result);
    }
}