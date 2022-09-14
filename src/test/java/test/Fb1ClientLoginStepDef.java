package test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Fb1ClientLoginStepDef {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginPage_tbx_username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPage_tbx_password;

    @Given("^Goto FB1 Login Page$")
    public void gotoFB1LoginPage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://trading.t1.formbay.com.au/auth/login?r=20");

    }
    @When("^user enters username$")
    public void userEntersUsername(){
        driver.findElement((By) loginPage_tbx_username).sendKeys("client_trade");
    }
    @And("^user enters password$")
    public void userEntersPassword(){
        driver.findElement((By) loginPage_tbx_password).sendKeys("testserverisworking");
    }
    @Then("^user checks username is present$")
    public void userChecksUsernameIsPresent(){
        String userNameActual = driver.findElement((By) loginPage_tbx_password).getAttribute("value");
        Assert.assertEquals("client_trade",userNameActual);

    }
    @And("^user checks password is present$")
    public void userChecksPasswordIsPresent(){
        Boolean passwordNotEmpty = driver.findElement((By) loginPage_tbx_password).getAttribute("value").isEmpty();
        Assert.assertFalse(passwordNotEmpty);

    }

}
