package org.apipractice.TestNG_examples;
import org.testng.Assert;
import org.testng.annotations.Test;

public class groups {
  // sanity - 1 , regression - 3 , p1 -2

    @Test(groups = {"sanity","reg"})
    public void Test_sanity(){
        System.out.println("Sanity testcase");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"p1","reg"})
    public void test_regre_run()
    {
        System.out.println("Regression");
        Assert.assertTrue(false);
    }
    @Test(groups = {"p1","reg"})
    public void smoke_test()
    {
        System.out.println("P1 test");
        Assert.assertTrue(false);
    }
}
