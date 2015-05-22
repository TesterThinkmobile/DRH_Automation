package tests;

import methods.StartPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class StartPageTests extends BaseTest {
    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);
    
    @Test
    
    public void Registration_positive() throws InterruptedException {

        goHome();

        String firstName = "new"+value;
        String lastName = "new"+value;
        String inst = "new";
        String userName = "new"+value;
        String email = value+"@mail.com";
        String pass = "12345";


        StartPage startPage = new StartPage();
        startPage.Registration(firstName, lastName, inst, userName, email, pass, pass);
        startPage.finishReg();


    }

    @Test

     public void Registration_empty() throws InterruptedException {
        goHome();

        String firstName = "";
        String lastName = "";
        String inst = "";
        String userName = "";
        String email = "";
        String pass = "";


        StartPage startPage = new StartPage();
        startPage.Registration(firstName, lastName, inst, userName, email, pass, pass);

        assertEquals("Email: This field is required.", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[2]/span")).getText());
        assertEquals("Institution", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[3]/span/span")).getText());
        assertEquals("First Name: This field is required.", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[4]/span")).getText());
        assertEquals("×\nLast Name: This field is required.", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[5]")).getText());
        assertEquals("Password Confirmation: This field is required.", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[6]/span")).getText());
        assertEquals("×\nPassword: This field is required.", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[7]")).getText());
        assertEquals("Username: This field is required.", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[8]/span")).getText());


    }

    @Test

    public void Registration_negative() throws InterruptedException {
        goHome();

        String firstName = value+value+value;
        String lastName = value+value+value;
        String inst = value+value+value;
        String userName = value+value+value;
        String email = value+value+value;
        String pass = value+value+value;
        String confPass = value;


        StartPage startPage = new StartPage();
        startPage.Registration(firstName, lastName, inst, userName, email, pass, confPass);

        //getDriver().findElement(By.xpath("//meta[@name='description']"))
        assertEquals("×\nEmail: Enter a valid email address.", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[2]")).getText());
        assertEquals("×\nPassword Confirmation: The two password fields didn't match.", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[3]")).getText());
        assertEquals("×\nUsername: Ensure this value has at most 30 characters (it has 39).", getDriver().findElement(By.xpath("//div[@id='user-fields']/div/div[2]/div[4]")).getText());



    }
    @Test

    public void Login_positive() throws InterruptedException {

        goHome();



        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.good");
        String pass= startPage.getProperty("password.good");
        startPage.Login(username, pass);
        startPage.finishLogin();
    }

    @Test

    public void Login_negative() throws InterruptedException {

        goHome();

        String Username = "lalalalalalalalalalalla";
        String Password = "lalalalalalalalalalalal";

        StartPage startPage = new StartPage();
        startPage.Login(Username, Password);
                //check for error text
        assertEquals("Sorry, your login entry doesn't match our records. Please try again.", getDriver().findElement(By.cssSelector("div.alert.alert-error")).getText());


    }

    @Test

    public void Login_empty() throws InterruptedException {

        goHome();

        String Username = "";
        String Password = "";

        StartPage startPage = new StartPage();
        startPage.Login(Username, Password);
             //check for error text
        assertEquals("Sorry, your login entry doesn't match our records. Please try again.", getDriver().findElement(By.cssSelector("div.alert.alert-error")).getText());


    }

    @Test

    public void Login_forgot_password() throws InterruptedException {

        goHome();

        //String Username = "";
       // String Password = "";
        String Email_address = value + "@yopmail.com";

        StartPage startPage = new StartPage();
        startPage.Login_forgot_password(Email_address);

        assertEquals("×\nEmail address: This email does not exists.", getDriver().findElement(By.cssSelector("div.alert")).getText());


    }


}
