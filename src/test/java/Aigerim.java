import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.setup;

public class Aigerim {
@BeforeMethod
    public void test() throws InterruptedException {
    setup.setUpBrowser();
}
}
