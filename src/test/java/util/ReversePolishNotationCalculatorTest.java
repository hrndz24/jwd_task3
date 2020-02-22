package util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePolishNotationCalculatorTest {

    @Test
    public void calculate() {
        int expected = (4^5|1&2<<(2|5>>2&71))|1200;
        int actual = new ReversePolishNotationCalculator().calculate("(4^5|1&2<<(2|5>>2&71))|1200");
        Assert.assertEquals(expected, actual);
    }
}