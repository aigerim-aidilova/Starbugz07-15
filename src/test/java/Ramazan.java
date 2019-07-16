import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ramazan {


    WebDriver driver;

    @Test
    public void setUp() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://54.148.96.210/web/login");

        WebElement logIn = driver.findElement(By.xpath("//input[@id='login']"));
        logIn.sendKeys("EventsCRM_Manager5@info.com");

        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Ugh45wQ16");

        Thread.sleep(3000);
        WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        logInButton.click();

        Thread.sleep(3000);
        WebElement eventsButton = driver.findElement(By.xpath("(//span[@class='oe_menu_text'])[10]"));
        eventsButton.click();

        Thread.sleep(3000);
        WebElement eventsButton2 = driver.findElement(By.xpath("(//span[@class='oe_menu_text'])[10]"));
        eventsButton2.click();




    }

}
