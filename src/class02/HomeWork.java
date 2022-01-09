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

public class HomeWork {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    @Test
    public void verifyErrorText(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       // driver.findElement(By.id("txtPassword")).sendKeys("");
        driver.findElement(By.id("btnLogin")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String errorText =  errorMessage.getText();
        String actualText = "Password cannot be empty";
        Assert.assertEquals(errorText, actualText);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
