package com.example.setup;

import org.openqa.selenium.WebDriver;
import com.example.PageManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    private WebDriver driver;
    private PageManager pages;
    
    @Before
    public void setup(Scenario scenario) {
        System.out.println("Starting scenario: " + scenario.getName());
        WebDriver driver = DriverManager.getDriver(); // Initialize driver for this thread
        driver.manage().window().maximize();
        pages = new PageManager(driver);
    }
    
    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Finished scenario: " + scenario.getName() + 
                         " Status: " + scenario.getStatus());
        if (scenario.isFailed()) {
            // Take screenshot logic here
        }
        
        DriverManager.quitDriver();
    }
}