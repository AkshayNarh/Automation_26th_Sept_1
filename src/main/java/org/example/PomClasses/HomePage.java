package org.example.PomClasses;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.example.UtilityClasses.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends LoginPage {

    WebDriver driver;
    @FindBy(xpath = "//div[@class='wszdrO']/a[@aria-label='Login']")
    private WebElement loginButton;
    @FindBy(xpath = "(//input[@class='nw1UBF v1zwn25'])[1]")
    private WebElement searchInputField;
    @FindBy(xpath = "//div[text()='My Profile']")
    private WebElement profilePageButton;

    private By profileNameElement = By.xpath("//*[text()='Akshay ']");

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoginPage clickOnLoginButton(){
        clickByJSE(driver, loginButton);
        return new LoginPage(driver);
    }

    public boolean verifyHomePageLoaded(){
        return explicitWait(driver, 25, profileNameElement).isDisplayed();
    }

    @Step
    @Description
    public ProductListPage enterTextInSearchField() throws IOException {
        String searchData = getDataFromSheetWithKey("Sheet 2", "SearchData");
        System.out.println("Search Product: "+ searchData);
        searchInputField.sendKeys(searchData);
        searchInputField.sendKeys(Keys.ENTER);
        return new ProductListPage(driver);
    }

    public void hoverOnProfileName(){
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(profileNameElement)).perform();
    }

    public ProfilePage clickObMyProfileButton(){
        profilePageButton.click();
        return new ProfilePage(driver);
    }




}
