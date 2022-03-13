package com.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","html:target/cucumber.html",
        "junit:target/cucumber.xml",
        "json:target/cucumber-report.json"},
        glue ={"classpath:com/test/stepDefs", "classpath:com/test/Hooks"},
        features = "classpath:features/",
        tags = "@Login_HUDL"
)

public class TestRunner {

}
