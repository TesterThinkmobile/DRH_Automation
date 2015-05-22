package methods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ContributePage extends BasePage {


    WebDriver driver = getDriver();

    @Override
    protected void Init()
    {

    }

    public ContributePage()
    {
        super();

    }
    public void Chose_Entity(String entity_name) throws InterruptedException
    {
        driver.manage().window().maximize();

        // "name" fiels
        WebElement field_name = driver.findElement(By.cssSelector(".form-control.ui-autocomplete-input"));
        field_name.sendKeys(entity_name);
        Thread.sleep(1000);

        try {
            //dropdown list is displayed
            WebElement drop_down_list = driver.findElement(By.cssSelector("#ui-id-2"));
            drop_down_list.isDisplayed();
            Thread.sleep(1000);

            //choose one of the entity in dropdown list
            WebElement choose_entity = driver.findElement(By.xpath("html/body/ul[2]/li[7]/a"));
            choose_entity.click();
            Thread.sleep(1000);

            //button select
            WebElement button_select = driver.findElement(By.cssSelector("#step1-continue"));
            button_select.click();
            Thread.sleep(1000);

            //down nab_bar is displayed
            WebElement down_navbar = driver.findElement(By.cssSelector(".submit-footer.navbar-fixed-bottom"));
            down_navbar.isDisplayed();
            Thread.sleep(500);
        }
        catch(Exception error)
        {
            //button select
            WebElement button_select = driver.findElement(By.cssSelector("#step1-continue"));
            button_select.click();
            Thread.sleep(1000);
        }


    }

    public void Create_new_Entity(String new_Name, String Alternative_name, String Year1, String Year2, String Search) throws InterruptedException
    {
        driver.manage().window().maximize();

        //field "entry name"
        WebElement field_name = driver.findElement(By.cssSelector(".form-control.ui-autocomplete-input"));
        field_name.sendKeys(new_Name);
        wait_sec();

        WebElement button_select = driver.findElement(By.cssSelector("#step1-continue"));
        button_select.click();
        wait_sec();
//----------------------------------------------------Step 1----------------------------------------------
        WebElement button_continue_completing_the_poll = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/button"));
        button_continue_completing_the_poll.isDisplayed();
        button_continue_completing_the_poll.click();
        wait_sec();

        // button "add alternative name"
        WebElement add_alternative_name = driver.findElement(By.cssSelector("#add-create-name-form"));
        add_alternative_name.isDisplayed();
        add_alternative_name.click();
        wait_sec();

        // field "add......name"
        WebElement field_add_alternative_name = driver.findElement(By.cssSelector("#id_create-1-name"));
        field_add_alternative_name.isDisplayed();
        field_add_alternative_name.sendKeys(Alternative_name);
        wait_sec();


        // year1
        WebElement field_year1 = driver.findElement(By.cssSelector("#id_create-default_year_covered_from"));
        field_year1.sendKeys(Year1);
        wait_sec();

        // year button
        WebElement year_button = driver.findElement(By.cssSelector(".btn.year-ce.btn-primary"));
        year_button.click();
        wait_sec();

        // year2
        WebElement field_year2 = driver.findElement(By.cssSelector("#id_create-default_year_covered_to"));
        field_year2.sendKeys(Year2);
        wait_sec();

        // religion radiobutton
        WebElement religion_radiobutton = driver.findElement(By.cssSelector(".radio.normal-text>input"));
        religion_radiobutton.click();
        wait_sec();

        // save2 button
        WebElement save1_button = driver.findElement(By.cssSelector("#step2-continue"));
        save1_button.click();
        wait_sec();


//----------------------------------------------------Step 2----------------------------------------------
        //added tags field is displayed
        WebElement field_added_tags = driver.findElement(By.cssSelector(".no-margin-bottom"));
        field_added_tags.isDisplayed();
        Thread.sleep(1000);

        //add tag "Religon"
        WebElement tag_religion = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/ul/li[2]/a"));
        tag_religion.click();
        Thread.sleep(1000);

        WebElement tag_religion_added = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div"));
        tag_religion_added.isDisplayed();
        Thread.sleep(3000);

        //add new tag in "Religon" list
        WebElement new_tag_religion = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/ul/li[10]/a"));
        new_tag_religion.click();
        Thread.sleep(3000);
        WebElement new_tag_religion_added = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[1]/span"));
        new_tag_religion_added.isDisplayed();
        Thread.sleep(3000);

        // save2 button
        WebElement save2_button = driver.findElement(By.cssSelector("#step3-continue"));
        save2_button.click();
        Thread.sleep(2000);

//----------------------------------------------------Step 3----------------------------------------------

       // left field is displayed
        WebElement left_field_displ = driver.findElement(By.cssSelector(".pull-left"));
        left_field_displ.isDisplayed();
        wait_sec();

        //search field
        WebElement search_field = driver.findElement(By.cssSelector(".form-control.js-search-regions"));
        search_field.sendKeys(Search);
        wait_sec();

        try {
            //choose region with search
            WebElement choose_region = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[3]/div/div[2]/div[3]/div[2]/div[1]/div[4]/div/div/div[1]/div[2]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", choose_region);
            choose_region.click();
            wait_sec();
            wait_sec();

            // save3 button
            WebElement save3_button = driver.findElement(By.cssSelector("#step4-continue"));
            save3_button.click();
            wait_sec();

//---------------------------------------------------------Entity is created-------------------------------------------------------

            //down nab_bar is displayed
            WebElement down_navbar = driver.findElement(By.cssSelector(".submit-footer.navbar-fixed-bottom"));
            down_navbar.isDisplayed();
            Thread.sleep(500);
            wait_sec();

        }
        catch(Exception error)
        {
            WebElement save3_button = driver.findElement(By.cssSelector("#step4-continue"));
            save3_button.click();

            //error
            WebElement error_label= driver.findElement(By.cssSelector("#myModalLabel"));
            error_label.isDisplayed();
            System.out.println(error);
            wait_sec();
        }

    }

    public void Create_new_Entity_Empty(String new_Name, String Alternative_name, String Year1, String Year2) throws InterruptedException {
        driver.manage().window().maximize();

        //field "entry name"
        WebElement field_name = driver.findElement(By.cssSelector(".form-control.ui-autocomplete-input"));
        field_name.sendKeys(new_Name);
        wait_sec();

        WebElement button_select = driver.findElement(By.cssSelector("#step1-continue"));
        button_select.click();
        wait_sec();
//----------------------------------------------------Step 1----------------------------------------------
        WebElement button_continue_completing_the_poll = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/button"));
        button_continue_completing_the_poll.isDisplayed();
        button_continue_completing_the_poll.click();
        wait_sec();

        // button "add alternative name"
        WebElement add_alternative_name = driver.findElement(By.cssSelector("#add-create-name-form"));
        add_alternative_name.isDisplayed();
        add_alternative_name.click();
        wait_sec();

        // field "add......name"
        WebElement field_add_alternative_name = driver.findElement(By.cssSelector("#id_create-1-name"));
        field_add_alternative_name.isDisplayed();
        field_add_alternative_name.sendKeys(Alternative_name);
        wait_sec();


        // year1
        WebElement field_year1 = driver.findElement(By.cssSelector("#id_create-default_year_covered_from"));
        field_year1.sendKeys(Year1);
        wait_sec();

        // year button
        WebElement year_button = driver.findElement(By.cssSelector(".btn.year-ce.btn-primary"));
        year_button.click();
        wait_sec();

        // year2
        WebElement field_year2 = driver.findElement(By.cssSelector("#id_create-default_year_covered_to"));
        field_year2.sendKeys(Year2);
        wait_sec();


        // save2 button
        WebElement save1_button = driver.findElement(By.cssSelector("#step2-continue"));
        save1_button.click();
        wait_sec();
    }

    public void Create_new_Region(String Name_region, String Deskription, String new_Name)throws InterruptedException
    {
        driver.manage().window().maximize();

        //field "entry name"
        WebElement field_name = driver.findElement(By.cssSelector(".form-control.ui-autocomplete-input"));
        field_name.sendKeys(new_Name);
        wait_sec();

        WebElement button_select = driver.findElement(By.cssSelector("#step1-continue"));
        button_select.click();
        wait_sec();

        WebElement button_continue_completing_the_poll = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/button"));
        button_continue_completing_the_poll.isDisplayed();
        button_continue_completing_the_poll.click();
        wait_sec();

        //step 3
        WebElement step3_button = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[3]/div/div[1]/a/h3"));
        step3_button.click();
        wait_sec();

        // create_region button
        WebElement create_region_button = driver.findElement(By.cssSelector("#createRegionLink"));
        create_region_button.isDisplayed();
        create_region_button.click();
        wait_sec();

        //name is displayed
        WebElement field_name_displ= driver.findElement(By.xpath("html/body/div[1]/section/div[5]/div/div[2]/div/div/form/div[1]/label"));
        field_name_displ.isDisplayed();
        wait_sec();

        // field name_region
        WebElement field_name_region = driver.findElement(By.cssSelector("#id_draw-name"));
        field_name_region.sendKeys(Name_region);
        wait_sec();

        // related_tags1
        WebElement related_tags1 = driver.findElement(By.xpath("html/body/div[1]/section/div[5]/div/div[2]/div/div/form/div[3]/div/ul/li[2]/a"));
        related_tags1.click();
        wait_sec();

        //related tags2
        WebElement related_tags2 = driver.findElement(By.xpath("html/body/div[1]/section/div[5]/div/div[2]/div/div/form/div[3]/div/ul/li[3]/a"));
        related_tags2.click();
        wait_sec();

        WebElement related_tags_displayed1 = driver.findElement(By.xpath("html/body/div[1]/section/div[5]/div/div[2]/div/div/form/div[2]/div[1]"));
        related_tags_displayed1.isDisplayed();
        wait_sec();

        WebElement related_tags_displayed2 = driver.findElement(By.xpath("html/body/div[1]/section/div[5]/div/div[2]/div/div/form/div[2]/div[2]"));
        related_tags_displayed2.isDisplayed();
        wait_sec();

        //field description
        WebElement field_description = driver.findElement(By.cssSelector("#id_draw-description"));
        field_description.sendKeys(Deskription);
        wait_sec();

        //map is displayed
        WebElement map_displayed = driver.findElement(By.cssSelector(".gm-style>div>div"));
        map_displayed.isDisplayed();
        wait_sec();

        WebElement draw_button = driver.findElement(By.xpath("html/body/div[1]/section/div[5]/div/div[2]/div/div/div[4]/div/div[8]/div[2]/div/span/div/img"));
        //draw_button.isDisplayed();
        draw_button.click();
        wait_sec();


        //coordinates
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(driver.findElement(By.xpath("//div[@id='drawmap']/div/div/div[3]/div[3]/div")), 100, 125).click().build().perform();

        Actions builder2 = new Actions(driver);
        builder2.moveToElement(driver.findElement(By.xpath("//div[@id='drawmap']/div/div/div[3]/div[3]/div")), 500, 275).click().build().perform();

        Actions builder3 = new Actions(driver);
        builder3.moveToElement(driver.findElement(By.xpath("//div[@id='drawmap']/div/div/div[3]/div[3]/div")), 320, 375).click().build().perform();

        Actions builder4 = new Actions(driver);
        builder4.moveToElement(driver.findElement(By.xpath("//div[@id='drawmap']/div/div/div[3]/div[3]/div")), 100, 125).click().build().perform();

        //button save
        WebElement save_button = driver.findElement(By.cssSelector("#submitdrawn_gis"));
        save_button.click();
        Thread.sleep(3000);

        //pagination field
        WebElement pagination_field = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[3]/div/div[2]/div[3]/div[2]/div[2]/ul"));
        pagination_field.isDisplayed();
        wait_sec();
       // Thread.sleep(3000);

    }

    public void Create_new_Entity_without_step2(String new_Name, String Alternative_name, String Year1, String Year2, String Search) throws InterruptedException
    {
        driver.manage().window().maximize();

        //field "entry name"
        WebElement field_name = driver.findElement(By.cssSelector(".form-control.ui-autocomplete-input"));
        field_name.sendKeys(new_Name);
        Thread.sleep(1000);

        WebElement button_select = driver.findElement(By.cssSelector("#step1-continue"));
        button_select.click();
        Thread.sleep(1000);
//----------------------------------------------------Step 1----------------------------------------------
        WebElement button_continue_completing_the_poll = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/button"));
        button_continue_completing_the_poll.isDisplayed();
        button_continue_completing_the_poll.click();
        Thread.sleep(1000);

        // button "add alternative name"
        WebElement add_alternative_name = driver.findElement(By.cssSelector("#add-create-name-form"));
        add_alternative_name.isDisplayed();
        add_alternative_name.click();
        Thread.sleep(1000);

        // field "add......name"
        WebElement field_add_alternative_name = driver.findElement(By.cssSelector("#id_create-1-name"));
        field_add_alternative_name.isDisplayed();
        field_add_alternative_name.sendKeys(Alternative_name);
        Thread.sleep(1000);


        // year1
        WebElement field_year1 = driver.findElement(By.cssSelector("#id_create-default_year_covered_from"));
        field_year1.sendKeys(Year1);
        Thread.sleep(1000);

        // year button
        WebElement year_button = driver.findElement(By.cssSelector(".btn.year-ce.btn-primary"));
        year_button.click();
        Thread.sleep(1000);

        // year2
        WebElement field_year2 = driver.findElement(By.cssSelector("#id_create-default_year_covered_to"));
        field_year2.sendKeys(Year2);
        Thread.sleep(1000);

        // religion radiobutton
        WebElement religion_radiobutton = driver.findElement(By.cssSelector(".radio.normal-text>input"));
        religion_radiobutton.click();
        Thread.sleep(1000);

        // save2 button
        WebElement save1_button = driver.findElement(By.cssSelector("#step2-continue"));
        save1_button.click();
        Thread.sleep(1000);

//----------------------------------------------------Step 2(only save button)----------------------------------------------
        //added tags field is displayed
        WebElement field_added_tags = driver.findElement(By.cssSelector(".no-margin-bottom"));
        field_added_tags.isDisplayed();
        wait_sec();

        // save2 button
        WebElement save2_button = driver.findElement(By.cssSelector("#step3-continue"));
        save2_button.click();
        wait_sec();
//
////----------------------------------------------------Step 3----------------------------------------------
//
//        // left field is displayed
//        WebElement left_field_displ = driver.findElement(By.cssSelector(".pull-left"));
//        left_field_displ.isDisplayed();
//        Thread.sleep(1000);
//
//        //search field
//        WebElement search_field = driver.findElement(By.cssSelector(".form-control.js-search-regions"));
//        search_field.sendKeys(Search);
//        wait_sec();
//        wait_sec();
//
//        try {
//            //choose region with search
//            WebElement choose_region = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[3]/div/div[2]/div[3]/div[2]/div[1]/div[4]/div/div/div[1]/div[2]"));
//            choose_region.click();
//            Thread.sleep(1000);
//
//            // save3 button
//            WebElement save3_button = driver.findElement(By.cssSelector("#step4-continue"));
//            save3_button.click();
//            Thread.sleep(2000);
//
////---------------------------------------------------------Entity is created-------------------------------------------------------
//
//            //down nab_bar is displayed
//            WebElement down_navbar = driver.findElement(By.cssSelector(".submit-footer.navbar-fixed-bottom"));
//            down_navbar.isDisplayed();
//            Thread.sleep(500);
//
//        }
//        catch(Exception error)
//        {
//            WebElement save3_button = driver.findElement(By.cssSelector("#step4-continue"));
//            save3_button.click();
//
//            //error
//            WebElement error_label= driver.findElement(By.cssSelector("#myModalLabel"));
//            error_label.isDisplayed();
//            System.out.println(error);
//        }
//
    }

    public void Check_Result(String new_Name) throws InterruptedException {

        driver.manage().window().maximize();

        Assert.assertTrue(driver.getPageSource().contains(new_Name));
    }



}