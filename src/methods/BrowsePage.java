package methods;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowsePage extends  BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public BrowsePage()
    {

        super();

    }


    public void search_entity(String search_name) throws InterruptedException {

        //search field
        WebElement search_field = driver.findElement(By.xpath("html/body/div[1]/section/div/div[1]/div[2]/form/div/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", search_field);
        search_field.isDisplayed();
        search_field.sendKeys(search_name);
        wait_sec();


        WebElement search_button = driver.findElement(By.xpath("html/body/div[1]/section/div/div[1]/div[2]/form/button"));
        search_button.click();
        wait_sec();
        wait_sec();


        //Assert.assertTrue(driver.getPageSource().contains(search_name));
        Assert.assertTrue(driver.findElement(By.cssSelector(".row-fluid")).getText().contains(search_name));
        wait_sec();

    }

    public void search_entity_LessThen3(String search_name) throws InterruptedException {

        //search field
        WebElement search_field = driver.findElement(By.xpath("html/body/div[1]/section/div/div[1]/div[2]/form/div/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", search_field);
        search_field.isDisplayed();
        search_field.sendKeys(search_name);
        wait_sec();


        WebElement search_button = driver.findElement(By.xpath("html/body/div[1]/section/div/div[1]/div[2]/form/button"));
        search_button.click();
        wait_sec();
        wait_sec();


        try
        {
            WebElement new_field_is_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[3]"));
            new_field_is_displayed.isDisplayed();
            wait_sec();


        }
        catch (Exception e)
        {

            WebElement field_is_not_displayed = driver.findElement(By.xpath("html/body/div[1]/section/div"));
            field_is_not_displayed.isDisplayed();
            wait_sec();
        }


    }


    public void search_entity_noResult(String search_name) throws InterruptedException {

        //search field
        WebElement search_field = driver.findElement(By.xpath("html/body/div[1]/section/div/div[1]/div[2]/form/div/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", search_field);
        search_field.isDisplayed();
        search_field.sendKeys(search_name);
        wait_sec();

        WebElement search_button = driver.findElement(By.xpath("html/body/div[1]/section/div/div[1]/div[2]/form/button"));
        search_button.click();
        wait_sec();

        //Assert.assertTrue(driver.getPageSource().contains(search_name));
        Assert.assertTrue(driver.findElement(By.cssSelector(".row-fluid")).getText().contains("No results found"));
        wait_sec();


    }


    public void Choose_entity_browse() throws InterruptedException {

        // choose entity
        WebElement choose_entity = driver.findElement(By.cssSelector(".entity-info>h4>a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", choose_entity);
        choose_entity.isDisplayed();
        choose_entity.click();
        wait_sec();

        WebElement entity_is_displayed = driver.findElement(By.cssSelector(".poll-splash.poll-browse.bluegradient"));
        entity_is_displayed.isDisplayed();
        wait_sec();

    }

    public void status_browse() throws InterruptedException {

        // non-elite checkbox
        WebElement non_elite_checkbox = driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div[1]/a[1]/i"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", non_elite_checkbox);
        non_elite_checkbox.isDisplayed();
        non_elite_checkbox.click();
        wait_sec();

        WebElement elite_checkbox = driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div[1]/a[2]/i"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elite_checkbox);
        elite_checkbox.isDisplayed();
        elite_checkbox.click();
        wait_sec();

        WebElement religious_checkbox = driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div[1]/a[3]/i"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", religious_checkbox);
        religious_checkbox.isDisplayed();
        religious_checkbox.click();
        wait_sec();

        try {

            WebElement question_displayed = driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[3]/section[1]/table[1]/tbody/tr[1]/td[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question_displayed);
            question_displayed.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[3]/section[1]/table[1]/tbody/tr[1]/td[1]/div"));
           // question_displayed.getText().contains("Are other religious groups in cultural contact with target religion:");

             System.out.println("Test is failed");
            driver.quit();

        }
        catch (Exception ok){

            System.out.println("Test is ok");
            wait_sec();

        }



    }
}
