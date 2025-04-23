package com.example.pages;
import org.openqa.selenium.WebDriver;

import com.example.mappings.HomeMapping;

public class HomePage {
    // Define the WebDriver instance
    private WebDriver driver;
    private HomeMapping mapping;

    // Getter method for the WebDriver instance
    public WebDriver getDriver() {
        return driver;
    }

    public HomeMapping getMapping() {
        return mapping;
    }

    // Constructor to initialize the WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.mapping = new HomeMapping();
    }

    // Abstract method to be implemented by subclasses
    public Boolean IsHomeScreenVisible(){
        Boolean status;
        status = this.driver.findElement(mapping.LOGO).isDisplayed();

        return status;
    }

    // Other common methods for login pages can be added here
}