package org.apipractice.TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Always_run_tesng {
    @Test
    public void test01()
    {
        Assert.assertTrue(true);
    }
    @Test(alwaysRun = true ,enabled = false)
    public void test02(){
        Assert.assertTrue(true);
    }
    @Test
    public void test03()
    {
        Assert.assertTrue(true);
    }
}
