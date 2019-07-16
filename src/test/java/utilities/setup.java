package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

public class setup {
        public static void setUpBrowser() throws InterruptedException{

            Driver.getDriver().get("http://54.148.96.210/web/login");

            WebElement logIn = Driver.getDriver().findElement(By.xpath("//input[@id='login']"));
            logIn.sendKeys("EventsCRM_Manager5@info.com");

            WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='password']"));
            password.sendKeys("Ugh45wQ16");

            WebElement logInButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
            logInButton.click();

            Thread.sleep(3000);
            WebElement eventsButton = Driver.getDriver().findElement(By.xpath("(//span[@class='oe_menu_text'])[10]"));
            eventsButton.click();


        }
    }

