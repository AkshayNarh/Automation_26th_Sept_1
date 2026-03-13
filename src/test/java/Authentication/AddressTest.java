package Authentication;

import org.example.BaseClass.BaseClass;
import org.example.PomClasses.HomePage;
import org.example.PomClasses.LoginPage;
import org.example.PomClasses.ProfilePage;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AddressTest extends BaseClass{

    LoginPage lp;
    HomePage hp;
    ProfilePage pp;

    WebDriver driver;


    @BeforeClass
    public void beforeClass(){
//        BaseClass baseClass = new BaseClass();
//        driver = baseClass.launchBrowser();
    }

    @BeforeMethod
    public void beforeMethod(){
        lp = new LoginPage(driver);
        hp = new HomePage(driver);
    }

    @Test(priority = 4)
    public void VerifyUserCanAddNewAddress(){
//        lp = hp.clickOnLoginButton();
//        lp.enterMobileNumber();
//        lp.clickOnRequestOTPButton();
//        hp.verifyHomePageLoaded();
//        hp.hoverOnProfileName();
//        pp =  hp.clickObMyProfileButton();
//        pp.clickOnManageAddress();
//        pp.clickOnAddNewAddress();
//        pp.addAddressInfo();
//        pp.selectState();
//        pp.selectRequiredRadioButton("HOME");
//        pp.clickOnSaveButton();
//        Assert.assertTrue(pp.checkAddressAdded(), "Address not added in list");
    }


    @AfterMethod
    public void afterMethod(){

    }

    @AfterClass
    public void afterClass(){

    }

}
