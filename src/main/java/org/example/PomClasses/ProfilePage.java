package org.example.PomClasses;

import org.example.UtilityClasses.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v140.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfilePage extends Utils {

    WebDriver driver;

    @FindBy(xpath = "//div[text()='Manage Addresses']")
    private WebElement manageAddressButton;

    @FindBy(xpath = "//div[text()='ADD A NEW ADDRESS']")
    private WebElement addNewAddressButton;


    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOnManageAddress(){
        manageAddressButton.click();
    }

    public void clickOnAddNewAddress(){
        addNewAddressButton.click();
    }


    public void addAddressInfo(){

        List<String> addressInfo = new ArrayList<>(Arrays.asList("Priyanka", "89474633673", "411057", "Hinjewadi", "Pune"));

        for(int i=1; i<5; i++){
            driver.findElement(By.xpath("(//input[@class='afiehA QRzexE'])["+i+"]")).click();
            driver.findElement(By.xpath("(//input[@class='afiehA QRzexE'])["+i+"]")).sendKeys(addressInfo.get(i-1));
        }
        driver.findElement(By.xpath("//textarea[@name='addressLine1']")).sendKeys("Chhatrapati shivaji chowk, Hijewadi phase 1");
    }


    public void selectState(){
        Select select = new Select(driver.findElement(By.xpath("//select[@class='bQH2bC uQNw8v njGlUc RV7eaq']")));
        select.selectByVisibleText("Maharashtra");
    }

    public void selectRequiredRadioButton(String radioButtonType){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@type='radio' and @id='"+radioButtonType+"']")));
    }

    public void clickOnSaveButton(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[text()='Save']")));

    }


    public boolean checkAddressAdded(){
        return explicitWait(driver,10, By.xpath("//span[text()='Priyanka']")).isDisplayed();
    }






}
