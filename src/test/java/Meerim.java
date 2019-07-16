import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Meerim {

        WebDriver driver;

        @Test
        public void testCheckbox() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://54.148.96.210/web/login");
            WebElement username = driver.findElement(By.id("login"));
            username.sendKeys("EventsCRM_Manager5@info.com");
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("Ugh45wQ16");
            WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            login.click();
            Thread.sleep(1000);
            WebElement event = driver.findElement(By.xpath("(//span[@class='oe_menu_text'])[10]"));
            event.click();
            Thread.sleep(1000);
            WebElement eventCat = driver.findElement(By.xpath("(//span[@class='oe_menu_text'])[70]"));
            eventCat.click();


        }

        @Test
        public void firstScenario() throws InterruptedException {
            testCheckbox();
            Thread.sleep(2000);
            WebElement search = driver.findElement(By.xpath("//input[@class='o_searchview_input']"));
            search.sendKeys("Seminar", Keys.ENTER);


        }

        @Test
        public void secondScenario() throws InterruptedException {
            testCheckbox();
            WebElement create = driver.findElement(By.xpath(" //button[@class='btn btn-primary btn-sm o_list_button_add']"));
            create.click();
        }

        @Test
        public void thirdScenario() throws InterruptedException {
            testCheckbox();
            WebElement importButton = driver.findElement(By.xpath
                    ("//button[@class='btn btn-sm btn-default o_button_import']"));
            Assert.assertTrue(importButton.isDisplayed());



        }
    }



