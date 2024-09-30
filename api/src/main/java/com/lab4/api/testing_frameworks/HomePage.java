package com.lab4.api.testing_frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Base {
    private final String USERNAME = "username";
    private final String PASSWORD = "password";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserName(){
        return findElement(By.name(USERNAME));
    }

    public WebElement getPassword(){
        return findElement(By.name(PASSWORD));
    }

    public void setUsername(String username){
        getUserName().sendKeys(username);
    }

    public void setPassword(String password){
        getPassword().sendKeys(password);
    }

}
