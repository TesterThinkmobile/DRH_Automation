package methods;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntityPage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init()
    {

    }

    public EntityPage()
    {
        super();

    }
    public void Status_of_Participants() throws InterruptedException {


        //continue button
        WebElement completing_the_poll_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[3]/button"));
        completing_the_poll_button.click();
        wait_sec();

        //Elite
        WebElement elite_checkbox = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[1]/div/div[2]/label[1]/input"));
        elite_checkbox.isDisplayed();
        elite_checkbox.click();
        wait_sec();

        //Religious Specialists
        WebElement religious_specialists_checkbox = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[1]/div/div[2]/label[2]/input"));
        religious_specialists_checkbox.isDisplayed();
        religious_specialists_checkbox.click();
        wait_sec();

        //Non-elite
        WebElement non_elite_checkbox = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[1]/div/div[2]/label[3]/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", non_elite_checkbox);
        wait_sec();
        non_elite_checkbox.click();
        wait_sec();

    }


    public void answer_the_question_Sources(String Comments) throws InterruptedException {

        driver.manage().window().maximize();

        //"sources for..." field
        WebElement sources_for_field= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sources_for_field);
        wait_sec();
        sources_for_field.isDisplayed();
        sources_for_field.click();
        wait_sec();

        // "source 1" checkbox
        WebElement source_1_checkbox= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[1]/label[2]/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", source_1_checkbox);
        wait_sec();
        source_1_checkbox.isDisplayed();
        source_1_checkbox.click();
        wait_sec();

        // "source 1" field
        WebElement source_1_field= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[1]/textarea[1]"));
        source_1_field.sendKeys(Comments);
        wait_sec();

        // "source 2" checkbox
        WebElement source_2_checkbox= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[1]/label[3]/input"));
        source_2_checkbox.isDisplayed();
        source_2_checkbox.click();
        wait_sec();

        // "source 2" field
        WebElement source_2_field= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[1]/textarea[2]"));
        source_2_field.sendKeys(Comments);
        wait_sec();

        // "source 3" checkbox
        WebElement source_3_checkbox= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[1]/label[4]/input"));
        source_3_checkbox.isDisplayed();
        source_3_checkbox.click();
        wait_sec();

        // "source 3" field
        WebElement source_3_field= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[1]/textarea[3]"));
        source_3_field.sendKeys(Comments);


        // "comments" field
        WebElement comments_source_field= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[1]/textarea[4]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comments_source_field);
        wait_sec();
        comments_source_field.sendKeys(Comments);



        // "save" button
        WebElement save_source_button= driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div/form/button[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", save_source_button);
        wait_sec();
        save_source_button.click();
        wait_sec();

    }

    //-----------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------General Religion Variables----------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------


//----------------------------Membership\Group Interactions------------------------------

    public void Membership_Groupn_Interactions_questions(String Comments) throws InterruptedException {

        driver.manage().window().maximize();

            int i = 1;             //tab
            //  tab_fields
            WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div["+i+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",tab_field);
            wait_sec();
            tab_field.isDisplayed();
            tab_field.click();
            wait_sec();
            wait_sec();


            for (int j = 1; j <= 5; j = j+1) {

                //  questions_fields
                WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
//                wait_sec();
//                questions_fields.click();
//                wait_sec();
//                wait_sec();
                clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
                wait_sec();
                wait_sec();

                // yes_button
                WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
                //wait_sec();
                yes_button.isDisplayed();
                yes_button.click();
                wait_sec();

                // questions_comments
                WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
                wait_sec();
                question_comments.sendKeys(Comments);
                wait_sec();
            }

        }



//---------------------------------------------Size and Structure---------------------------------------

    public void Size_and_struct_question(String Comments, String WriteField) throws InterruptedException {


        int i = 2;         //tab
        //  tab_fields
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();


        for (int j = 1; j <= 2; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
//            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            wait_sec();
            wait_sec();

            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();

            //yes_field
            WebElement yes_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/input"));
            yes_field.sendKeys(WriteField);
            wait_sec();

            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }
    }

    //------------------------------------------------Scripture------------------------------------

    public void Scripture_questions(String Comments) throws InterruptedException
    {
        int i = 3;         //tab
        //  tab_fields
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 1; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
//            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i +"]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }
    }

    //--------------------------------------------Architecture_Geography-----------------------------------------

    public void Architecture_Geography_questions(String Comments) throws InterruptedException
    {
        int i = 4;         //tab
        //  tab_fields
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 3; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
//            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            wait_sec();
            wait_sec();

            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }
    }

