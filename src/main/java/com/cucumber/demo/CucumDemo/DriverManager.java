package com.cucumber.demo.CucumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    public WebDriver driver;

    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mysourcesbx.qualcomm.com/");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }

}
