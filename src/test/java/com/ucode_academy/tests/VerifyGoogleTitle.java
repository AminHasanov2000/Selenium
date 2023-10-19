package com.ucode_academy.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogleTitle {
    public static void main(String[] args) {
        // verify that google.com title is equal to Google
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page: " + actualTitle);

        if (actualTitle.equals("Google")){
            System.out.println("The title was verified");
        }
        else {
            System.out.println("The title was not verified");

        }

    }
}