//----------------------------------------Additional questions---------------------------------------------

    public void Additional_questions_1_tab(String Comments) throws InterruptedException
    {
        //button show_questions
        WebElement show_questions_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[5]/div[1]/div[2]/div/btn[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", show_questions_button);
        wait_sec();
        show_questions_button.isDisplayed();
        show_questions_button.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 4; j = j + 1) {

            WebElement questions_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[5]/div[2]/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_field);
//            wait_sec();
//            questions_field.isDisplayed();
//            questions_field.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[5]/div[2]/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[5]/div[2]/div[" + j + "]/div/div[2]/div/form/div[1]/label[2]/input"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();

            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[2]/div[5]/div[2]/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();

        }
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------Beliefs-----------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------

    //--------------------------------Afterlife_Soul--------------------------------------------

    public void Afterlife_soul_questions(String Comments) throws InterruptedException {

        WebElement beliefs_tab = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[2]/ul/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", beliefs_tab);
        wait_sec();
        beliefs_tab.isDisplayed();
        beliefs_tab.click();
        wait_sec();
        wait_sec();

        int i = 1;
            WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
            wait_sec();
            tab_field.isDisplayed();
            tab_field.click();
            wait_sec();

            for (int j = 1; j <= 7; j = j + 1) {

                //  questions_fields
                WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
                wait_sec();
//                questions_fields.click();
//                wait_sec();
//                wait_sec();
                clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
                wait_sec();
                wait_sec();
                wait_sec();


                // yes_button
                WebElement yes_button = driver.findElement(By.xpath(" html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
                //wait_sec();
                yes_button.isDisplayed();
                yes_button.click();
                wait_sec();


                // questions_comments
                WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
                //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
                //wait_sec();
                question_comments.sendKeys(Comments);
                wait_sec();
            }
        }

    //---------------------------Supernatural_Beings--------------------
    public void Supernatural_Beings_questions(String Comments) throws InterruptedException {

        int i = 2;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 1; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
//            wait_sec();
//            wait_sec();
//            wait_sec();wait_sec();wait_sec();wait_sec();wait_sec();wait_sec();wait_sec();wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();
            wait_sec();wait_sec();
            wait_sec();
            wait_sec();

            // yes_button
            WebElement yes_button = driver.findElement(By.xpath(" html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }
    }

    //------------------------------------Supernatural_Monitorings---------------------------------------
    public void Supernatural_Monitorings_questions(String Comments) throws InterruptedException {

        int i = 3;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 3; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();
            wait_sec();

            // yes_button
            WebElement yes_button = driver.findElement(By.xpath(" html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }
    }

    //------------------------------------Messianism---------------------------------------

    public void Messianism_questions(String Comments) throws InterruptedException {

        int i = 4;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 1; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath(" html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }
    }

        //------------------------------------Norms and Moral Realism---------------------------------------

    public void Norms_and_Moral_Realism_questions(String Comments) throws InterruptedException {

        int i = 5;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + i + "]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 2; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath(" html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }


    public void Additional_questions_2_tab(String Comments) throws InterruptedException
    {

//        WebElement beliefs_tab = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[2]/ul/li[2]/a"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", beliefs_tab);
//        wait_sec();
//        beliefs_tab.isDisplayed();
//        beliefs_tab.click();
//        wait_sec();


        //button show_questions
        WebElement show_questions_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[6]/div[1]/div[2]/div/btn[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", show_questions_button);
        wait_sec();
        show_questions_button.isDisplayed();
        show_questions_button.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 2; j = j + 1) {

            WebElement questions_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[6]/div[2]/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_field);
            wait_sec();
            questions_field.isDisplayed();
//            questions_field.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[6]/div[2]/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[6]/div[2]/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();

            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[6]/div[2]/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();

        }
    }




//    public void pruklad (String Comments) throws  InterruptedException {
//
//        WebElement beliefs_tab = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[2]/ul/li[2]/a"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", beliefs_tab);
//        wait_sec();
//        beliefs_tab.isDisplayed();
//        beliefs_tab.click();
//        wait_sec();
//
//        for (int a=1; a<=5; a++) {
//            WebElement group = getDriver().findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[3]/div[" + a + "]/div/div[1]/a"));
//            group.click();
//            wait_sec();
//            List<WebElement> elementsRoot = driver.findElements(By.cssSelector(".accordion-toggle.clearfix.question-accordion.collapsed"));
//            for (WebElement question : elementsRoot) {
//             //   for (int i = 0; i <= elementsRoot.lastIndexOf(group); i++) {
//                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question);
//                    question.click();
//                    wait_sec();
//                    wait_sec();
//
//                    WebElement button_yes = (WebElement) driver.findElements(By.cssSelector(".radio>input"));
//                    button_yes.isDisplayed();
//                    button_yes.click();
//
//
//            }
//        }
//    }


    //-----------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------Generals Practices-----------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------

    //--------------------------------Membership Costs and Practices--------------------------------------------

        public void Membership_costs_and_Practices_tab(String Comments) throws InterruptedException
        {

        WebElement General_Practices_tab = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[2]/ul/li[3]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", General_Practices_tab);
        wait_sec();
        General_Practices_tab.isDisplayed();
        General_Practices_tab.click();
        wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();



            WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[4]/div/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
            wait_sec();
            tab_field.isDisplayed();
            tab_field.click();
            wait_sec();

            for (int j = 1; j <= 19; j = j + 1) {

                //  questions_fields
                WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[4]/div/div/div[2]/div/div["+j+"]/div/div[1]/a"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
                wait_sec();
//                questions_fields.click();
//                wait_sec();
//                wait_sec();
//                wait_sec();
                clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[4]/div/div/div[2]/div/div["+j+"]/div/div[1]/a"));
                wait_sec();
                wait_sec();wait_sec();
                wait_sec();


                // yes_button
                WebElement yes_button = driver.findElement(By.xpath(" html/body/div[1]/div[5]/div/div[2]/div[3]/div[4]/div/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
                //wait_sec();
                yes_button.isDisplayed();
                yes_button.click();
                wait_sec();
                wait_sec();


                // questions_comments
                WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[4]/div/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
                //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
                //wait_sec();
                question_comments.sendKeys(Comments);
                wait_sec();
            }

    }


    //-----------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------Institutions-----------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------

    //--------------------------------Walfare--------------------------------------------

    public void Welfare_tab(String Comments) throws InterruptedException
    {

        WebElement Institutions_tab = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[2]/ul/li[4]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Institutions_tab);
        wait_sec();
        Institutions_tab.isDisplayed();
        Institutions_tab.click();
        wait_sec();
        wait_sec();


        int i = 1;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 6; j = j + 1) {

            //  questions_fields

            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div[" + i + "]/div/div[2]/div/div[" + j + "]/div/div[1]/a"));
            wait_sec();
            wait_sec();
            wait_sec();

            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();



            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }

    //--------------------------------Education--------------------------------------------

    public void Education_tab(String Comments) throws InterruptedException
    {

        int i = 2;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();

        for (int j = 1; j <= 2; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
            wait_sec();
        }

    }

    //--------------------------------Bureaucracy--------------------------------------------

    public void Bureaucracy_tab(String Comments) throws InterruptedException
    {

        int i = 3;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 2; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }

    //--------------------------------Public Works--------------------------------------------

    public void Public_works_tab(String Comments) throws InterruptedException
    {

        int i = 4;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 6; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }


    //--------------------------------Taxation--------------------------------------------

    public void Taxation_tab(String Comments) throws InterruptedException
    {

        int i = 5;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 2; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }

    //--------------------------------Enforcement--------------------------------------------

    public void Enforcement_tab(String Comments) throws InterruptedException
    {

        int i = 6;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 8; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();

            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }

    //--------------------------------Warfare--------------------------------------------

    public void Warfare_tab(String Comments) throws InterruptedException
    {

        int i = 7;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 3; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();



            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }

    //--------------------------------Written Language--------------------------------------------

    public void Written_language_tab(String Comments) throws InterruptedException
    {

        int i = 8;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 3; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }


    //--------------------------------Calendar--------------------------------------------

    public void Calendar_tab(String Comments) throws InterruptedException
    {

        int i = 9;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 2; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }


    //--------------------------------Calendar--------------------------------------------

    public void Production_tab(String Comments) throws InterruptedException
    {

        int i = 10;
        WebElement tab_field = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_field);
        wait_sec();
        tab_field.isDisplayed();
        tab_field.click();
        wait_sec();
        wait_sec();

        for (int j = 1; j <= 2; j = j + 1) {

            //  questions_fields
            WebElement questions_fields = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions_fields);
            wait_sec();
//            questions_fields.click();
//            wait_sec();
//            wait_sec();
            clickElementAndWait(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[1]/a"));
            wait_sec();
            wait_sec();


            // yes_button
            WebElement yes_button = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/label[2]/input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yes_button);
            //wait_sec();
            yes_button.isDisplayed();
            yes_button.click();
            wait_sec();


            // questions_comments
            WebElement question_comments = driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[2]/div[3]/div[5]/div["+i+"]/div/div[2]/div/div["+j+"]/div/div[2]/div/form/div[1]/textarea"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_comments);
            //wait_sec();
            question_comments.sendKeys(Comments);
            wait_sec();
        }

    }



    public void Save_all() throws InterruptedException
    {

        WebElement save_all_button = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/button[1]"));
        save_all_button.click();
        wait_sec();wait_sec();wait_sec();wait_sec();wait_sec();
        wait_sec();wait_sec();wait_sec();wait_sec();wait_sec();

        WebElement alert_info = driver.findElement(By.cssSelector(".alert.alert-info"));
        alert_info.isDisplayed();
        //alert_info.click();
        wait_sec();


    }

    public void Publish_all() throws InterruptedException
    {
        WebElement publish_all_button = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/button[2]"));
        publish_all_button.isDisplayed();
        publish_all_button.click();
        wait_sec();

        WebElement publish_confirm_button = driver.findElement(By.xpath("html/body/div[1]/div[6]/div[3]/button[1]"));
        publish_confirm_button.isDisplayed();
        publish_confirm_button.click();
        wait_sec();
        publish_confirm_button.isDisplayed();
        publish_confirm_button.click();
        wait_sec();wait_sec();wait_sec();wait_sec();wait_sec();
        wait_sec();wait_sec();wait_sec();wait_sec();wait_sec();


        //continue button
        WebElement completing_the_poll_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[3]/button"));
        completing_the_poll_button.click();
        wait_sec();
        wait_sec();

        WebElement published_answers_tab = driver.findElement(By.cssSelector(".flap>div"));
        published_answers_tab.isDisplayed();
        wait_sec();

    }

    public void Pick_Window() throws InterruptedException
    {
        //continue button
        WebElement completing_the_poll_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[3]/button"));
        completing_the_poll_button.click();
        wait_sec();


        WebElement pick_button = driver.findElement(By.cssSelector("#pick-region"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pick_button);
        pick_button.isDisplayed();
        pick_button.click();
        wait_sec();

        WebElement clear_button = driver.findElement(By.cssSelector(".region-btn.region-clear"));
        clear_button.isDisplayed();
        wait_sec();

        WebElement choose_page_15 = driver.findElement(By.xpath("html/body/div[1]/div[9]/div/div[2]/div[2]/div[1]/div[2]/ul/li[16]/a"));
        choose_page_15.click();
        wait_sec();

        WebElement choose_map= driver.findElement(By.xpath("html/body/div[1]/div[9]/div/div[2]/div[2]/div[2]/div/div[43]/div/div/div[1]/div[2]"));
        choose_map.click();
        wait_sec();


        WebElement select_close_button  = driver.findElement(By.xpath("html/body/div[1]/div[9]/div/div[3]/button[1]"));
        select_close_button.click();
        wait_sec();

        WebElement reset_region_button  = driver.findElement(By.cssSelector("#resetStickyRegion"));
        reset_region_button.isDisplayed();
        wait_sec();
    }


    public void Change_date(String date) throws InterruptedException
    {


        //continue button
        WebElement completing_the_poll_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[3]/button"));
        completing_the_poll_button.click();
        wait_sec();


        WebElement year_1_field = driver.findElement(By.cssSelector("#year_covered_from_all"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", year_1_field);
        year_1_field.isDisplayed();
        year_1_field.sendKeys(date);
        wait_sec();

        WebElement change_age_button = driver.findElement(By.cssSelector(".btn.year-ce"));
        change_age_button.click();
        wait_sec();

        WebElement year_2_field = driver.findElement(By.cssSelector("#year_covered_to_all"));
        year_2_field.sendKeys(date);
        wait_sec();


        WebElement reset_button= driver.findElement(By.cssSelector("#resetStickyDates"));
        reset_button.isDisplayed();
        wait_sec();

    }


}


