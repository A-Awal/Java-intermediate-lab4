package com.lab4.api.testing_frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest {
    HomePage homepage;

    @BeforeClass
    void prepare(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        homepage = new HomePage(driver);
    }

    @Test
    void login() throws InterruptedException{
        Thread.sleep(2000); // wait for page to load

        homepage.setUsername("Admin");
        homepage.setPassword("admin123");

        WebElement submitBTn = homepage.findElement(By.tagName("button"));
        submitBTn.click();
        
        Thread.sleep(2000); // wait for page to load

        WebElement bar = homepage.findElement(By.tagName("h6"));
        String actualResult = bar.getText();
        

        String expectedResult = "Dashboard";
        Assert.assertEquals(actualResult, expectedResult);
    }
}
