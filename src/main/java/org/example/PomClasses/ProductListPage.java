package org.example.PomClasses;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ProductListPage extends HomePage{

    WebDriver driver;


    public ProductListPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step
    public boolean checkProductsLoaded(){
        return explicitWait(driver, 10, By.xpath("//div[@class='jIjQ8S']")).isDisplayed();
    }

    public void clickOnFirstProduct(){
        driver.findElement(By.xpath("//div[@class='jIjQ8S']")).click();
    }

    public ProductDetailsPage goToProductDetailsPage() {
        List<String> tabAddesses = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabAddesses.get(1));
        return new ProductDetailsPage(driver);
    }


}
