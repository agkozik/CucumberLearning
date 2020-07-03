package steps;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
//    WebDriver driver;
//
//    @Before()
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
//        this.driver = new ChromeDriver();
//        this.driver.manage().window().maximize();
////        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//    }
//
//    @Given("^User navigates to stackoverflow website$")
//    public void user_navigates_to_stackoverflow_website() throws Throwable {
//        driver.get("https://ru.stackoverflow.com/");
//    }
//
//    @Given("^User clicks on the login button on homepage$")
//    public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
//        driver.findElement(By.xpath("//a[@data-gps-track='login.click']")).click();
//    }
//
//    @Given("^User enters a valid username$")
//    public void user_enters_a_valid_username() throws Throwable {
//        new WebDriverWait(driver, 1).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='formContainer']")));
//        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("uitestUser");
//    }
//
//    @Given("^User enters a valid password$")
//    public void user_enters_a_valid_password() throws Throwable {
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("uiTestPassword");
//    }
//
//    @When("^User clicks on the login button$")
//    public void user_clicks_on_the_login_button() throws Throwable {
//        System.out.println("user_clicks_on_the_login_button");
//        driver.findElement(By.xpath("//*[@id='submit-button']")).click();
//    }
//
//    @Then("^User should be taken to the successful login page$")
//    public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
//
//        WebElement errorMessage = driver.findElement(By.xpath(("//div[@id='formContainer']")));
//        Assert.assertEquals(true, errorMessage.isEnabled());
//    }
}
