package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class BroadbandPage  extends DriverFactory {

    public void baseurl(){
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.bt.com/?");
    }
    public void broadband(){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Broadband"))).build().perform();
        actions.moveToElement(driver.findElement(By.linkText("TV & broadband"))).click().build().perform();
    }
    public void selectdeal(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("cta-button")).click();
    }
}
