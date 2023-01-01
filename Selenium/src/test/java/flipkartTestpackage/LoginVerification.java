package flipkartTestpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepkg.FlipBaseclass;
import pomclasses.FlipHomepage;
import pomclasses.FlipLogin;

public class LoginVerification {

	WebDriver driver;
	FlipLogin flgn;
	FlipHomepage fhp;
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String value)
	{
		FlipBaseclass.getDriver(value);
	}
	@BeforeMethod
	public void callingpommethods()
	{   
		flgn=new FlipLogin(driver);
		 
	}
	@Test
	public void do_operation() throws InterruptedException
	{
		flgn.entermail();
		flgn.enterpassword();
		flgn.clickbtn();
		//fhp.moveTowordsprofileIcon();
		
	}
	@AfterMethod
	public void verifyloginfunctionality()
	{
//		if(fhp.clickonlogoutbtn().equals("Logout"));
//		System.out.println(" Fuctinality verified");
	}
	
}
