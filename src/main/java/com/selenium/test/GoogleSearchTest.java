package com.selenium.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
    public static void main(String[] args) {
      
    	WebDriverManager.chromedriver().browserVersion("137.0.7151.41").setup();
    	WebDriver driver = new ChromeDriver();

        driver.get("https://www.kwikklin.com");

       String tittle = driver.getTitle();
       System.out.println("Title :"+ tittle);
       driver.manage().window().maximize();
       driver.findElement(By.className("prefix__a")).click();
        driver.quit();
    }
}
