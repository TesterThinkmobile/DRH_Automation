package tests;


import methods.HomePage;
import methods.StartPage;
import methods.VisualizePage;
import org.testng.annotations.Test;

public class VisualizePageTest extends BaseTest {

    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
    public void full_name_of_question() throws InterruptedException
    {

        goHome();

        String question_Name = "Are other religious groups in cultural contact with target religion:";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        VisualizePage visualizePage = homePage.VisualizePage();
        visualizePage.search_questions(question_Name);

    }


    @Test
    public void part_of_name_of_questions() throws InterruptedException
    {

        goHome();

        String question_Name = "ques";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        VisualizePage visualizePage = homePage.VisualizePage();
        visualizePage.search_questions(question_Name);

    }


    @Test
    public void cahnge_color_of_questions() throws InterruptedException
    {

        goHome();

        String question_Name = "ques";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        VisualizePage visualizePage = homePage.VisualizePage();
        visualizePage.search_questions(question_Name);
        visualizePage.change_color_of_question();
        visualizePage.hide_color_of_question();

    }

    @Test
    public void hide_color_of_questions() throws InterruptedException
    {

        goHome();

        String question_Name = "ques";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        VisualizePage visualizePage = homePage.VisualizePage();
        visualizePage.search_questions(question_Name);
        visualizePage.hide_color_of_question();

    }

    @Test
    public void change_map() throws InterruptedException
    {

        goHome();

        String question_Name = "ques";

        StartPage startPage = new StartPage();
        String username = startPage.getProperty("username.forwork");
        String pass= startPage.getProperty("password.forwork");
        startPage.Login(username, pass);
        HomePage homePage = new HomePage();
        VisualizePage visualizePage = homePage.VisualizePage();
        visualizePage.search_questions(question_Name);
        visualizePage.map_play();
        visualizePage.change_map();

    }


}
