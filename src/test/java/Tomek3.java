import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tomek3 {
WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\Tomek\\praca - Tomek\\skolenie tester oprogramowania\\Tomek3\\src\\test\\java\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MICROSECONDS);
        driver.manage().window().maximize();

    }

    @Test
        public void rejestracjaNowegoUzytkownika() {
            driver.findElement(By.cssSelector("(title=\"Log in to your customer account\")")).click();
            driver.findElement(By.id("email_create")).sendKeys("emailtomek3@tomek3.pl");
            driver.findElement(By.id("SubmitCreate")).click();
            driver.findElement(By.id("id_gender1")).click();
            driver.findElement(By.id("customer_firstname")).sendKeys("Gocha");
            driver.findElement(By.id("customer_lastname")).sendKeys("Kot");
            driver.findElement(By.id("submitAccount")).click();

            boolean czyWyswietlaOstrzezenia = driver.findElement(By.className("alert")).isDisplayed();
            Assert.assertTrue(czyWyswietlaOstrzezenia);
    }

    @After

    public void zamknij(){
        driver.quit();
    }




}
