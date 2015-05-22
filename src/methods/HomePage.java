package methods;


import org.junit.Assert;
import org.openqa.selenium.*;

public class HomePage extends BasePage {


    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public HomePage() {
        super();

    }


    public ProfilePage MyProfile() throws InterruptedException {

        // window maximize
        driver.manage().window().maximize();

        // Username_dropdown button
        WebElement username_button = driver.findElement(By.cssSelector(".username.dropdown-toggle"));
        username_button.click();
        Thread.sleep(500);

        // Username_dropdown button
        WebElement dropdown_list = driver.findElement(By.cssSelector(".dropdown-menu"));
        dropdown_list.isDisplayed();
        Thread.sleep(500);

        // myprofile button
        WebElement myprofile_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[4]/ul/li[1]/a"));
        myprofile_button.isDisplayed();
        myprofile_button.click();
        Thread.sleep(500);

        // panel title
        WebElement panel_title = driver.findElement(By.cssSelector(".panel-title"));
        panel_title.isDisplayed();
        wait_sec();


        return new ProfilePage();

    }


    public ContributePage CreatePage() throws InterruptedException {

        driver.manage().window().maximize();

        // "Contribute" button
        WebElement contribute_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[1]/li[5]/a"));
        contribute_button.click();
        Thread.sleep(1000);

        // panel is displayed
        WebElement panel_field = driver.findElement(By.cssSelector(".panel-title"));
        panel_field.isDisplayed();
        Thread.sleep(500);

        return new ContributePage();
    }

    public MyDashboardPage MyDashboardPage() throws InterruptedException {

        driver.manage().window().maximize();

        // "View Dashboard" button
        WebElement dashboard_button = driver.findElement(By.cssSelector(".flat.add-arrow"));
        dashboard_button.click();
        Thread.sleep(1000);

        // panel is displayed
        WebElement panel_field = driver.findElement(By.cssSelector(".dashboard-poll-title"));
        panel_field.isDisplayed();
        Thread.sleep(500);

        return new MyDashboardPage();
    }

    public MyDashboardPage Check_Entity_in_HomePage() throws InterruptedException {

        driver.manage().window().maximize();

        //continue button
        WebElement completing_the_poll_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[3]/button"));
        completing_the_poll_button.click();
        Thread.sleep(1000);

        // home button
        WebElement home_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[1]/li[1]/a"));
        home_button.isDisplayed();
        home_button.click();
        wait_sec();

        //Recently Edited field
        WebElement recently_edited_field = driver.findElement(By.cssSelector("#recently-edited-items"));
        recently_edited_field.isDisplayed();
        wait_sec();


        return new MyDashboardPage();
    }

    public EntityPage ChooseEntityPage() throws InterruptedException {

        driver.manage().window().maximize();

        //entity button
        WebElement entity_button = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[2]/div/a[1]"));
        entity_button.click();
        wait_sec();
        wait_sec();wait_sec();wait_sec();wait_sec();

        //entity is displayed
        WebElement field_is_displayed = driver.findElement(By.xpath("html/body/div[1]/div[4]"));
        field_is_displayed.isDisplayed();
        wait_sec();
        wait_sec();
        wait_sec();

        return new EntityPage();
    }

    public EntityPage ChooseEntityPage_for_Browse(String new_Name) throws InterruptedException {

        driver.manage().window().maximize();

        //continue button
        WebElement completing_the_poll_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[3]/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", completing_the_poll_button);
        completing_the_poll_button.click();
        wait_sec();

        WebElement home_button = driver.findElement(By.xpath(" html/body/div[1]/div[1]/div/div/ul[1]/li[1]/a"));
        home_button.click();
        wait_sec();

        //entity button
        WebElement entity_button = driver.findElement(By.linkText(new_Name));
        entity_button.click();
        wait_sec();

        //entity is displayed
        WebElement field_is_displayed = driver.findElement(By.xpath("html/body/div[1]/div[4]"));
        field_is_displayed.isDisplayed();
        wait_sec();
        wait_sec();

        return new EntityPage();
    }


