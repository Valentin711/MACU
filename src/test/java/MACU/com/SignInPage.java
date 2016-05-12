package MACU.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends AbstractPage{
    @FindBy(xpath="path to ID/email page")
    WebElement idField;
    @FindBy(xpath="path to password field")
    WebElement passField;
    @FindBy(xpath="path to SignIN button")
    WebElement signInButton;
    @FindBy(xpath="path to title of page")
    WebElement title;

    public SignInPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }
    public static SignInPage get(WebDriver driver) {
        SignInPage signInPage = new SignInPage(driver);
        return signInPage;
    }

    public String titleOfSignInPage (){
        return title.getText();
    }

    private void inputId(String id){
        idField.click();
        idField.sendKeys(id);
    }

    private void inputPassword(String password){
        passField.click();
        passField.sendKeys(password);
    }

    public void inputIdAndPassword(String id,String password){
        inputId(id);
        inputPassword(password);
    }

    public boolean isSignInButtonVisible(){
        return signInButton.isDisplayed();
    }

    public void doSignIn(){
        signInButton.click();
    }
}
