package com.example.rahuchittyacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class MainPage {
    @FindBy(css = "input[id='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputPassword;

    @FindBy(css = "input[id='terms']")
    public WebElement inputTerms;

    @FindBy(css = "input[name='signin']")
    public WebElement inputSign;




    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
}

