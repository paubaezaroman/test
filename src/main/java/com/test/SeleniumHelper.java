package com.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class SeleniumHelper extends BasePage{

    public static void waitForPageLoad() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(driver -> String
                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                .equals("complete"));
    }

    public static void waitForObjectToAppear(String cssLocator) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        WebElement Element= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssLocator)));
    }

    public static void assertTrueDisplayingPage(String your_page) {
        try {
            assertTrue(driver.getTitle().contains(your_page));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public static void assertTrueObjectExistsWithText(String your_object, String your_text) {
        try {
            Thread.sleep(2000);
            assertTrue(driver.findElement(By.cssSelector(your_object)).getText().equals(your_text));
        } catch (NoSuchElementException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot (WebDriver driver, String filepath) throws IOException {

        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File SrcFile=screenshot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(filepath);
        FileUtils.copyFile(SrcFile,DestFile);

    }
}
