package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityfolderpkg.FlipUtilityClass;

public class FlipLogin extends FlipUtilityClass {
	WebDriver driver;
	
	@FindBy(xpath ="//span[text()='Enter Email/Mobile number']")
	private WebElement email;
	
	@FindBy(xpath ="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath ="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement btn;
	
 public FlipLogin(WebDriver driver)
 
 {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
 }
 
 public void entermail() throws InterruptedException
 { 
	 expliciteWait(driver, email);
	 Thread.sleep(2000);
	email.sendKeys("9049221706");
 }
 
 public void enterpassword()
 {
	 expliciteWait(driver, pass);
	 pass.sendKeys("amazon@123");
 }
 
 public void clickbtn()
 {
	 expliciteWait(driver, btn);
	 btn.click();
 }
 
}
