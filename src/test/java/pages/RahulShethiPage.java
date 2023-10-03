package pages;

import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RahulShethiPage extends Base {
    @Test
    public void rahulShethiTest(){
        navigateURL("https://rahulshettyacademy.com/AutomationPractice/");

//        String welcomeText = driver.findElement(By.tagName("h1")).getText();
//        Assert.assertEquals(welcomeText, "Practice Page");
        Assert.assertEquals(getText(By.tagName("h1")), "Practice Page");

        //Boolean logoIsDiplayed = driver.findElement(By.tagName("img")).isDisplayed();
        Assert.assertTrue( isDisplayed(By.tagName("img")) );

    }
}
