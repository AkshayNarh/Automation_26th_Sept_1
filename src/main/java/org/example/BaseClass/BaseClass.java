package org.example.BaseClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.example.UtilityClasses.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
    public static ExtentReports extentReports;

    public static WebDriver launchBrowser(String browser) throws IOException {
        if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }else if(browser.equals("firefox")){
            System.out.println("enter in firefox init");
            driver = new FirefoxDriver();
            System.out.println("exit in firefox init");
        }
        String url = Utils.getConfigData("url");
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }


    public void tearDown(){
        driver.quit();
    }


    public static void setUpReport(){
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("output/extentReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
    }



}
