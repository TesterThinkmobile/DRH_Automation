package tests;

import methods.HomePage;
import methods.MyDashboardPage;
import methods.StartPage;
import org.testng.annotations.Test;


public class MyDashboardPageTest extends BaseTest {

    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
    public void Change_data_profile() throws InterruptedException
    {

        goHome();

        String Occupation = value + "title";
        String Institution = value + "inst";
        String Location = value + "region";
        String Research = value ;

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        MyDashboardPage mydashboardPage = homePage.MyDashboardPage();
        mydashboardPage.Change_data_profile(Occupation, Institution, Location, Research);


    }

    @Test
    public void Create_a_new_Entity_button() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        MyDashboardPage mydashboardPage = homePage.MyDashboardPage();
        mydashboardPage.Create_a_new_Entity_button();


    }

    @Test
    public void Go_to_MyProfile() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        MyDashboardPage mydashboardPage = homePage.MyDashboardPage();
        mydashboardPage.Go_to_MyProfile();

    }

}
