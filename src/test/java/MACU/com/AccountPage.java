package MACU.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends AbstractPage{
    @FindBy(xpath="path to currentID")
    WebElement currentId;

    public AccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public static AccountPage get(WebDriver driver) {
        AccountPage accountPage = new AccountPage(driver);
        return accountPage;
    }

    public String currentId (){
        return currentId.getText();
    }
}
