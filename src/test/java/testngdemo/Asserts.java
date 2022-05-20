package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {
    @Test
    public void hardAssertExample(){
       String expectedResult = "HARD assert";
       String actualResult = "HARD ";

       Assert.assertEquals(expectedResult,actualResult);

       System.out.println("this should not be executed");
    }

    @Test
    public void softAssertExample(){
        SoftAssert softAssert = new SoftAssert();


        softAssert.assertEquals(1,2,"los numero no son iguales");
        softAssert.assertEquals(1,3,"los numero no son iguales2");
        softAssert.assertEquals(1,5,"los numero no son iguale3s");
        softAssert.assertEquals(5,5,"los numero no son iguale3s");

        softAssert.assertAll();
        System.out.println("This should be executed");




    }

}
