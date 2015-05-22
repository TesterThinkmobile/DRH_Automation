package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class StartPage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public StartPage() {
        super();

    }

public void Registration(String firstName, String lastName, String inst, String userName, String email, String pass, String confPass) throws InterruptedException {


    // window maximize
    driver.manage().window().maximize();

    // Sign up button
    WebElement sign_up_button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
    sign_up_button.click();
    Thread.sleep(2000);

    //field "first name"
    WebElement first_name_field = driver.findElement(By.cssSelector("#id_first_name"));
    first_name_field.clear();
    first_name_field.sendKeys(firstName);
    Thread.sleep(500);

    // field "last name"
    WebElement last_name_field = driver.findElement(By.cssSelector("#id_last_name"));
    last_name_field.clear();
    last_name_field.sendKeys(lastName);
    Thread.sleep(500);

    //field "institution"
    WebElement institution_field = driver.findElement(By.cssSelector("#id_institution"));
    institution_field.clear();
    institution_field.sendKeys(inst);
    Thread.sleep(500);

    //field "Username"
    WebElement username_field = driver.findElement(By.xpath("html/body/div[1]/form/div[1]/div/div[2]/input[3]"));
    username_field.clear();
    username_field.sendKeys(userName);
    Thread.sleep(500);

    //field "email"
    WebElement email_field = driver.findElement(By.cssSelector("#id_email"));
    email_field.clear();
    email_field.sendKeys(email);
    Thread.sleep(500);

    //field "password"
    WebElement password_field = driver.findElement(By.cssSelector("#id_password1"));
    password_field.clear();
    password_field.sendKeys(pass);
    Thread.sleep(500);

    //field "Password confirmation"
    WebElement Password_confirmation_field = driver.findElement(By.cssSelector("#id_password2"));
    Password_confirmation_field.clear();
    Password_confirmation_field.sendKeys(confPass);
    Thread.sleep(500);

    //Button "Next"
    WebElement next_button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary.next-choose-editor"));
    next_button.click();
    wait_sec();
}

    public void finishReg() throws InterruptedException {

        // button "None of the above"
        WebElement NoneOfTheAbove_button = driver.findElement(By.xpath("html/body/div[1]/form/div[2]/div/div[2]/div[2]/ul[2]/li/div/div[2]/button"));
        NoneOfTheAbove_button.click();
        wait_sec();
        // button "Sign up"

        WebElement Sign_Up_button = driver.findElement(By.cssSelector("#sign-up"));
        Sign_Up_button.click();
        wait_sec();

        //button "How to get started"
        WebElement HowToGetStarted_button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        HowToGetStarted_button.click();
    }

    public void Login(String Username, String Password) throws InterruptedException {

        driver.manage().window().maximize();

            // login button
        WebElement login_button = driver.findElement(By.cssSelector(".btn-login"));
        login_button.click();
        wait_sec();
        wait_sec();

        //field "username"
        WebElement username_field = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/form/input[2]"));
        username_field.clear();
        username_field.sendKeys(Username);
        Thread.sleep(500);

        //field "password"
        WebElement password_field = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/form/input[3]"));
        password_field.clear();
        password_field.sendKeys(Password);
        Thread.sleep(500);

            //checkbox "remebrer me"
        WebElement checkbox = driver.findElement(By.cssSelector(".checkbox>input"));
        checkbox.click();
        Thread.sleep(500);

            //button "Login"
        WebElement Log_in_button = driver.findElement(By.cssSelector("#submit"));
        Log_in_button.click();
        Thread.sleep(500);




    }
    public void finishLogin() throws InterruptedException {


        //button "Home" is present
        wait_sec();
        WebElement home_button = driver.findElement(By.cssSelector(".nav>li>a"));
        home_button.isDisplayed();
    }

    public void Login_forgot_password(String Email_address) throws InterruptedException {

        driver.manage().window().maximize();

        // login button
        WebElement login_button = driver.findElement(By.cssSelector(".btn-login"));
        login_button.click();
        wait_sec();

        // link "forgot_pass"
        wait_sec();
        WebElement forgot_password_link = driver.findElement(By.cssSelector(".forgotpassword"));
        forgot_password_link.click();
        wait_sec();

        WebElement email_address_field = driver.findElement(By.cssSelector(".form-control"));
        email_address_field.sendKeys(Email_address);

        WebElement submit_button= driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/form/button"));
        submit_button.click();
        wait_sec();

    }

}

