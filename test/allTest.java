import org.junit.Assert;
import org.junit.Test;

public class allTest {

    @Test
    public void toBinary() {
        String str = DecimalToBinary.toBinary("3");
        Assert.assertEquals("11", str);
    }

    @Test
    public void toHex() {
        String str = DecimalToHex.toHex("15");
        Assert.assertEquals("f", str);
    }

    @Test
    public void toDecimal() {
        String str = BinaryToDecimal.toDecimal("1111");
        Assert.assertEquals("15", str);

    }

    @Test
    public void DecimalToOctal() {
        String str = DecimalToOctal.toDecimal("10");
        Assert.assertEquals("8", str);
    }

    @Test
    public void HexToBinary() {
        String str = HeXtoBinary.toBinary("f");
        Assert.assertEquals("1111", str);
    }

    @Test
    public void HexToDecimal() {
        String str = HexToDecimal.toDecimal("f");
        Assert.assertEquals("15", str);
    }

    @Test
    public void OctalToDecimal() {
        String str = OctalToDecimal.toOctal("10");
        Assert.assertEquals("12", str);
    }

    @Test
    public void BinaryToHex() {
        String str = BinaryToHex.toHex("1111");
        Assert.assertEquals("f", str);
    }

    @Test
    public void MathFunctionPlus() {
        String firstNum = "22";
        String secondNum = "11";
        MathFunction.plus(firstNum, secondNum);
        Assert.assertEquals("2", "11", "11");

    }

    @Test
    public void MathFunctionMinus() {
        MathFunction.minus("22", "11");
        Assert.assertEquals("2", "11", "11");
    }

    @Test
    public void MathFunctionMultiply() {
        MathFunction.multiply("22", "11");
        Assert.assertEquals("2", "11", "11");
        //         divide
    }

    @Test
    public void MathFunctionDivide() {
        MathFunction.divide("22", "11");
        Assert.assertEquals("2", "11", "11");

    }

    @Test
    public void choiceTest() {
        Choice choice = new Choice();
        Choice.choice(1, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(2, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(3, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(4, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(5, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(6, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(7, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(8, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(9, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(10, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(11, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(12, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice.choice(13, "22", "11");
        Assert.assertNotEquals("33", choice);

        Choice choice1 = new Choice();
        Choice.choice2(2, "1");
        Assert.assertNotEquals("22", choice1);
    }

    @Test
    public void Menu(){
        int num = Menu.begin();
        Assert.assertNotEquals("22", num);
    }


}