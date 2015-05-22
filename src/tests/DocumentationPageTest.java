package tests;


import methods.DocumentationPage;
import methods.HomePage;
import methods.StartPage;
import org.testng.annotations.Test;

public class DocumentationPageTest extends BaseTest {

    @Test
    public void About_the_DRH() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        documentationPage.read_less_buttons();

    }


    @Test
    public void Getting_Involved() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_getting_involved();
        documentationPage.link_contributors();
        //-----------------------------------------
        documentationPage.goto_getting_involved();
        documentationPage.link_getting_started();
        //-----------------------------------------
        documentationPage.goto_getting_involved();
        documentationPage.link_getting_DRH_editors();

    }

    @Test
    public void Getting_Started() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_getting_started();
        documentationPage.link_fields();
        //-------------------------------------
        documentationPage.goto_getting_started();
        documentationPage.title_fields();
        //-------------------------------------
        documentationPage.goto_getting_started();
        documentationPage.link_CreatingAnEntity_1();


    }

    @Test
      public void Overview_Of_Questionnaire() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_OverviewOfQuestionnaire();
        documentationPage.link_here_1_OverviewOfQuestionnaire();
        //---------------------------------------------------
        documentationPage.link_here_2_OverviewOfQuestionnaire();

    }

    @Test
    public void Tree_of_Religious_Group() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_TreeOfReligiousGroups();


    }

    @Test
    public void Browsing_Visualizing_and_Analyzing_the_Database() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_Browsing_Visualizing_and_Analyzing_the_Database();
        documentationPage.click_link_image();


    }

    @Test
    public void Research_and_Pedagogical_Uses() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_Research_and_Pedagogical_Uses();


    }

    @Test
    public void Contributors() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_Contributors();
        documentationPage.goto_link_to_profile_Tester();
        documentationPage.goto_link_to_entity_in_browse();

    }

    @Test
    public void Regional_Editors() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_Regional_editors();

    }

    @Test
    public void Personnel() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_Personnel();
        documentationPage.link_personnel();

    }

    @Test
    public void FAQ() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_FAQ();
        documentationPage.click_to_questions();

    }


    @Test
    public void Contact() throws InterruptedException
    {

        goHome();

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        DocumentationPage documentationPage = homePage.DocumentationPage();
        //-----------------------------------------
        documentationPage.goto_Contact();

    }



}
