package util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReversePolishNotationCalculatorTest {

    private ReversePolishNotationCalculator calculator;

    @Before
    public void init() {
        this.calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void calculateComplicatedExpression() {
        int expected = (4 ^ 5 | 1 & 2 << (2 | 5 >> 2 & 71)) | 1200;
        int actual = calculator.calculate("(4^5|1&2<<(2|5>>2&71))|1200");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateSimpleExpression() {
        int expected = 13 << 2;
        int actual = calculator.calculate("13<<2");
        Assert.assertEquals(expected, actual);
    }
}