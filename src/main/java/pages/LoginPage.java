package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class LoginPage extends MethodHandels {


    LoginPage (WebDriver driver)
    {
        super(driver);

    }

    private By emailField= By.id("Email");
    private By password=By.id("Password");
    private By loginButton=By.cssSelector(".button-1.login-button");

    public void insertEmail(String text)
    {
        sendKeys(emailField,text);
    }
    public void insertPassword(String text)
    {
        sendKeys(password,text);
    }
    public void clickOnLoginButton ()
    {
       click(loginButton);
    }




}
