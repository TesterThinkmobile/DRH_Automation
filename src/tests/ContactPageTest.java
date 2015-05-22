package tests;


import methods.ContactPage;
import methods.HomePage;
import methods.StartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactPageTest extends BaseTest {

    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
    public void about_button() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                contactPage.about_button();


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);



    }

    @Test
    public void Contributors_button() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                contactPage.Contribute_button();


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);



    }

    @Test
    public void FAQ_button() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                contactPage.FAQ_button();


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

    }

    @Test
    public void Username_button() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                contactPage.Username_button();


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

    }

    @Test
    public void Contributors_button_down() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                //-------------------------------------
                contactPage.Contribute_button_down();
                for (String handle1 : getDriver().getWindowHandles()) {
                    if (!handle1.equals(handle)&&!handle1.equals(originalHandle)) {
                        getDriver().switchTo().window(handle1);
                        wait_sec();
                        //entity is displayed
                        WebElement title2_is_displayed = getDriver().findElement(By.cssSelector(".about-splash.bluegradient"));
                        title2_is_displayed.isDisplayed();
                        wait_sec();
                        getDriver().close();
                    }
                }
                getDriver().switchTo().window(handle);

                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);



    }

    @Test
    public void Personnel_button_down() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                //-------------------------------------------
                contactPage.Personnel_button_down();
                for (String handle1 : getDriver().getWindowHandles()) {
                    if (!handle1.equals(handle)&&!handle1.equals(originalHandle)) {
                        getDriver().switchTo().window(handle1);
                        wait_sec();
                        //entity is displayed
                        WebElement title2_is_displayed = getDriver().findElement(By.cssSelector(".about-splash.bluegradient"));
                        title2_is_displayed.isDisplayed();
                        wait_sec();
                        getDriver().close();
                    }
                }
                getDriver().switchTo().window(handle);

                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);



    }


    @Test
    public void FAQ_button_down() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                //-------------------------------------------
                contactPage.FAQ_button_down();
                for (String handle1 : getDriver().getWindowHandles()) {
                    if (!handle1.equals(handle)&&!handle1.equals(originalHandle)) {
                        getDriver().switchTo().window(handle1);
                        wait_sec();
                        //entity is displayed
                        WebElement title2_is_displayed = getDriver().findElement(By.cssSelector(".about-splash.bluegradient"));
                        title2_is_displayed.isDisplayed();
                        wait_sec();
                        getDriver().close();
                    }
                }
                getDriver().switchTo().window(handle);

                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);



    }


    @Test
    public void TermOfUse_button_down() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                //-------------------------------------------
                contactPage.TermOfUse_button_down();
                for (String handle1 : getDriver().getWindowHandles()) {
                    if (!handle1.equals(handle)&&!handle1.equals(originalHandle)) {
                        getDriver().switchTo().window(handle1);
                        wait_sec();
                        //entity is displayed
                        WebElement title2_is_displayed = getDriver().findElement(By.cssSelector("#ubc7-logo>a"));
                        title2_is_displayed.isDisplayed();
                        wait_sec();
                        getDriver().close();
                    }
                }
                getDriver().switchTo().window(handle);

                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);



    }

    @Test
    public void CERC_button() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                contactPage.CERC_button();


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

    }


    @Test
    public void HECC_button() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                contactPage.HECC_button();


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

    }

    @Test
    public void SSHRC_button() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                contactPage.SSHRC_button();


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

    }

    @Test
    public void Send_message() throws InterruptedException {

        goHome();

        String Name = "name"+value;
        String Email = value +"@yopmail.com";
        String Message = value+value+value+value+value+value+value+value+value;

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass = startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContactPage contactPage = homePage.ContactPage();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                contactPage.Send_message(Name,Email,Message);


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);


    }

}

