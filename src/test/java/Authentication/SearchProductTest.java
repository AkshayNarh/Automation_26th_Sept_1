package Authentication;
import org.example.Listener.TestListener;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.example.BaseClass.BaseClass;
import org.example.PomClasses.HomePage;
import org.example.PomClasses.LoginPage;
import org.example.PomClasses.ProductListPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.*;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.example.UtilityClasses.AllureUtils.saveScreenshotPNG;

@Listeners(TestListener.class)
public class SearchProductTest extends BaseClass{

    WebDriver driver;

    HomePage hp;
    LoginPage lp;
    ProductListPage plp;
    ExtentTest extentTest;


    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser) throws IOException {
        driver = launchBrowser(browser);
        setUpReport();
    }

    @BeforeMethod
    public void beforeMethod(Method method){
        hp = new HomePage(driver);
        extentTest = BaseClass.extentReports.createTest(method.getName());
    }

    @Test(priority = 2)
    public void verifySearchProductFunctionality() throws IOException {
//        lp = hp.clickOnLoginButton();
//        lp.enterMobileNumber();
//        hp = lp.clickOnRequestOTPButton();
//        hp.verifyHomePageLoaded();
        hp = new HomePage(driver);
        plp = hp.enterTextInSearchField();
        extentTest.log(Status.INFO, "Entered Text in input field");
        Assert.assertTrue(plp.checkProductsLoaded(), "Products not loaded within 10 sec");
    }

    @Test(priority = 3)
    public void verifyUserCanClickOnProduct(){
        Assert.assertTrue(false);
    }

    @Test(priority = 4)
    public void verifyUserCanViewProduct(){
        Assert.assertTrue(true);
    }

    @Test(priority = 5)
    public void verifyUserCanSeeDetailsInSideProduct(){
        Assert.assertTrue(false);
    }

    @Test(priority = 6)
    public void verifyUserCanSeeDetailsInSideProduct1(){
        Assert.assertTrue(false);
    }

    @Test(priority = 7)
    public void verifyUserCanSeeDetailsInSideProduct2(){
        Assert.assertTrue(false);
    }

    @Test(priority = 8)
    public void verifyUserCanSeeDetailsInSideProduct3(){
        Assert.assertTrue(false);
    }

    @Test(priority = 9)
    public void verifyUserCanSeeDetailsInSideProduct445645(){
        Assert.assertTrue(false);
    }

    @Test(priority = 10)
    public void verifyUserCanSeeDetailsInSideProduct5(){
        Assert.assertTrue(false);
    }

    @Test(priority = 11)
    public void AddtoCart(){
        Assert.assertTrue(false);
    }

    @Test(priority = 12)
    public void AddtoCart2(){
        Assert.assertTrue(true);
    }


    @Test(priority = 11)
    public void verifyUserCanSeeDetailsInSideProduct222(){
        Assert.assertTrue(false);
    }

    @Test(priority = 12)
    public void verifyUserCanSeeDetailsInSideProduct7(){
        Assert.assertTrue(false);
    }


    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.SUCCESS){
            extentTest.log(Status.PASS, result.getName());
        }else{
            extentTest.log(Status.FAIL, result.getName());
            String source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
            extentTest.fail("Test case failed", MediaEntityBuilder.createScreenCaptureFromBase64String(source).build());
            saveScreenshotPNG(driver);
        }

    }

    @AfterClass
    public void afterClass(){
        BaseClass.extentReports.flush();
    }

}
