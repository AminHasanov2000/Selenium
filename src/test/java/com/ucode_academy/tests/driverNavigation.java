package com.ucode_academy.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverNavigation {
    public static void main(String[] args) throws InterruptedException {
       // Creating driver instance
        WebDriver driver = new ChromeDriver();
       // Navigating to Url /open google.com in Chrome browser
        driver.get("https://www.google.com/");

        // Maximaize browser window
        driver.manage().window().maximize();

        // wait for 3 second
        Thread.sleep(3000);

        // navigate to given url in the same browser tab
        driver.navigate().to("https://www.amazon.com/");

      // wait for 4 seconds
        Thread.sleep(4000);

        driver.navigate().back();

         // wait  for 3 seconds
        Thread.sleep(3000);

        // go forward  to the same page
        driver.navigate().forward();

        // wait for 3 seconds
        Thread.sleep(3000);

        driver.navigate().refresh();

        // Close the current browser/tab
        driver.close();








    }
}
