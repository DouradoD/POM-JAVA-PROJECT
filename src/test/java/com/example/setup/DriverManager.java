package com.example.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Projects_Dourado_Java\\chromedriver-win64\\chromedriver.exe");
        if (driver.get() == null) {
            // Initialize driver per thread
            driver.set(new ChromeDriver()); 
        }
        return driver.get();
    }
    
    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}