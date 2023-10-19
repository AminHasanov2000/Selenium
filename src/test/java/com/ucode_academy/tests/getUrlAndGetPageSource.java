package com.ucode_academy.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndGetPageSource {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String pageUrl = driver.getCurrentUrl();

        String pageSource = driver.getPageSource();

        System.out.println("Current page URL: " + pageUrl);

        System.out.println("Current page source " + pageSource);




    }
}
