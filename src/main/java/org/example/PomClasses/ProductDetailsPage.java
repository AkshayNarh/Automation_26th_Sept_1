package org.example.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v140.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends ProductListPage{

    @FindBy(xpath = "//div[text()='Buy with EMI']/ancestor::div[@class='grid-formation grid-column-2']/parent::div/preceding-sibling::div")
    private WebElement addToCartIcon;


    WebDriver driver;

    public ProductDetailsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void clickOnAddToCartButton(){
        addToCartIcon.click();
    }


}
