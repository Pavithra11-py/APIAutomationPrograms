package org.apipractice.TestNG_examples;

import org.testng.annotations.Test;

import org.testng.Assert;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class Depends_onmethod {
    @Test
    public void serverStartedOk(){
        System.out.println("I will run first");
        Assert.assertTrue(true);

    }
    @Test(dependsOnMethods = "serverStartedOk")
    public void method1(){
        System.out.println("method-1");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "serverStartedOk")
    public void method2(){
        System.out.println("method-2");
        Assert.assertTrue(true);
    }
}
