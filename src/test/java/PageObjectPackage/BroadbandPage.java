package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class BroadbandPage  extends DriverFactory {

    public void baseurl(){
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.bt.com/?");
    }
    public void broadband() throws IOException {
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Broadband"))).build().perform();
        actions.moveToElement(driver.findElement(By.linkText("TV & broadband"))).click().build().perform();

        TakesScreenshot screenshot=((TakesScreenshot)driver);
        File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile=new File("C:\\Users\\bhupe\\screenshot\\screensh1.png");
        FileUtils.copyFile(sourcefile,destinationfile);
    }
    public void selectdeal() throws IOException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1200)");
        driver.findElement(By.id("cta-button")).click();

        /*TakesScreenshot screenshot=((TakesScreenshot)driver);
        File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile=new File("C:\\Users\\bhupe\\screenshot\\screensh1.png");
        FileUtils.copyFile(sourcefile,destinationfile);*/
    }
}
