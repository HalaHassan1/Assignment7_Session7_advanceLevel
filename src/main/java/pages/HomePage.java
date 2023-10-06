package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class HomePage extends MethodHandels {



    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    private By loginLink =By.cssSelector(".ico-login");

    public LoginPage clickOnLogin ()
    {
        click(loginLink);
        return new LoginPage(driver);

    }

}
