package org.apipractice.TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class invocation_count_testng {
    @Test(invocationCount = 3)
    public void test01()
    {
        Assert.assertTrue(true);
    }
}
