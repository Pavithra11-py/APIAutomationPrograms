package org.apipractice.TestNG_examples;


import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Annotations {
    @BeforeTest
    public void test_case_1(){
        System.out.println("1");
    }

    @Test(priority = 1)
    public void test_case_2(){
        System.out.println("2");
    }

    @Test(priority = 2)
    public void test_case_3(){
        System.out.println("3");
    }

    @Test(priority = 3)
    public void test_case_4(){
        System.out.println("4");
    }

    @AfterTest
    public void test_case_5(){
        System.out.println("5");
    }
}
