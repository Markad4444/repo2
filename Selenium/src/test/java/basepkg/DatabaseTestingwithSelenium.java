package basepkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatabaseTestingwithSelenium {
  @Test
  public void findWebtable() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement table=driver.findElement(By.xpath("//table[@border='1']"));
	  List<WebElement> rowcount=table.findElements(By.tagName("tr"));
	  System.out.println("Total no of rows"+rowcount.size());
  }
}
