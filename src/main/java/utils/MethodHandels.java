package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodHandels {
    public WebDriver driver;
    WebDriverWait wait;

    public MethodHandels(WebDriver driver){
        this.driver=driver;
    }

     protected void click(By locator)
{    explicitWait(locator,10);
    //driver.findElement(locator).click();
    webelement(locator).click();
}

protected void sendKeys(By locator,String text)
{  explicitWait(locator,15);  // high level of details
    //driver.findElement(locator).sendKeys(text); // low level of details
    webelement(locator).sendKeys(text);
}
// Note to reduce wait , we need to make function to reduce repiption

    private void explicitWait (By locator,int time){
        wait =new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(driver.findElement(locator)),
                (ExpectedConditions.elementToBeClickable(locator)),
                (ExpectedConditions.presenceOfElementLocated(locator))));
    }

    private WebElement webelement(By locator){
       return driver.findElement(locator);
    }


}
