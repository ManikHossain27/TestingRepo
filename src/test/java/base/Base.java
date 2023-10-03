package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
    public WebDriver driver;

    @BeforeSuite
    public void driverSetup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void  driverClose(){
        driver.quit();
    }

    public void navigateURL(String URL){
        driver.get(URL);
    }

    public void sendKeys(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }
    public Boolean isDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }



}//Base
