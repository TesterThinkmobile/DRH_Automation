package tests;

import methods.HomePage;
import methods.StartPage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void Nav_bar_button_DRH() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.DRH_button();

    }

    @Test
    public void Nav_bar_buttons_Browse_to_Search() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.Browse_button();
        homePage.Visualize_button();
        homePage.Analyze_button();
        homePage.Contribute_button();
        homePage.Advanced_search_button();
        homePage.Home_button();

    }

    @Test
    public void Nav_bar_Help_buttons() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.Help_button();

    }

    @Test
    public void Nav_bar_Help_contact_buttons() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.Help_Contact_button();

    }

    @Test
    public void Nav_bar_Help_Documentation_buttons() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.Help_Documentation_button();

    }

    @Test
    public void Nav_bar_Username_buttons() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.Help_UserName_button();
        homePage.Help_UserName_MyProfile_button();
        homePage.Help_UserName_button();
        homePage.Help_UserName_Visualize_button();
        homePage.Help_UserName_button();
        homePage.Help_UserName_Search_button();


    }

    @Test
    public void Nav_bar_LogOut_buttons() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.Help_UserName_button();
        homePage.Help_UserName_LogOut_button();

    }

    @Test
    public void Search_field() throws InterruptedException
    {

        goHome();

        String Search_field = "test";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.NavBar_search_field(Search_field);

    }

    @Test
    public void choose_entity_inDropdownlist() throws InterruptedException
    {

        goHome();

        String Search_field = "test";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        homePage.NavBar_choose_entity_inDropdownlist(Search_field);

    }


}
