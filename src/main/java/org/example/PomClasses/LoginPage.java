package org.example.PomClasses;

import org.example.UtilityClasses.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends Utils {

    @FindBy(xpath = "//input[@class='c3Bd2c yXUQVt']")
    private WebElement loginInputField;

    @FindBy(xpath = "//button[@class='dSM5Ub Kv3ekh KcXDCU']")
    private WebElement requestOTPButton;

    WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void enterMobileNumber() throws IOException, InterruptedException {
        Thread.sleep(2000); //Can not add explicit wait
        WebElement element = driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']"));
        String mobileNumber = getConfigData("mobileNumber");
        element.sendKeys(mobileNumber);
    }

    public HomePage clickOnRequestOTPButton(){
        requestOTPButton.click();
        return new HomePage(driver);
    }
}
