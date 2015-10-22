import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void multTest() {
        Multiply mult = new Multiply();
        int n = mult.multiply(2, 15);

        assertEquals(10, n);
    }
}
