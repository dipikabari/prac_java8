package com.mymath;

import org.junit.Assert;
import org.junit.Test;

public class IntMathTest {

    @Test
    public void shouldAddIntegers() throws Exception {
        IntMath math = new IntMath();

        int result = math.add(1,2);

        Assert.assertEquals(3, result);
    }
}