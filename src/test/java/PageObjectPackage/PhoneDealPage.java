package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class PhoneDealPage extends DriverFactory {

    public void mobile(){
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Mobile"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("SIM Only deals"))).click().build().perform();
    }
    public void simonlydeal() throws IOException {
        driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
        driver.findElement(By.linkText("Family SIM deals")).click();

        TakesScreenshot screenshot=((TakesScreenshot)driver);
        File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile=new File("C:\\Users\\bhupe\\screenshot\\screensh1.png");
        FileUtils.copyFile(sourcefile,destinationfile);

    }
}
