package methods;

import org.openqa.selenium.*;

public class DocumentationPage extends BasePage {


    WebDriver driver = getDriver();


    @Override
    protected void Init() {

    }

    public DocumentationPage() {

        super();

    }

    //------------------------------------------------------------------------------------------------------------
    // ------------------------------------------About the DRH----------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void read_less_buttons() throws InterruptedException {


        for (int i = 1; i <= 4; i++) {
            // reed more button1
            WebElement reed_more_button1 = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/ul/li[" + i + "]/div/button"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reed_more_button1);
            reed_more_button1.isDisplayed();
            reed_more_button1.click();
            wait_sec();

            WebElement text1_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/ul/li[" + i + "]/div/p[2]"));
            text1_is_displayed.isDisplayed();
            wait_sec();
        }


    }

    //------------------------------------------------------------------------------------------------------------
    //-------------------------------------Getting Involved-------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_getting_involved() throws InterruptedException {


        // button getting involved
        WebElement getting_involved = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getting_involved);
        getting_involved.isDisplayed();
        getting_involved.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[1]"));
        title_is_displayed.isDisplayed();
        wait_sec();


    }

    public void link_contributors() throws InterruptedException {


        // link_contributors
        WebElement link_contributors = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/p[5]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_contributors);
        link_contributors.isDisplayed();
        link_contributors.click();
        wait_sec();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[1]"));
        title_is_displayed.isDisplayed();
        wait_sec();


    }


    public void link_getting_started() throws InterruptedException {


        // link_Getting Started
        WebElement link_getting_started = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/p[6]/a[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_getting_started);
        link_getting_started.isDisplayed();
        link_getting_started.click();
        wait_sec();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[1]"));
        title_is_displayed.isDisplayed();
        wait_sec();


    }

    public void link_getting_DRH_editors() throws InterruptedException {


        // link_getting_DRH_editors
        WebElement link_getting_DRH_editors = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/p[6]/a[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_getting_DRH_editors);
        link_getting_DRH_editors.isDisplayed();
        link_getting_DRH_editors.click();
        wait_sec();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[1]"));
        title_is_displayed.isDisplayed();
        wait_sec();


    }

    //------------------------------------------------------------------------------------------------------------
    //---------------------Getting Started------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_getting_started() throws InterruptedException {


        // button getting involved
        WebElement getting_involved = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[3]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getting_involved);
        getting_involved.isDisplayed();
        getting_involved.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[1]"));
        title_is_displayed.isDisplayed();
        wait_sec();


    }

    public void link_fields() throws InterruptedException {


        for (int i = 1; i <= 4; i++) {

            WebElement link_fields = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/p/a[" + i + "]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_fields);
            link_fields.isDisplayed();
            link_fields.click();
            wait_sec();

            WebElement fields_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/div/div["+i+"]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fields_is_displayed);
            fields_is_displayed.isDisplayed();
            wait_sec();
        }

    }

    public void title_fields() throws InterruptedException {


        for (int i = 1; i <= 4; i++) {

            WebElement link_fields = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/div/a["+i+"]/h3"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_fields);
            link_fields.isDisplayed();
            link_fields.click();
            wait_sec();

            WebElement fields_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/div/div["+i+"]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fields_is_displayed);
            fields_is_displayed.isDisplayed();
            wait_sec();
        }

    }


    public void link_CreatingAnEntity_1() throws InterruptedException {


            WebElement creating_an_entity = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/div/a[2]/h3"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", creating_an_entity);
            creating_an_entity.isDisplayed();
            creating_an_entity.click();
            wait_sec();



            WebElement link_field = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/div/div[2]/div/p[2]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_field);
            link_field.isDisplayed();
            link_field.click();
            wait_sec();
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();

            WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[1]"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title_is_displayed);
            title_is_displayed.isDisplayed();
            wait_sec();

                getDriver().switchTo().window(handle);

                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);


    }

    //------------------------------------------------------------------------------------------------------------
    //-------------------------------Overview of Questionnaire----------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_OverviewOfQuestionnaire() throws InterruptedException {


        // button Overview of Questionnaire
        WebElement Overview_Of_Questionnaire = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[4]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Overview_Of_Questionnaire);
        Overview_Of_Questionnaire.isDisplayed();
        Overview_Of_Questionnaire.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[1]"));
        title_is_displayed.isDisplayed();
        wait_sec();


    }

    public void link_here_1_OverviewOfQuestionnaire() throws InterruptedException {


        WebElement link_here_1 = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/p[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_here_1);
        link_here_1.isDisplayed();
        link_here_1.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector(".overview-splash.bluegradient"));
        title_is_displayed.isDisplayed();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
        wait_sec();


    }

    public void link_here_2_OverviewOfQuestionnaire() throws InterruptedException {



        WebElement link_here_2 = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/p[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_here_2);
        link_here_2.isDisplayed();
        link_here_2.click();
        wait_sec();
       // ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();

    }

    //------------------------------------------------------------------------------------------------------------
    //-------------------------Tree of Religious Groups-----------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_TreeOfReligiousGroups() throws InterruptedException {


        // button Tree of Religious Groups
        WebElement Tree_of_Religious_Groups = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[5]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Tree_of_Religious_Groups);
        Tree_of_Religious_Groups.isDisplayed();
        Tree_of_Religious_Groups.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();

    }

    //------------------------------------------------------------------------------------------------------------
    //-------------------------Browsing, Visualizing and Analyzing the Database-----------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_Browsing_Visualizing_and_Analyzing_the_Database() throws InterruptedException {


        // button Browsing_Visualizing_and_Analyzing_the_Database

        WebElement Browsing_Visualizing_and_Analyzing_the_Database = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[6]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Browsing_Visualizing_and_Analyzing_the_Database);
        Browsing_Visualizing_and_Analyzing_the_Database.isDisplayed();
        Browsing_Visualizing_and_Analyzing_the_Database.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
    }
        //----click to image-------------

        public void click_link_image () throws InterruptedException {

        WebElement click_to_image = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/p[3]/a/img"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_to_image);
        click_to_image.click();
        wait_sec();

        // links open in page
        WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title_is_displayed);
        title_is_displayed.isDisplayed();
        wait_sec();

    }

    //------------------------------------------------------------------------------------------------------------
    //-------------------------Research and Pedagogical Uses------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_Research_and_Pedagogical_Uses() throws InterruptedException {


        // button Research and Pedagogical Uses

        WebElement Research_and_Pedagogical_Uses = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[7]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Research_and_Pedagogical_Uses);
        Research_and_Pedagogical_Uses.isDisplayed();
        Research_and_Pedagogical_Uses.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
    }


    //------------------------------------------------------------------------------------------------------------
    //----------------------------------------Contributors--------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_Contributors() throws InterruptedException {


        // button Contributors

        WebElement Contributors = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[8]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Contributors);
        Contributors.isDisplayed();
        Contributors.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
    }

    // open profile Tester
    public void goto_link_to_profile_Tester() throws InterruptedException {

        // field tester

        WebElement field_tester = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/div[3]/div/div[2]/h4/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", field_tester);
        field_tester.isDisplayed();
        field_tester.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section[2]/div/div"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
        wait_sec();

    }

    // open entity
    public void goto_link_to_entity_in_browse() throws InterruptedException {

        // field entity

        WebElement field_entity = driver.findElement(By.cssSelector(".contributor-widgets"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", field_entity);
        field_entity.isDisplayed();
        field_entity.findElement(By.cssSelector(".contributor-entity>li>a")).click();
        //field_entity.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.cssSelector(".poll-splash.poll-browse.bluegradient"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
        wait_sec();

    }

    //------------------------------------------------------------------------------------------------------------
    //----------------------------------------Regional Editors--------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_Regional_editors() throws InterruptedException {


        // button Regional Editors

        WebElement Regional_editors = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[9]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Regional_editors);
        Regional_editors.isDisplayed();
        Regional_editors.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
    }
