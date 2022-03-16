package com.selenium.qa.google;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    @Test
    public void googleTest(){
        System.setProperty("webdriver.chrome.driver","C:\\ITLearning\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
