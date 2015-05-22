package methods;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyDashboardPage extends BasePage {


    WebDriver driver = getDriver();

    @Override
    protected void Init()
    {

    }

    public MyDashboardPage()
    {
        super();

    }



    public void Change_data_profile(String Occupation, String Institution, String Location, String Research) throws InterruptedException {

        driver.manage().window().maximize();

        // "occupation_title" field
        WebElement occupation_title = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/form/div[1]/input[1]"));
        occupation_title.clear();
        occupation_title.sendKeys(Occupation);
        occupation_title.sendKeys(Keys.ENTER);
        wait_sec();

        // "institution" field
        WebElement institution_field = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/form/div[1]/input[2]"));
        institution_field.clear();
        institution_field.sendKeys(Institution);
        institution_field.sendKeys(Keys.ENTER);
        wait_sec();

        // "Location" field
        WebElement location_field = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/form/div[1]/input[3]"));
        location_field.clear();
        location_field.sendKeys(Location);
        location_field.sendKeys(Keys.ENTER);
        wait_sec();

        // "Research..." field
        WebElement research_field = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/form/div[2]/div[1]/input"));
        research_field.sendKeys(Research);
        wait_sec();

        // button "+"
        WebElement add_button = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/form/div[2]/div[1]/button"));
        add_button.click();
        wait_sec();

        // label_tag is displayed
        WebElement label_tag = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/form/div[2]/span[2]"));
        label_tag.isDisplayed();
        wait_sec();



    }


    public void Create_a_new_Entity_button() throws InterruptedException {

        driver.manage().window().maximize();

        //button "create a new entity"
        WebElement create_new_entity= driver.findElement(By.cssSelector(".dashboard-poll-button>a"));
        create_new_entity.click();
        wait_sec();

        WebElement panel_displayed= driver.findElement(By.cssSelector(".panel-title"));
        panel_displayed.isDisplayed();
        wait_sec();

    }


    public void Go_to_MyProfile() throws InterruptedException
    {
        driver.manage().window().maximize();

        //button "settings"
        WebElement create_new_entity= driver.findElement(By.cssSelector(".dashboard-settings.pull-right.dropdown-toggle"));
        create_new_entity.click();
        wait_sec();


        WebElement dropdown_displayed= driver.findElement(By.cssSelector(".dropdown-menu"));
        dropdown_displayed.isDisplayed();
        wait_sec();

        WebElement myprofile_button = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div[2]/ul/li[1]/a"));
        myprofile_button.click();
        wait_sec();

        WebElement panel_is_displayed= driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[1]/h3"));
        panel_is_displayed.isDisplayed();
        wait_sec();


    }

}
