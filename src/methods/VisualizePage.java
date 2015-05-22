package methods;


import org.openqa.selenium.*;

public class VisualizePage extends  BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public VisualizePage() {

        super();

    }

    public void search_questions(String question_Name) throws InterruptedException {

        //search field
        WebElement search_field = driver.findElement(By.cssSelector("#visualize_question_select"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", search_field);
        search_field.isDisplayed();
        search_field.clear();
        search_field.sendKeys(question_Name);
        wait_sec();
        search_field.sendKeys(Keys.ENTER);
        wait_sec();

//        //dropdown list is displayed
//        WebElement dropdown_list_displayed = driver.findElement(By.cssSelector(".typeahead.dropdown-menu"));
//        dropdown_list_displayed.isDisplayed();
//        wait_sec();
//
//        //click to question in dropdown list
//        WebElement choose_question = driver.findElement(By.cssSelector(".active>a"));
//        choose_question.sendKeys(Keys.ENTER);
//        wait_sec();
//        wait_sec();


        // question is displayed
        WebElement question_displayed = driver.findElement(By.cssSelector(".question"));
        question_displayed.isDisplayed();
        wait_sec();

        // "view visualization" button
        WebElement view_visualization_button = driver.findElement(By.cssSelector(".btn.btn-primary.view-visualization"));
        view_visualization_button.click();
        wait_sec();

        // map_bar is displayed
        WebElement map_bar = driver.findElement(By.cssSelector("#map_bar"));
        map_bar.isDisplayed();
        wait_sec();


    }

    public void change_color_of_question() throws InterruptedException {

        //color button
        WebElement color_button = driver.findElement(By.xpath("html/body/div[1]/div[6]/div[2]/div[2]/div/ul/li[1]/div/a/div"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", color_button);
        color_button.isDisplayed();
        color_button.click();
        wait_sec();

        //dropdown list is displayed
        WebElement dropdown_list_displayed = driver.findElement(By.cssSelector(".dropdown-menu"));
        dropdown_list_displayed.isDisplayed();
        wait_sec();

        //change color button
        WebElement change_color_button = driver.findElement(By.cssSelector(".change-color"));
        change_color_button.click();
        wait_sec();
        wait_sec();

        // question is displayed
        WebElement change_color_window_displayed = driver.findElement(By.cssSelector(".ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.ui-draggable"));
        change_color_window_displayed.isDisplayed();
        wait_sec();

        // choose color
        WebElement choose_color = driver.findElement(By.xpath("html/body/div[3]/div[2]/div[1]/div[6]/div[5]/div[2]"));
        choose_color.click();
        wait_sec();

        // ok button
        WebElement ok_button = driver.findElement(By.cssSelector(".submit"));
        ok_button.click();
        wait_sec();
        wait_sec();
    }

    public void hide_color_of_question() throws InterruptedException {

        //color button
        WebElement color_button = driver.findElement(By.xpath("html/body/div[1]/div[6]/div[2]/div[2]/div/ul/li[1]/div/a/div"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", color_button);
        color_button.isDisplayed();
        color_button.click();
        wait_sec();

        //dropdown list is displayed
        WebElement dropdown_list_displayed = driver.findElement(By.cssSelector(".dropdown-menu"));
        dropdown_list_displayed.isDisplayed();
        wait_sec();

        //hide color button
        WebElement hide_color_button = driver.findElement(By.cssSelector(".hide-variable"));
        hide_color_button.click();
        wait_sec();
        wait_sec();

    }

    public void map_play() throws InterruptedException {

        //play button
        WebElement play_button = driver.findElement(By.cssSelector("#map-play"));
        play_button.click();
        wait_sec();
        wait_sec();

        play_button.click();
        wait_sec();

    }

    public void change_map() throws InterruptedException {

        //map button
        WebElement map_button = driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[9]/div[1]/div[1]"));
        map_button.click();

        WebElement terrain_checkbox = driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[9]/div[1]/div[2]/div"));
        terrain_checkbox.isDisplayed();
        terrain_checkbox.click();
        wait_sec();

        //map is changing
        System.out.println("map change");
        //---------------------------------

        //satellite button
        WebElement satellite_button = driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[9]/div[2]/div[1]"));
        satellite_button.click();
        wait_sec();
        //map changed to satellite
        System.out.println("map changed to satellite");

    }

}
