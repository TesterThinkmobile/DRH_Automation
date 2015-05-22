package tests;


import methods.EntityPage;
import methods.HomePage;
import methods.StartPage;
import org.testng.annotations.Test;

public class EntityPageTest extends BaseTest {

    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);


    @Test
      public void A_Entity_sources_question() throws InterruptedException
    {

        goHome();

        String Comments = value+value+value + "are comments";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        EntityPage entityPage = homePage.ChooseEntityPage();
        entityPage.Status_of_Participants();
        entityPage.answer_the_question_Sources(Comments);

    }

    @Test
    public void B_Entity_GeneralReligionVariables() throws InterruptedException
    {

        goHome();

        String Comments = value+value+value + "are comments";
        String WriteField = value;

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        EntityPage entityPage = homePage.ChooseEntityPage();
        entityPage.Status_of_Participants();
        entityPage.Membership_Groupn_Interactions_questions(Comments);
        entityPage.Size_and_struct_question(Comments, WriteField);
        entityPage.Scripture_questions(Comments);
        entityPage.Architecture_Geography_questions(Comments);
        entityPage.Additional_questions_1_tab(Comments);
        entityPage.Save_all();
    }

    @Test
    public void C_Entity_Beliefs() throws InterruptedException
    {

        goHome();

        String Comments = value+value+value + "are comments";
        String WriteField = value;

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        EntityPage entityPage = homePage.ChooseEntityPage();
        entityPage.Status_of_Participants();
        entityPage.Afterlife_soul_questions(Comments);
        entityPage.Supernatural_Beings_questions(Comments);
        entityPage.Supernatural_Monitorings_questions(Comments);
        entityPage.Messianism_questions(Comments);
        entityPage.Norms_and_Moral_Realism_questions(Comments);
        entityPage.Additional_questions_2_tab(Comments);
       // entityPage.pruklad(Comments);
        entityPage.Save_all();
    }


    @Test
    public void D_Entity_Generals_Practices() throws InterruptedException
    {

        goHome();

        String Comments = value+value+value + "are comments";
        String WriteField = value;

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        EntityPage entityPage = homePage.ChooseEntityPage();
        entityPage.Status_of_Participants();
        entityPage.Membership_costs_and_Practices_tab(Comments);
        // entityPage.pruklad(Comments);
        entityPage.Save_all();
        //entityPage.Publish_all();
    }

    @Test
    public void E_Entity_Institutions() throws InterruptedException
    {

        goHome();

        String Comments = value+value+value + "are comments";
        String WriteField = value;

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        EntityPage entityPage = homePage.ChooseEntityPage();
        entityPage.Status_of_Participants();
        //-----------------------------------
        entityPage.Welfare_tab(Comments);
        entityPage.Education_tab(Comments);
        entityPage.Bureaucracy_tab(Comments);
        entityPage.Public_works_tab(Comments);
        entityPage.Taxation_tab(Comments);
        entityPage.Enforcement_tab(Comments);
        entityPage.Warfare_tab(Comments);
        entityPage.Written_language_tab(Comments);
        entityPage.Calendar_tab(Comments);
        entityPage.Production_tab(Comments);
        //-------------------------------------
        // entityPage.pruklad(Comments);
         entityPage.Save_all();
         entityPage.Publish_all();
    }

    @Test
    public void F_Entity_Pick_window() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass = startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        EntityPage entityPage = homePage.ChooseEntityPage();
        entityPage.Pick_Window();



    }

    @Test
    public void G_change_date_entity() throws InterruptedException {

        goHome();

        String date = "111";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass = startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        EntityPage entityPage = homePage.ChooseEntityPage();
        entityPage.Change_date(date);


    }

}
