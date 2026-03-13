package Authentication;

import org.example.BaseClass.BaseClass;
import org.example.PomClasses.HomePage;
import org.example.PomClasses.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginTest {

    WebDriver driver;
    LoginPage lp;
    HomePage hp;


    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser) throws IOException {
        BaseClass bc = new BaseClass();
        driver = bc.launchBrowser(browser);
    }

    @BeforeMethod
    public void beforeMethod(){

        //hp = new HomePage(driver);
    }


    @Test(priority = 1)
    public void VerifyUserCanLoginToApplication() throws IOException, InterruptedException {
        lp = hp.clickOnLoginButton();
        lp.enterMobileNumber();
        lp.clickOnRequestOTPButton();
        Assert.assertTrue(hp.verifyHomePageLoaded(), "Home page not loaded");
    }


    @AfterMethod
    public void afterMethod(){


    }

    @AfterClass
    public void afterClass(){

    }






}
