import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {
    @Test
    void minus() {
        int result = 3;
        int a = 5;
        int b = 2;
        Cal c = new Cal();

        assertEquals(result, c.minus(a,b));
    }
}
