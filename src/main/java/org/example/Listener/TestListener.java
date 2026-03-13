package org.example.Listener;

import org.example.BaseClass.BaseClass;
import org.example.PomClasses.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static org.example.UtilityClasses.AllureUtils.saveScreenshotPNG;

public class TestListener  implements ITestListener {


    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Screen shot attaching");
      //  System.out.println("Driver Value: "+ BaseClass.getDriver());
//        Object testClass = result.getInstance();
//        WebDriver driver = ((BaseClass) testClass).driver;
      //  saveScreenshotPNG(BaseClass.getDriver());
    }

    @Override
    public void onTestStart(ITestResult result){
        System.out.println(result.getName()+" Test started");
    }

}
