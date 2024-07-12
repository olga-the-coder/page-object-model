package com.example.rahuchittyacademy;

import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        mainPage = new MainPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void signIn() throws InterruptedException {
        mainPage.inputUsername.sendKeys("rahulshettyacademy");
        mainPage.inputPassword.sendKeys("learning");
        mainPage.inputTerms.click();
        mainPage.inputSign.click();
        Thread.sleep(6000);
    }
}
