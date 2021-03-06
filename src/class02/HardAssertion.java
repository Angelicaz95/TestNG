package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertion {

    WebDriver driver;

    //pre condition @before method -- launch browser and navigate url
    @BeforeMethod
    public void openBrowserAndLaunchApplication(){
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //@Test -- perform login

    @Test(enabled = false)
    public void adminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test
    public void validationOfTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Manaaaaaagement System";
        Assert.assertEquals(actualTitle, expectedTitle); // substitutes if condition


        WebElement userName = driver.findElement(By.id("txtUsername"));
        Assert.assertTrue(userName.isDisplayed());
        System.out.println("I am a test code");


    }

    //post condition @after method -- close browser
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
