package com.example;

import com.example.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class PageManager {
    private WebDriver driver;
    private HomePage home;
    // Other pages...

    // Constructor now expects a WebDriver
    public PageManager(WebDriver driver) {
        this.driver = driver;
        initializePages();
    }

    private void initializePages() {
        home = new HomePage(driver);
        // Initialize other pages...
    }

    // Getters for pages
    public HomePage getHome() { return home; }
    // Other getters...
}
