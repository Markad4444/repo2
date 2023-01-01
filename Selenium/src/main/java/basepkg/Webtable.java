package basepkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Nos of rows" + rows.size());

		List<WebElement> coloumns = table.findElements(By.tagName("td"));
		System.out.println("No of coloums" + coloumns.size());
		// count nos of coloumns in each row
		List<WebElement> rowcout, coloumncount;
		rowcout = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rowcout.size(); i++) {
			coloumncount = rowcout.get(i).findElements(By.tagName("td"));
			System.out.println("Row no" + (i + 1) + "coloumns" + coloumncount.size());
		}
		// driver.close();
		
		for (int j = 1; j < rowcout.size() - 1; j++) {
			coloumncount = rowcout.get(j).findElements(By.tagName("td"));
			String company = coloumncount.get(0).getText();
			String contact = coloumncount.get(1).getText();
			String country=coloumncount.get(2).getText();
			System.out.println(company + "----" + contact +"-----"+country);
		}

	}

}
