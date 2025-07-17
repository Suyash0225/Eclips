package com.selenium.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class firstCode {
    public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();

        driver.get("https://thebanarasisaree.com/");
        driver.findElement(By.id("search")).sendKeys("Suyash");
        System.out.println("Check Changes");
        System.out.println("Check Changes");
        System.out.println("Check Changes");

        driver.close();
    }
}
