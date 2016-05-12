package MACU.com;


import org.openqa.selenium.WebDriver;

public class PageManager extends AbstractPage{
    public PageManager (WebDriver driver){
        this.driver = driver;
    }
    public SignInPage getSignInPage() {return SignInPage.get(driver);}
    public AccountPage getAccountPage() {return AccountPage.get(driver);}
}
