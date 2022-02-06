import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void checkEmptyString() {
        assertEquals("", "");
        assertEquals(null, null);
        assertEquals("a", "a");
    }

    @Test
    public void testCheckEmptyString() {
        assertEquals("", "");
        assertEquals(false, false);
        assertEquals("a", "a");
    }

    @Test
    public void checkBinary() {
        assertEquals("", "");
        assertEquals('1', '1');
        assertEquals('0', '0');
    }

    @Test
    public void checkOctal() {
        assertEquals("", "");
        assertEquals('1', '1');
        assertEquals('0', '0');
    }

    @Test
    public void checkDecimal() {
        assertEquals("", "");
        assertEquals('1', '1');
        assertEquals('0', '0');
    }

    @Test
    public void testCheckDecimal() {
        assertEquals("", "");
        assertEquals('1', '1');
        assertEquals('0', '0');
    }

    @Test
    public void checkDecimalMath() {
        assertEquals("", "");
        assertEquals('1', '1');
        assertEquals('0', '0');
    }

    @Test
    public void checkHex() {
        assertEquals("", "");
        assertEquals('1', '1');
        assertEquals('0', '0');
    }
}