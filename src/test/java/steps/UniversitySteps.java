package steps;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UniversitySteps {
    WebDriver driver;

    @Before()
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
//        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @After()
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

    @Given("^I access webdriveruniversity$")
    public void i_access_webdriveruniversity() throws Throwable {
        driver.get("http://webdriveruniversity.com/");
    }

    @When("^I click on the login portal button$")
    public void i_click_on_the_login_portal_button() throws Throwable {
        driver.findElement(By.id("login-portal")).click();
    }

    @When("^I enter a username$")
    public void i_enter_a_username() throws Throwable {
        //switch to new window in tab
        @SuppressWarnings("unused")
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.id("text")).sendKeys("Tom");
    }

    @When("^I enter a \"([^\"]*)\" password$")
    public void i_enter_a_password(String password) throws Throwable {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("^I should be presented with a succesfful validation alert$")
    public void i_should_be_presented_with_a_succesfful_validation_alert() throws Throwable {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Assert.assertEquals("validation failed", alert.getText());
    }

    @Then("^I should be presented with a unsuccesfful validation alert$")
    public void i_should_be_presented_with_a_unsuccesfful_validation_alert() throws Throwable {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Assert.assertEquals("validation failed", alert.getText());
    }

    @And("^I enter a username from data$")
    public void iEnterAUsernameFromData(DataTable arg1) {
        List<List<String>> data = arg1.raw();
        //switch to new window in tab
        @SuppressWarnings("unused")
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.id("text")).sendKeys(data.get(0).get(1));
        driver.findElement(By.id("text")).sendKeys(data.get(1).get(0));
    }

    @And("^I enter a password$")
    public void iEnterAPassword() {
        driver.findElement(By.id("password")).sendKeys("password");
    }

    @Given("^user navigates to \"([^\"]*)\"$")
    public void user_navigates_to(String url) throws Throwable {
        driver.get(url);
    }

    @When("^user clicks on the login portal button$")
    public void user_clicks_on_the_login_portal_button() throws Throwable {
        driver.findElement(By.id("login-portal")).click();
    }

    @When("^user enters the \"([^\"]*)\" username$")
    public void user_enters_the_username(String username) throws Throwable {

        //switch to new window in tab
        @SuppressWarnings("unused")
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.id("text")).sendKeys(username);
    }

    @When("^user enters the \"([^\"]*)\" password$")
    public void user_enters_the_password(String password) throws Throwable {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("^user clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("^the user should be presented with the following prompt alert \"([^\"]*)\"$")
    public void the_user_should_be_presented_with_the_following_prompt_alert(String message) throws Throwable {
        Alert alert = driver.switchTo().alert();
        System.out.println("Text: "+alert.getText());
        Assert.assertEquals(message.toLowerCase().replaceAll("\\s",""),
                alert.getText().toString().toLowerCase().replaceAll("\\s",""));
        Thread.sleep(2000);
        alert.accept();
    }
}
