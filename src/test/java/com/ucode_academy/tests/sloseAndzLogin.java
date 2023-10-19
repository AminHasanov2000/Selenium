package com.ucode_academy.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sloseAndzLogin {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(4000);

       // driver.close();
        driver.quit();

    }
}
