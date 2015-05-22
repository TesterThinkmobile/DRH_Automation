package tests;


import methods.*;
import org.testng.annotations.Test;

public class BrowsePageTest extends BaseTest {


    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);



    @Test
    public void search_field_correct_PartOfName() throws InterruptedException {

        goHome();

        String Search_name = "test";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        BrowsePage browsePage = homePage.BrowsePage();
        browsePage.search_entity(Search_name);

    }


    @Test
     public void search_field_correct_FullName() throws InterruptedException {

        goHome();

        String Alternative_name = "name"+value+"name";
        String Year1 = "12345";
        String Year2 = "12345" ;
        String Search = "test" ;
        String new_Name = value+"test";
        String Comments = value+value+value + "are comments";


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        ContributePage contributePage = homePage.CreatePage();
        contributePage.Create_new_Entity(new_Name,Alternative_name, Year1, Year2, Search);
        //---------------------
        EntityPage entityPage = homePage.ChooseEntityPage_for_Browse(new_Name);
        entityPage.Status_of_Participants();
        entityPage.Scripture_questions(Comments);
        entityPage.Save_all();
        entityPage.Publish_all();
        //---------------------
        BrowsePage browsePage = homePage.BrowsePage();
         browsePage.search_entity(new_Name);

    }

    @Test
    public void search_field_LessThen3symbol() throws InterruptedException {

        goHome();

        String Search_name = "te";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        BrowsePage browsePage = homePage.BrowsePage();
        browsePage.search_entity_LessThen3(Search_name);


    }

    @Test
    public void search_field_noResultsFound() throws InterruptedException {

        goHome();

        String Search_name = value + value + "test";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        BrowsePage browsePage = homePage.BrowsePage();
        browsePage.search_entity_noResult(Search_name);


    }


    @Test
    public void search_field_empty() throws InterruptedException {

        goHome();

        String Search_name = "";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        BrowsePage browsePage = homePage.BrowsePage();
        browsePage.search_entity(Search_name);



    }


    @Test
    public void entity_browse_status() throws InterruptedException {

        goHome();

        String Search_name = "";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        BrowsePage browsePage = homePage.BrowsePage();
        browsePage.search_entity(Search_name);
        browsePage.Choose_entity_browse();
        browsePage.status_browse();



    }

}
