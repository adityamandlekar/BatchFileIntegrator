package com.test.existingTestAutomationSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testCase1 {

    public WebDriver driver;
    public JavascriptExecutor js;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.out.println("*******************");
        System.out.println("launching Dell Website with Chrome browser");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.dell.com");
        driver.manage().window().maximize();
        js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 50)");
    }

    @Test
    public void testProductsLink()
    {
        driver.findElement(By.linkText("Products")).click();
    }

    @AfterClass
    public void tearDown() {
        if(driver!=null) {
            System.out.println("Closing Chrome browser");
            driver.close();
            driver.quit();
        }
    }
}
