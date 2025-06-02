import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {
    @Test
    void testGetSum_positiveNumbers() {
        Cal calc = new Cal();
        assertEquals(5, calc.getSum(2, 3));
    }
}
