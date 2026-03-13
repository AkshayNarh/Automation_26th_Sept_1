package org.example.UtilityClasses;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.FileHandler;

public class Utils {


    public static WebElement explicitWait(WebDriver driver, int maxTime, By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxTime));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static String getDataFromSheetWithKey(String sheetName, String Key) throws IOException {
        FileInputStream file = new FileInputStream("/Users/akshay/IdeaProjects/demo_maven_project1/src/main/resources/testData.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        int lastRow = sheet.getLastRowNum();
        String valueOfProvidedKey = "";
        for(int i=0; i<lastRow; i++){
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0);
            if(cell.getStringCellValue().equals(Key)){
                valueOfProvidedKey = row.getCell(1).getStringCellValue();
                break;
            }
        }
        return valueOfProvidedKey;
    }


    public static void clickByJSE(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }


    public static String getConfigData(String key) throws IOException {
        FileInputStream file = new FileInputStream("/Users/akshay/IdeaProjects/demo_maven_project1/src/main/resources/config/config.properties");
        Properties prop = new Properties();
        prop.load(file);
        return prop.getProperty(key);

    }




}
