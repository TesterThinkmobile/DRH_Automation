package methods;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends  BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public ContactPage()
    {

        super();

    }

    //------------------UpBar---------------------
    public void DRH_button() throws InterruptedException {

        //DRH_button
        WebElement DRH_button = driver.findElement(By.xpath("html/body/div[1]/div/div/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DRH_button);
        DRH_button.isDisplayed();
        DRH_button.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector("#resizeScroll"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", about_button);
        title_is_displayed.isDisplayed();

    }

    public void about_button() throws InterruptedException {


        WebElement about_button = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/ul/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", about_button);
        about_button.isDisplayed();
        about_button.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector(".about-splash.bluegradient"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", about_button);
        title_is_displayed.isDisplayed();

    }

    public void Contribute_button() throws InterruptedException {


        WebElement Contribute_button = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/ul/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Contribute_button);
        Contribute_button.isDisplayed();
        Contribute_button.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector(".about-splash.bluegradient"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", about_button);
        title_is_displayed.isDisplayed();

    }

    public void FAQ_button() throws InterruptedException {


        WebElement FAQ_button = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/ul/li[3]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FAQ_button);
        FAQ_button.isDisplayed();
        FAQ_button.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector(".about-splash.bluegradient"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", about_button);
        title_is_displayed.isDisplayed();

    }

    public void Username_button() throws InterruptedException {


        WebElement Username_button = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/ul/li[5]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Username_button);
        Username_button.isDisplayed();
        Username_button.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector(".settings-splash.bluegradient"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", about_button);
        title_is_displayed.isDisplayed();

    }

    //-------------------DownBar------------------------------

    public void Contribute_button_down() throws InterruptedException {

        //Contribute_button
        WebElement Contribute_button = driver.findElement(By.xpath("html/body/footer/div/div/div[2]/ul/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Contribute_button);
        Contribute_button.isDisplayed();
        Contribute_button.click();
        wait_sec();


    }

    public void Personnel_button_down() throws InterruptedException {

        //Personnel_button
        WebElement Personnel_button = driver.findElement(By.xpath("html/body/footer/div/div/div[2]/ul/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Personnel_button);
        Personnel_button.isDisplayed();
        Personnel_button.click();
        wait_sec();


    }

    public void FAQ_button_down() throws InterruptedException {

        //FAQ_button
        WebElement FAQ_button = driver.findElement(By.xpath("html/body/footer/div/div/div[2]/ul/li[3]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FAQ_button);
        FAQ_button.isDisplayed();
        FAQ_button.click();
        wait_sec();

    }

    public void TermOfUse_button_down() throws InterruptedException {

        //term of use_button
        WebElement TermOfUse_button = driver.findElement(By.xpath("html/body/footer/div/div/div[2]/ul/li[4]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TermOfUse_button);
        TermOfUse_button.isDisplayed();
        TermOfUse_button.click();
        wait_sec();

    }

    public void CERC_button() throws InterruptedException {


        WebElement CERC_button = driver.findElement(By.xpath("html/body/footer/div/div/div[3]/ul/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CERC_button);
        CERC_button.isDisplayed();
        CERC_button.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector("#ubc7-logo>a"));
        title_is_displayed.isDisplayed();

    }

    public void HECC_button() throws InterruptedException {


        WebElement HERC_button = driver.findElement(By.xpath("html/body/footer/div/div/div[3]/ul/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HERC_button);
        HERC_button.isDisplayed();
        HERC_button.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector("#ubc7-logo>a"));
        title_is_displayed.isDisplayed();

    }

    public void SSHRC_button() throws InterruptedException {


        WebElement SSHRC_button = driver.findElement(By.xpath("html/body/footer/div/div/div[3]/ul/li[3]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SSHRC_button);
        SSHRC_button.isDisplayed();
        SSHRC_button.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector("#wb-head-in"));
        title_is_displayed.isDisplayed();

    }


    public void Send_message(String Name, String Email, String Message) throws InterruptedException {


        WebElement field_name = driver.findElement(By.xpath("html/body/header/div/div/form/div[1]/div[2]/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", field_name);
        field_name.sendKeys(Name);
        wait_sec();

        WebElement field_email = driver.findElement(By.xpath("html/body/header/div/div/form/div[2]/div[2]/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", field_email);
        field_email.sendKeys(Email);
        wait_sec();

        WebElement field_message = driver.findElement(By.xpath("html/body/header/div/div/form/div[3]/div[2]/textarea"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", field_message);
        field_message.sendKeys(Message);
        wait_sec();

        WebElement send_button = driver.findElement(By.cssSelector(".send-contact"));
        send_button.isDisplayed();
        send_button.click();
        wait_sec();

        Assert.assertTrue(driver.findElement(By.cssSelector(".span9>input")).getText().contains(""));
        wait_sec();

    }


}
