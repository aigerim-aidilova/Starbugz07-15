import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.setup;

public class Aigerim {
@Test
    public void test() throws InterruptedException {
    setup.setUpBrowser();
    WebElement logo = Driver.getDriver().findElement(By.xpath("//img[@src='http://54.148.96.210/web/binary/company_logo?db=BriteErpDemo&company=1']"));
    Assert.assertTrue(logo.isDisplayed());
    WebElement calendarSign = Driver.getDriver().findElement(By.xpath("//button[@aria-label='calendar']"));
    calendarSign.click();

}
}
