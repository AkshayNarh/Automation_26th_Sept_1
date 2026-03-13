package org.example.UtilityClasses;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AllureUtils {


    @Attachment(value = "Page Screenshot", type = "image/jpg")
    public static byte[] saveScreenshotPNG(WebDriver driver) {
        System.out.println("Allure screenshot");
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
