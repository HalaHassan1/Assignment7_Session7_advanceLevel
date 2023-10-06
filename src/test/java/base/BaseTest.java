package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTest {
    WebDriver driver;
    protected HomePage homePage;
    protected ReadDataFromJson readDataFromJson;
    @BeforeClass
    public void setup() throws FileNotFoundException {

        readDataFromJson=new ReadDataFromJson();
        driver=new ChromeDriver();
        driver.get(readDataFromJson.readJsonFile().URL);
        homePage=new HomePage(driver);
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }


}