    public BrowsePage BrowsePage() throws InterruptedException {

        driver.manage().window().maximize();

        try{
            //browse button
            WebElement browse_button = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[1]/ul/li[3]/div[2]/div/div[2]/a"));
            browse_button.click();
            wait_sec();

            //entity is displayed
            WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div[1]/div[1]"));
            title_is_displayed.isDisplayed();
            wait_sec();
        }
        catch (Exception ok){

//            //continue button
//            WebElement completing_the_poll_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[3]/button"));
//            completing_the_poll_button.click();
//            Thread.sleep(1000);

            WebElement home_button = driver.findElement(By.xpath(" html/body/div[1]/div[1]/div/div/ul[1]/li[1]/a"));
            home_button.click();
            wait_sec();

            //browse button
            WebElement browse_button = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[1]/ul/li[3]/div[2]/div/div[2]/a"));
            browse_button.click();
            wait_sec();

            //entity is displayed
            WebElement title_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div[1]/div[1]"));
            title_is_displayed.isDisplayed();
            wait_sec();

        }


        return new BrowsePage();
    }



    public VisualizePage VisualizePage() throws InterruptedException {

        driver.manage().window().maximize();

        //visualize button
        WebElement visualize_button = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[1]/ul/li[4]/div[2]/div/div[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", visualize_button);
        visualize_button.click();
        wait_sec();

        //entity is displayed
        WebElement field_is_displayed = driver.findElement(By.cssSelector("#view_user_r>h3"));
        field_is_displayed.isDisplayed();
        wait_sec();

        return new VisualizePage();
    }


    public DocumentationPage DocumentationPage() throws InterruptedException {

        driver.manage().window().maximize();

        //learn_more button
        WebElement learn_more_button = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[1]/ul/li[6]/div[2]/div/div[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", learn_more_button);
        learn_more_button.click();
        wait_sec();

        //entity is displayed
        WebElement field_is_displayed = driver.findElement(By.cssSelector(".container>h2"));
        field_is_displayed.isDisplayed();
        wait_sec();

        return new DocumentationPage();
    }

    public ContactPage ContactPage() throws InterruptedException {

        driver.manage().window().maximize();

        //help button
        WebElement help_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",help_button);
        help_button.click();
        wait_sec();

        // ContactPage button
        WebElement Contact_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/ul/li[4]/a"));
        Contact_button.isDisplayed();
        Contact_button.click();

//        String originalHandle = driver.getWindowHandle();
//        for (String handle : driver.getWindowHandles()) {
//            if (!handle.equals(originalHandle)) {
//                driver.switchTo().window(handle);
//                wait_sec();
//                WebElement title_is_displayed = driver.findElement(By.cssSelector("#resizeScroll"));
//                title_is_displayed.isDisplayed();
//                wait_sec();
//               driver.close();
//            }
//        }
//       driver.switchTo().window(originalHandle);


        return new ContactPage();
    }



    //------------------------------------Navigation Bar-----------------------------

    public void DRH_button () throws InterruptedException {

        driver.manage().window().maximize();

        //learn_more button
        WebElement DRH_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",DRH_button);
        DRH_button.click();
        wait_sec();

        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                wait_sec();
                //entity is displayed
                WebElement field_is_displayed = driver.findElement(By.cssSelector("#resizeScroll"));
                field_is_displayed.isDisplayed();
                wait_sec();
                driver.close();
            }
        }
        driver.switchTo().window(originalHandle);


    }

    public void Home_button () throws InterruptedException {

        driver.manage().window().maximize();

        //homebutton
        WebElement Home_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[1]/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Home_button);
        Home_button.click();
        wait_sec();

