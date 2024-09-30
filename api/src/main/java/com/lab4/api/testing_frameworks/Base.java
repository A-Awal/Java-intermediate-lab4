package com.lab4.api.testing_frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base {
    private WebDriver _driver;

    protected Base(WebDriver webDriver){
        _driver = webDriver;
    }

    protected WebElement findElement(By locator){
        return _driver.findElement(locator);
    }

    protected void setContent(By locator, String content){
         findElement(locator).sendKeys(content);
    }
    protected void setContent(WebElement element, String content){
         element.sendKeys(content);
    }


}
