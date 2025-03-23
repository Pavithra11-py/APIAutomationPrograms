package org.apipractice.TestNG_examples;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_eg {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Demo TC1");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Starting chrome browser");
            Assert.assertTrue(true);
        }

        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Starting Firefox");
            Assert.assertTrue(true);
        }
    }
}