//    public void view_profile_editors() throws InterruptedException {
//
//        // field profile_editors
//
//        WebElement field_rofile = driver.findElement(By.cssSelector(".view-profile"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", field_rofile);
//        field_rofile.isDisplayed();
//        field_rofile.click();
//        wait_sec();
//
//        WebElement content_is_displayed = driver.findElement(By.cssSelector(".poll-splash.poll-browse.bluegradient"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
//        content_is_displayed.isDisplayed();
//        wait_sec();
//        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
//        wait_sec();
//        wait_sec();
//
//    }


    //------------------------------------------------------------------------------------------------------------
    //----------------------------------------Personnel--------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_Personnel() throws InterruptedException {


        // button Personnel

        WebElement Personnel = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[10]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Personnel);
        Personnel.isDisplayed();
        Personnel.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
    }


    public void link_personnel() throws InterruptedException {

        // button Personnel

        WebElement link_department = driver.findElement(By.cssSelector(".personnel-text.line-up>a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link_department);
        link_department.isDisplayed();
        link_department.click();
        wait_sec();

        WebElement title_is_displayed = driver.findElement(By.cssSelector(".au_padding"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title_is_displayed);
        title_is_displayed.isDisplayed();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
        wait_sec();
    }


    //------------------------------------------------------------------------------------------------------------
    //----------------------------------------FAQ--------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_FAQ() throws InterruptedException {


        // button FAQ

        WebElement FAQ = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[11]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FAQ);
        FAQ.isDisplayed();
        FAQ.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
    }


    public void click_to_questions() throws InterruptedException {

        // click_to_questions

        for (int i = 1 ; i <= 6; i++) {
            WebElement click_to_questions = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/div/div["+i+"]/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_to_questions);
            click_to_questions.isDisplayed();
            click_to_questions.click();
            wait_sec();

            WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/div/div/div["+i+"]/div[2]/div"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
            content_is_displayed.isDisplayed();
            wait_sec();
        }
    }


    //------------------------------------------------------------------------------------------------------------
    //----------------------------------------ContactPage--------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------

    public void goto_Contact() throws InterruptedException {


        // button ContactPage

        WebElement Contact = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/ul/li[12]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Contact);
        Contact.isDisplayed();
        Contact.click();
        wait_sec();

        WebElement content_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content_is_displayed);
        content_is_displayed.isDisplayed();
        wait_sec();
    }

}
