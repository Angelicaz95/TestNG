package class01;

import org.testng.annotations.*;

public class BeforeClassAndAfterClass {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }
    @Test
    public void firstTest(){

        System.out.println("I am a first test");

    }
    @Test
    public void secondTest(){
        System.out.println("I am a second test");
    }
    @Test
    public void thirdTest(){
        System.out.println("I am third test");
    }
}
