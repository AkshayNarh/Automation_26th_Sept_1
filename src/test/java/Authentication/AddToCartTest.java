package Authentication;

import org.example.BaseClass.BaseClass;
import org.example.PomClasses.HomePage;
import org.example.PomClasses.LoginPage;
import org.example.PomClasses.ProductDetailsPage;
import org.example.PomClasses.ProductListPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class AddToCartTest {

    WebDriver driver;

    HomePage hp;
    LoginPage lp;
    ProductListPage plp;
    ProductDetailsPage pdp;


    @BeforeClass
    public void beforeClass(){
//        BaseClass bc = new BaseClass();
//        driver = bc.launchBrowser();
    }

    @BeforeMethod
    public void beforeMethod(){
//        hp = new HomePage(driver);
//        plp = new ProductListPage(driver);

    }

    @Test(priority = 3)
    public void VerifyUserCanAddProductToCart() throws IOException {
//        lp = hp.clickOnLoginButton();
//        lp.enterMobileNumber();
//        hp = lp.clickOnRequestOTPButton();
//        hp.verifyHomePageLoaded();
//        plp = hp.enterTextInSearchField();
//        plp.checkProductsLoaded();
//        plp.clickOnFirstProduct();
//        pdp = plp.goToProductDetailsPage();
//        pdp.clickOnAddToCartButton();

    }

    @AfterMethod
    public void afterMethod(){

    }

    @AfterClass
    public void afterClass(){

    }

}
