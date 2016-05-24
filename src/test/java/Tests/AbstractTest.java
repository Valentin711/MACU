package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public abstract class AbstractTest {
    WebDriver driver;
    String URL;
    String URL2="http://softek.com/signIn";
    @BeforeClass(alwaysRun = true)
    public void initVariables(){
        if (driver==null){driver=new FirefoxDriver();}
        if (URL==null){driver.get(URL2);}
    }
    @AfterTest (alwaysRun = true)
    public void tearDown(){driver.close();}
}
