package methods;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public ProfilePage() {
        super();

    }
    public void EditData(String firstName, String lastName,String Email, String occupationTitle, String Institution, String Location, String WebSite, String Biography, String ResearchInterest) throws InterruptedException{
        // window maximize
        driver.manage().window().maximize();

        // first name
        WebElement firstname = driver.findElement(By.cssSelector("#id_first_name"));
        firstname.clear();
        firstname.sendKeys(firstName);
        Thread.sleep(500);

        // last name
        WebElement lastname = driver.findElement(By.cssSelector("#id_last_name"));
        lastname.clear();
        lastname.sendKeys(lastName);
        Thread.sleep(500);

        // email
        WebElement email_field = driver.findElement(By.cssSelector("#id_email"));
        email_field.clear();
        email_field.sendKeys(Email);
        Thread.sleep(500);

        // occupation title
        WebElement occupation_title = driver.findElement(By.cssSelector("#id_occupation"));
        occupation_title.clear();
        occupation_title.sendKeys(occupationTitle);
        Thread.sleep(500);

        // institution
        WebElement institution = driver.findElement(By.cssSelector("#id_institution"));
        institution.clear();
        institution.sendKeys(Institution);
        Thread.sleep(500);

        // location
        WebElement location = driver.findElement(By.cssSelector("#id_location"));
        location.clear();
        location.sendKeys(Location);
        Thread.sleep(500);

        // website
        WebElement website = driver.findElement(By.cssSelector("#id_website"));
        website.clear();
        website.sendKeys(WebSite);
        Thread.sleep(500);

        // biography
        WebElement biography = driver.findElement(By.cssSelector("#id_biography"));
        biography.clear();
        biography.sendKeys(Biography);
        Thread.sleep(1000);

        try {
                WebElement label_tag_delete = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[2]/div/div[2]/form/div[12]/div/span/button"));
                label_tag_delete.click();
            }
        catch(Exception e)
        {
            WebElement label_tag_empty = driver.findElement(By.cssSelector(".label.label-tag.label-tag-empty"));
            label_tag_empty.isDisplayed();
            System.out.println(e);
        }
            // research interest
            WebElement research_interest = driver.findElement(By.cssSelector("#appendedInputButton"));
            research_interest.sendKeys(ResearchInterest);
            Thread.sleep(1000);

            // add_interest button
            WebElement add_interest_button = driver.findElement(By.cssSelector(".add-interest"));
            add_interest_button.click();
            Thread.sleep(1000);

        // "save changes" button
        WebElement save_changes_button  = driver.findElement(By.cssSelector("#save_profile"));
        save_changes_button.click();
        Thread.sleep(1000);

    }

    public void Upload_file(String Path) throws InterruptedException {

        WebElement upload_file = driver.findElement(By.cssSelector("#id_image"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", upload_file);
        upload_file.sendKeys(Path);
        wait_sec();

        // "save changes" button
        WebElement save_changes_button  = driver.findElement(By.cssSelector("#save_profile"));
        save_changes_button.click();
        wait_sec();
    }


    public void Change_Password(String pass_old, String pass_new, String pass_confirm) throws InterruptedException {

        // "password" button
        WebElement change_password_button = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/a[2]"));
        change_password_button.click();
        Thread.sleep(1000);

        // field "old password" is displayed
        WebElement field_old_pass  = driver.findElement(By.cssSelector(".control-label"));
        field_old_pass.isDisplayed();
        Thread.sleep(1000);

        WebElement old_pass  = driver.findElement(By.cssSelector("#oldPassword"));
        old_pass.sendKeys(pass_old);
        wait_sec();

        WebElement new_pass  = driver.findElement(By.cssSelector("#newPassword"));
        new_pass.sendKeys(pass_new);
        wait_sec();

        WebElement confirm_pass  = driver.findElement(By.cssSelector("#confirmPassword"));
        confirm_pass.sendKeys(pass_confirm);
        wait_sec();

        WebElement save_change  = driver.findElement(By.cssSelector("#save_password"));
        save_change.click();
        wait_sec();

    }




}
