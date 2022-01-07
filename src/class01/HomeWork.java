package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre condition");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Post condition");
    }

    @Test(priority = 1)
    public void openBrowser(){
        System.out.println("Opening the browser");
    }
    @Test(priority=2)
    public void login(){
        System.out.println("Log in with valid credentials");
    }
    @Test(priority=3)
    public void tearDown(){
        System.out.println("Closing the browser");
    }
}
