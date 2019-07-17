package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

import java.util.List;

public class orangeCrm {
    @Test
    public void setUp(){
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        Driver.getDriver().findElement(By.id("txtUsername")).sendKeys("Admin");
        Driver.getDriver().findElement(By.id("txtPassword")).sendKeys("admin123");
        Driver.getDriver().findElement(By.id("btnLogin")).click();
        WebElement welcome = Driver.getDriver().findElement(By.id("welcome"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(welcome.isDisplayed());
        softAssert.assertAll();
    }
    @Test
    public void orangeLoginVerification(){
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

       LoginPage olp = new LoginPage();
       olp.logginIn("Admin","admin123");
       // olp.usernameInput.sendKeys("Admin");
       // olp.passwordInput.sendKeys("admin123");
       // olp.loginButton.click();

        HomePage ohp = new HomePage();
        Assert.assertTrue(ohp.welcomeText.isDisplayed());


    }
    @Test
    public void verifyCEO(){
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        LoginPage olp = new LoginPage();
        olp.logginIn("Admin","admin123");

        HomePage ohp = new HomePage();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(ohp.performance).perform();
        actions.moveToElement(ohp.configure).perform();
        ohp.kpi.click();
       ohp.jobTitleDropdown.click();
        Select select = new Select(ohp.jobTitleDropdown);
        List <WebElement> choices = select.getOptions();
        for(WebElement each: choices){
            if(each.getText().equals("CEO")){
                Assert.assertTrue(true);
                break;
            }
        }




    }
}
