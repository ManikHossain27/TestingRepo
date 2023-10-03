package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage extends Base{
    @Test
    public void testHomePage() throws InterruptedException {

        //driver.get("https://www.daraz.com.bd/");
        navigateURL("https://www.daraz.com.bd/");

//        WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
//        search.sendKeys("Sun Glass");

        //driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Sun Glass");
        sendKeys(By.xpath("//input[@id='q']"), "Sun Glass");
        Thread.sleep(3000);

        //driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
        click(By.xpath("//button[contains(text(),'SEARCH')]"));
        Thread.sleep(3000);


    }
}
