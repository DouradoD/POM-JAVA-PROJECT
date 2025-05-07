package com.example.setup;

import org.openqa.selenium.WebDriver;

import com.example.PageManager;

public class TestContext {
       private WebDriver driver;
        private PageManager pages;

    
    public TestContext() {
        this.driver = DriverManager.getDriver(); // Your driver initialization if needed
        initializePages();
    }
    
    private void initializePages() {
        pages = new PageManager(driver);

    }
    
    // Getters for pages
    public PageManager getPages() { return pages; }
    public WebDriver getDriver() { return driver; }
}
