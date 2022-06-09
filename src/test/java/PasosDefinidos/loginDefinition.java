package PasosDefinidos;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginDefinition {

    WebDriver driver;

    @Given("That the DEMOQALOGIN website is available")
    public void that_the_demoqalogin_website_is_available() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("I complete the fields")
    public void i_complete_the_fields() {
        driver.findElement(By.id("userName")).sendKeys("josem9507");
        driver.findElement(By.id("password")).sendKeys("Hello123*");

    }

    @And("I click on login")
    public void i_click_on_login() {

        //JavascriptExecutor executor=(JavascriptExecutor) driver;
        //executor.executeScript("arguments[0].click();", driver.findElement(By.id("login")));
        driver.findElement(By.id("login")).click();


    }

    @Then("my login is successful")
    public void my_login_is_successful() {
        driver.findElement(By.id("userName-label")).isDisplayed();

        driver.close();
        driver.quit();

    }

}
