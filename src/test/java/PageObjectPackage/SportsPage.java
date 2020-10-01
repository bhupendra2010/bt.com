package PageObjectPackage;

import CommonPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SportsPage extends DriverFactory {

    public void sports(){
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"bt-navbar\"]/div/div[2]/div/div[1]/div[1]/ul/li[3]/a/span"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("Cricket"))).click().build().perform();

        driver.findElement(By.linkText("See TV & sport deals")).click();
    }
}
