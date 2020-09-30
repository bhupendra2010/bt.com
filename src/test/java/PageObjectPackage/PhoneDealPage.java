package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class PhoneDealPage extends DriverFactory {

    public void mobile(){
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Mobile"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("SIM Only deals"))).click().build().perform();
    }
    public void simonlydeal(){
        driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
        driver.findElement(By.linkText("Family SIM deals")).click();
        /*new project*/
    }
}
