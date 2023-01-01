package basepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownwithoutselect {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions option = new ChromeOptions();
option.addArguments("disable-notifications");
WebDriver driver= new ChromeDriver(option);
driver.get("https:/www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement ele= driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]//*"));
Actions act =new Actions(driver);
 act.moveToElement(ele).perform();
 ele.click();
 WebElement ele2= driver.findElement(By.id("month"));
 act.moveToElement(ele2).click().build().perform();
 act.sendKeys(Keys.ARROW_UP).perform();
 act.sendKeys(Keys.ARROW_UP).perform();

 Thread.sleep(2000);
 //driver.quit();
 
 
	}

}