        //title is displayed
        WebElement title_is_displayed = driver.findElement(By.cssSelector(".homepage-splash"));
        title_is_displayed.isDisplayed();
        wait_sec();

    }

    public void Browse_button () throws InterruptedException {

        driver.manage().window().maximize();

        //browse button
        WebElement Browse_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[1]/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Browse_button);
        Browse_button.click();
        wait_sec();

        //title is displayed
        WebElement title_is_displayed = driver.findElement(By.cssSelector(".header-splash.bluegradient"));
        title_is_displayed.isDisplayed();
        wait_sec();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
    }

    public void Visualize_button () throws InterruptedException {

        driver.manage().window().maximize();

        //Visualize button
        WebElement Visualize_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[1]/li[3]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Visualize_button);
        Visualize_button.click();
        wait_sec();

        //title is displayed
        WebElement title_is_displayed = driver.findElement(By.cssSelector("#view_user_r>h3"));
        title_is_displayed.isDisplayed();
        wait_sec();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
    }


    public void Analyze_button () throws InterruptedException {

        driver.manage().window().maximize();

        //Analyze button
        WebElement Analyze_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[1]/li[4]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Analyze_button);
        Analyze_button.click();
        wait_sec();

        //title is displayed
        WebElement title_is_displayed = driver.findElement(By.cssSelector(".underconstruction-box"));
        title_is_displayed.isDisplayed();
        wait_sec();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
    }

    public void Contribute_button () throws InterruptedException {

        driver.manage().window().maximize();

        //Contribute button
        WebElement Contribute_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[1]/li[5]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Contribute_button);
        Contribute_button.click();
        wait_sec();

        //title is displayed
        WebElement title_is_displayed = driver.findElement(By.cssSelector(".header-splash.bluegradient"));
        title_is_displayed.isDisplayed();
        wait_sec();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
    }

    public void Advanced_search_button () throws InterruptedException {

        driver.manage().window().maximize();

        //Analyze button
        WebElement search_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",search_button);
        search_button.click();
        wait_sec();

        //title is displayed
        WebElement title_is_displayed = driver.findElement(By.cssSelector(".underconstruction-box"));
        title_is_displayed.isDisplayed();
        wait_sec();
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
        wait_sec();
    }


    public void Help_button () throws InterruptedException {

        driver.manage().window().maximize();

        //help button
        WebElement help_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",help_button);
        help_button.click();
        wait_sec();

        //Creating_an_entity button
        WebElement Creating_an_entity_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/ul/li[1]/a"));
        Creating_an_entity_button.isDisplayed();
        Creating_an_entity_button.click();
        wait_sec();

        //Creating_an_entity - continue button
        WebElement Creating_an_entity_Continue_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/button"));
        Creating_an_entity_Continue_button.isDisplayed();
        Creating_an_entity_Continue_button.click();
        wait_sec();
        //--------------------------------------
        help_button.click();

        //Completing_the_poll button
        WebElement Completing_the_poll_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/ul/li[2]/a"));
        Completing_the_poll_button.isDisplayed();
        Completing_the_poll_button.click();
        wait_sec();

        //Completing_the_poll - continue button
        WebElement Completing_the_poll_Continue_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[3]/button"));
        Completing_the_poll_Continue_button.isDisplayed();
        Completing_the_poll_Continue_button.click();
        wait_sec();
        //-------------------------------
        help_button.click();

        //Visualization button
        WebElement Visualization_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/ul/li[3]/a"));
        Visualization_button.isDisplayed();
        Visualization_button.click();
        wait_sec();

        //Completing_the_poll - continue button
        WebElement Visualization_Continue_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[3]/div/div[3]/button"));
        Visualization_Continue_button.isDisplayed();
        Visualization_Continue_button.click();
        wait_sec();

    }


    public void Help_Documentation_button () throws InterruptedException {

        //help button
        WebElement help_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",help_button);
        help_button.click();
        wait_sec();

        // Documentation button
        WebElement Documentation_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/ul/li[5]/a"));
        Documentation_button.isDisplayed();
        Documentation_button.click();


        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = driver.findElement(By.cssSelector(".about-splash.bluegradient"));
                title_is_displayed.isDisplayed();
                wait_sec();
                driver.close();
            }
        }
        driver.switchTo().window(originalHandle);


    }

    public void Help_Contact_button () throws InterruptedException {

        //help button
        WebElement help_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",help_button);
        help_button.click();
        wait_sec();

        // ContactPage button
        WebElement Contact_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[1]/ul/li[4]/a"));
        Contact_button.isDisplayed();
        Contact_button.click();


        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                wait_sec();
                WebElement title_is_displayed = driver.findElement(By.cssSelector("#resizeScroll"));
                title_is_displayed.isDisplayed();
                wait_sec();
                driver.close();
            }
        }
        driver.switchTo().window(originalHandle);
        //driver.close();


        wait_sec();



    }

    public void Help_UserName_button () throws InterruptedException {

        //Username button
        WebElement Username_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[4]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Username_button);
        Username_button.click();
        wait_sec();

        WebElement dropdown_list = driver.findElement(By.cssSelector(".dropdown-menu"));
        dropdown_list.isDisplayed();
        wait_sec();
    }
    public void Help_UserName_MyProfile_button () throws InterruptedException {

        // MyProfile button
        WebElement MyProfile_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[4]/ul/li[1]/a"));
        MyProfile_button.isDisplayed();
        MyProfile_button.click();
        wait_sec();

        WebElement MyProfile_title_is_displayed = driver.findElement(By.cssSelector(".settings-splash.bluegradient"));
        MyProfile_title_is_displayed.isDisplayed();
        MyProfile_title_is_displayed.click();
        wait_sec();

    }

    public void Help_UserName_Search_button () throws InterruptedException {

        // Search button
        WebElement Search_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[4]/ul/li[3]/a"));
        Search_button.isDisplayed();
        Search_button.click();
        wait_sec();

        WebElement Search_title_is_displayed = driver.findElement(By.cssSelector(".page-header>h1"));
        Search_title_is_displayed.isDisplayed();
        Search_title_is_displayed.click();
        wait_sec();
    }

    public void Help_UserName_Visualize_button () throws InterruptedException {

        // Visualize button
        WebElement Visualize_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[4]/ul/li[4]/a"));
        Visualize_button.isDisplayed();
        Visualize_button.click();
        wait_sec();

        WebElement Visualize_title_is_displayed = driver.findElement(By.cssSelector("#view_user_r>h3"));
        Visualize_title_is_displayed.isDisplayed();
        Visualize_title_is_displayed.click();
        wait_sec();


    }

    public void Help_UserName_LogOut_button () throws InterruptedException {

        // Visualize button
        WebElement Visualize_button = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/ul[2]/li[4]/ul/li[10]/a"));
        Visualize_button.isDisplayed();
        Visualize_button.click();
        wait_sec();
        wait_sec();

        WebElement Visualize_title_is_displayed = driver.findElement(By.cssSelector(".container"));
        Visualize_title_is_displayed.isDisplayed();
        Visualize_title_is_displayed.click();
        wait_sec();


    }

    public void NavBar_search_field(String Search_field) throws InterruptedException {

        // search field
        WebElement search_field = driver.findElement(By.cssSelector("#nav-search-input"));
        search_field.isDisplayed();
        search_field.sendKeys(Search_field);
        wait_sec();
        search_field.sendKeys(Keys.ENTER);
        wait_sec();

        Assert.assertTrue(driver.findElement(By.cssSelector(".row-fluid")).getText().contains(Search_field));
        wait_sec();

    }


    public void NavBar_choose_entity_inDropdownlist(String Search_field) throws InterruptedException {

        // search field
        WebElement search_field = driver.findElement(By.cssSelector("#nav-search-input"));
        search_field.isDisplayed();
        search_field.sendKeys(Search_field);
        wait_sec();
        wait_sec();

        WebElement dropdownlist_field = driver.findElement(By.cssSelector("#ui-id-1"));
        dropdownlist_field.isDisplayed();
        wait_sec();

        WebElement choose_entity_indropdownlist = driver.findElement(By.xpath("html/body/ul[1]/li[1]/a"));
        choose_entity_indropdownlist.click();
        wait_sec();
        wait_sec();

        Assert.assertTrue(driver.findElement(By.cssSelector(".browse-splash-info")).getText().contains(Search_field));
        wait_sec();



    }


    }
