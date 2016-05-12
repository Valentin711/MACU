package cucumber.cucumber.featurs;

import Tests.AbstractTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import MACU.com.PageManager;
import org.testng.Assert;
import org.testng.Reporter;
import sun.security.util.PendingException;

public class SignInTest extends AbstractTest{

    WebDriver driver = new FirefoxDriver();
    PageManager pageManager = new PageManager(driver);
    String id="5133711838";
    String password="Test";

    @Given("^SingIn page is opened$")
    public void singin_page_is_opened() throws Throwable {
        driver.get("http://macu.com/signIn");
        Assert.assertEquals(pageManager.getSignInPage().titleOfSignInPage(), "SignIn");
        Reporter.log("Page was opened");
        throw new PendingException();
    }

    @Given("^User ID and Password are set$")
    public void user_ID_and_Password_are_set() throws Throwable {
        pageManager.getSignInPage().inputIdAndPassword(id, password);
        Assert.assertTrue(pageManager.getSignInPage().isSignInButtonVisible());
        throw new PendingException();
    }

    @When("^Click on sign in button$")
    public void click_on_sign_in_button() throws Throwable {
        pageManager.getSignInPage().doSignIn();
        Reporter.log("SignIn is started");
        throw new PendingException();
    }

    @Then("^Account page for the user used should be displayed$")
    public void account_page_for_the_user_used_should_be_displayed() throws Throwable {
        Assert.assertNotNull(pageManager.getAccountPage().currentId());
        Reporter.log("SignIn is successful");
        Assert.assertEquals(id, pageManager.getAccountPage().currentId());
        Reporter.log("SignIn was done at right Id" + pageManager.getAccountPage().currentId());
        throw new PendingException();
    }
}
