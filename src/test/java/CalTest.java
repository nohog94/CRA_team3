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
  
  
    @Test
    void minus() {
        int result = 3;
        int a = 5;
        int b = 2;
        Cal c = new Cal();

        assertEquals(result, c.minus(a,b));
    }
}
