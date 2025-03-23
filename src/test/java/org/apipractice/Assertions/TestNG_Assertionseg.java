package org.apipractice.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class TestNG_Assertionseg {
    //Hard
  public void test_hardassert()
  {
      System.out.println("Start");  // this will print
      Boolean is_neeru_male = false;
      Assert.assertEquals("pramod","Pramod");  // this is false
      System.out.println("end ");   // this will not print in OP
      //Hard assertion - if one TC becomes false remaining would be atopped and don't run

  }
  @Test
    //soft
    //soft assertion - if one TC becomes false remaining would still run
    public void testng_softassert(){
        System.out.println("Start program"); // this will print
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(false);  // fail condition
        System.out.println("end of program");   // this will still print
        soft.assertAll();


    }
}
