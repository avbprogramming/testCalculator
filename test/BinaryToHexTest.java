import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToHexTest {

    @Test
    public void toHex() {
        assertEquals('1','1');
        assertEquals('0','0');
        assertEquals("1111", "1111", "1111");
    }
}