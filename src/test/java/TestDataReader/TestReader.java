package TestDataReader;


import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class TestReader {
    ReadDataFromJson readDataFromJson;

    @Test
    public void t1() throws FileNotFoundException {
     readDataFromJson= new ReadDataFromJson();
     System.out.println(readDataFromJson.readJsonFile().URL);
    }

    @Test
    public void t2()throws FileNotFoundException{
        readDataFromJson=new ReadDataFromJson();
        System.out.println(readDataFromJson.readJsonFile().login.ValidCredential.Username);
        System.out.println(readDataFromJson.readJsonFile().login.ValidCredential.Password);
    }

    @Test
    public void t3()throws FileNotFoundException
    {
        readDataFromJson =new ReadDataFromJson();
        System.out.println(readDataFromJson.readJsonFile().login.InvalidCredential.InvalidUserName.Username);
        System.out.println(readDataFromJson.readJsonFile().login.InvalidCredential.InvalidUserName.Password);
    }
    @Test
    public void t4() throws FileNotFoundException
    {
        readDataFromJson=new ReadDataFromJson();
        System.out.println(readDataFromJson.readJsonFile().login.InvalidCredential.InvalidPassword.Username);
        System.out.println(readDataFromJson.readJsonFile().login.InvalidCredential.InvalidPassword.Password);
    }

}
