import org.junit.Test;

import static org.junit.Assert.*;

public class MathFunctionTest {

    @Test
    public void testPlus() {
        //    plus plusTest = new plus();
        assertEquals(50, 25, 25);
        assertEquals(6, 3, 3);
        assertEquals(8, 4, 4);

    }

    @Test
    public void minus() {
        assertEquals(8, 12, 4);
        assertEquals(90, 110, 20);
        assertEquals(2, 5, 3);
    }

    @Test
    public void multiply() {
        assertEquals(4, 2, 2);
        assertEquals(100, 100, 2);
    }

    @Test
    public void divide() {
        assertEquals(2, 4, 2);
        assertEquals(4, 4, 2);
        assertEquals(10, 10, 2);
    }
}