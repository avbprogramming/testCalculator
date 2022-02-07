import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void toDecimal() {
        String hernya = BinaryToDecimal.toDecimal("1111");
        Assert.assertEquals("15", hernya);

    }
}