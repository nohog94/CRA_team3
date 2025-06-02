import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {
    @Test
    void getGop() {
        int expected = 6;
        Cal c = new Cal();

        int res = c.getGop(2,3);

        assertEquals(expected, res);
    }
}
