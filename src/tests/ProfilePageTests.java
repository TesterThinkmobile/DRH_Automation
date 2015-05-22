package tests;


import methods.HomePage;
import methods.ProfilePage;
import methods.StartPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class ProfilePageTests extends BaseTest {
    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
    public void Edit_data_positive() throws InterruptedException {

        goHome();

        String firstName = "user"+value;
        String lastName = "user"+value;
        String Email = value+"@yopmail.com";
        String occupationTitle = "title"+value;
        String Institution = "institution"+value;
        String Location = "Ukraine"+value;
        String WebSite = "http://www."+ value +".com";
        String Biography = value+value+value+value+value+value+value+value+value+value+value+value;
        String ResearchInterest = "interest"+value;


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.good");
        String pass= startPage.getProperty("password.good");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ProfilePage profilePage = homePage.MyProfile();
        profilePage.EditData(firstName, lastName, Email, occupationTitle, Institution, Location, WebSite, Biography, ResearchInterest);

         assertEquals("×\nFirst name changed.", getDriver().findElement(By.cssSelector("div.alert.alert-info")).getText());
        assertEquals("×\nLast name changed.", getDriver().findElement(By.xpath("//div[@id='wrap-content']/section/div/div/div[2]/div/div[2]/div[2]")).getText());
        assertEquals("×\nEmail changed.", getDriver().findElement(By.xpath("//div[@id='wrap-content']/section/div/div/div[2]/div/div[2]/div[3]")).getText());
        assertEquals("×\nYour profile has been updated successfully.", getDriver().findElement(By.xpath("//div[@id='wrap-content']/section/div/div/div[2]/div/div[2]/div[4]")).getText());



    }

    @Test
    public void Edit_data_negative() throws InterruptedException {

        goHome();

        String firstName = "user"+value;
        String lastName = "user"+value;
        String Email = value;
        String occupationTitle = "title"+value;
        String Institution = "institution"+value;
        String Location = "Ukraine"+value;
        String WebSite = value +".com";
        String Biography = value+value+value+value+value+value+value+value+value+value+value+value;
        String ResearchInterest = "interest"+value;


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.good");
        String pass= startPage.getProperty("password.good");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ProfilePage profilePage = homePage.MyProfile();
        profilePage.EditData(firstName, lastName, Email, occupationTitle, Institution, Location, WebSite, Biography, ResearchInterest);

        assertEquals("×\nWebsite: Enter a valid value.", getDriver().findElement(By.cssSelector("div.alert")).getText());
        assertEquals("×\nEmail: Enter a valid email address.", getDriver().findElement(By.xpath("//div[@id='wrap-content']/section/div/div/div[2]/div/div[2]/div[2]")).getText());

    }

    @Test
    public void Edit_data_empty() throws InterruptedException {

        goHome();

        String firstName = "";
        String lastName = "";
        String Email = "";
        String occupationTitle = "";
        String Institution = "";
        String Location = "";
        String WebSite = "";
        String Biography = "";
        String ResearchInterest = "";


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.good");
        String pass= startPage.getProperty("password.good");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ProfilePage profilePage = homePage.MyProfile();
        profilePage.EditData(firstName, lastName, Email, occupationTitle, Institution, Location, WebSite, Biography, ResearchInterest);

        assertEquals("×\nFirst name changed.", getDriver().findElement(By.cssSelector("div.alert.alert-info")).getText());
        assertEquals("×\nLast name changed.", getDriver().findElement(By.xpath("//div[@id='wrap-content']/section/div/div/div[2]/div/div[2]/div[2]")).getText());
        //assertEquals("×\nYour profile has been updated successfully.", getDriver().findElement(By.xpath("//div[@id='wrap-content']/section/div/div/div[2]/div/div[2]/div[3]")).getText());

    }
    @Test
    public void Upload_File() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.good");
        String pass= startPage.getProperty("password.good");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ProfilePage profilePage = homePage.MyProfile();
        String Path = profilePage.getProperty("path.image");
        profilePage.Upload_file(Path);


        assertEquals("×\nYour profile has been updated successfully.", getDriver().findElement(By.cssSelector("div.alert.alert-info")).getText());

    }

    @Test
    public void Change_Password_correct() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.good");
        String pass= startPage.getProperty("password.good");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ProfilePage profilePage = homePage.MyProfile();
        String pass_old = profilePage.getProperty("password.old");
        String pass_new =  profilePage.getProperty("password.new");
        String pass_confirm = profilePage.getProperty("password.confirm");
        profilePage.Change_Password(pass_old, pass_new, pass_confirm);


        assertEquals("×\nPassword changes successfully", getDriver().findElement(By.cssSelector("div.alert.alert-info")).getText());

    }

    @Test
     public void Change_Password_incorrect() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.good");
        String pass= startPage.getProperty("password.good");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ProfilePage profilePage = homePage.MyProfile();
        String pass_old = profilePage.getProperty("password.old");
        String pass_new =  profilePage.getProperty("password.new");
        String pass_confirm = profilePage.getProperty("password.confirm_incorrect");
        profilePage.Change_Password(pass_old, pass_new,pass_confirm);


        assertEquals("×\nNew password and confirmation do not match", getDriver().findElement(By.cssSelector("div.alert")).getText());


    }

    @Test
    public void Change_Password_empty() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.good");
        String pass= startPage.getProperty("password.good");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ProfilePage profilePage = homePage.MyProfile();
        String pass_old = "";
        String pass_new =  "";
        String pass_confirm = "";
        profilePage.Change_Password(pass_old, pass_new,pass_confirm);


        assertEquals("×\nInvalid current password.", getDriver().findElement(By.cssSelector("div.alert")).getText());
        assertEquals("×\nPlease enter new password.", getDriver().findElement(By.xpath("//form[@id='change_password']/div[2]")).getText());
        assertEquals("×\nPlease confirm new password.", getDriver().findElement(By.xpath("//form[@id='change_password']/div[3]")).getText());


    }

}
