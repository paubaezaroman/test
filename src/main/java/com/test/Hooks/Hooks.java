package com.test.Hooks;

import com.google.inject.Inject;
import com.test.BasePage;
import com.test.SeleniumHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hooks extends BasePage {

    @Inject
    SeleniumHelper seleniumhelper;

    public static String scenarioID;

    @Before
    public void getScenario(Scenario scenario) {
        scenarioID = scenario.getName();
        String[] parts = scenarioID.split("-");
        scenarioID = parts[0];
    }

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "browserDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       }

    @After
    public void EndSession() throws IOException {
        seleniumhelper.takeScreenshot(driver, "target/TestEvidences/scenario-" + scenarioID + "/image.png");
        driver.close();
    }
}
