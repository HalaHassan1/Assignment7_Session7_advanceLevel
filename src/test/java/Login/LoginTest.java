package Login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class LoginTest  extends BaseTest {
      @Test
    public void loginTest() throws FileNotFoundException {
       LoginPage loginPage= homePage.clickOnLogin();
       //readDataFromJson=new ReadDataFromJson();
      loginPage.insertEmail(readDataFromJson.readJsonFile().login.ValidCredential.Username);
       loginPage.insertPassword(readDataFromJson.readJsonFile().login.ValidCredential.Password);
      loginPage.clickOnLoginButton();

         // System.out.println(readDataFromJson.readJsonFile().login.ValidCredential.Username);

    }



}
