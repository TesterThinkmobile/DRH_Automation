package tests;


import methods.ContributePage;
import methods.HomePage;
import methods.StartPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContributePageTest extends BaseTest {

    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
      public void Chose_Entity_positive() throws InterruptedException
    {

        goHome();

        String entity_name = "test";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Chose_Entity(entity_name);


    }

    @Test
    public void Chose_Entity_empty() throws InterruptedException
    {

        goHome();

        String entity_name = "";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Chose_Entity(entity_name);


        assertEquals("Please enter a name.", getDriver().findElement(By.cssSelector("div.alert.alert-error")).getText());


    }

    @Test
    public void Create_new_Entity_positive() throws InterruptedException
    {
        goHome();

        String Alternative_name = "name"+value+"name";
        String Year1 = "12345";
        String Year2 = "12345" ;
        String Search = "test" ;
        String new_Name = value+"test987";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Entity(new_Name,Alternative_name, Year1, Year2, Search);

    }

    @Test
    public void Create_new_Entity_negative() throws InterruptedException
    {
        goHome();

        String Alternative_name = "name"+value+"name";
        String Year1 = "12345";
        String Year2 = "12345";
        String Search = "asdasdasd";
        String new_Name = value+"test2"+"test1";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Entity(new_Name,Alternative_name, Year1, Year2, Search);

    }

    @Test
    public void Create_new_Entity_empty() throws InterruptedException
    {
        goHome();

        String Alternative_name = "";
        String Year1 = "";
        String Year2 = "";
       // String Search = "";
        String new_Name = value+"test3";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Entity_Empty(new_Name, Alternative_name, Year1, Year2);

        assertEquals("Default year covered to : This field is required.", getDriver().findElement(By.cssSelector("div.alert.alert-error")).getText());
        assertEquals("Default year covered from : This field is required.", getDriver().findElement(By.xpath("//div[@id='collapseOne']/div/div/div[2]")).getText());
        assertEquals("Entity type : This field is required.", getDriver().findElement(By.xpath("//div[@id='collapseOne']/div/div/div[3]")).getText());

    }

    @Test
    public void Create_new_Region_positive() throws InterruptedException {
        goHome();

        String Name_region = value + "region";
        String Description =value+value+value+value+value+value+value+value+value+value+value+value;
        String new_Name = value+"test123";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass = startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Region(Name_region,Description,new_Name);

    }

    @Test
    //poku ne pracue
    public void Create_new_Region_negative() throws InterruptedException {
        goHome();

        String Name_region = value + value+ value+value+value+ value + value+ value+value+value+value + value+ value+value+value+"region";
        String Description =value+value+value+value+value+value+value+value+value+value+value+value;
        String new_Name = value+"test321";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass = startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Region(Name_region,Description,new_Name);

    }

    @Test
    public void Create_new_Region_empty() throws InterruptedException {
        goHome();

        String Name_region = "";
        String Description = "";
        String new_Name = value + "test2231";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass = startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Region(Name_region,Description,new_Name);

        assertEquals("Name: This field is required.", getDriver().findElement(By.cssSelector("div.alert.alert-error")).getText());


    }


    @Test
    public void Create_new_Region_without_step2() throws InterruptedException {

        goHome();

        String Alternative_name = "name"+value+"name";
        String Year1 = "12345";
        String Year2 = "12345" ;
        String Search = "test" ;
        String new_Name = value+"test3214";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Entity_without_step2(new_Name, Alternative_name, Year1, Year2, Search);

        assertEquals("Please add at least one organizational tag to your group.", getDriver().findElement(By.cssSelector("div.alert.alert-error")).getText());



    }

    @Test
    public void Check_result() throws InterruptedException
    {

        goHome();

        String Alternative_name = "name"+value+"name";
        String Year1 = "12345";
        String Year2 = "12345" ;
        String Search = "test" ;
        String new_Name = value+"test2221321";
        //  String Name_of_Entity = value+"test";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Entity(new_Name,Alternative_name, Year1, Year2, Search);
        homePage.Check_Entity_in_HomePage();
        contributePage.Check_Result(new_Name);

    }

}