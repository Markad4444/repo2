package basepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtablesecondstep {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		for(int i=2;i<=7;i++)
		{
			for(int j=1;j<=3;j++)
			{
				WebElement alldata=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]"));
				Thread.sleep(2000);
				String text=alldata.getText();
				System.out.println(text);
			}
		}
	}

}
