package com.selenium.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    WebDriver driver;

    @Test
    public void googleSearchTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\ITLearning\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("input")).sendKeys("product");


    }


}
