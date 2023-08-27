package myhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import testbase.CucumberTestBase;

public class AmazoneHooks{

	//public static WebDriver driver;
	@Before("@Smoke")
	public static void launchBrowser(Scenario sc) {
		//setUp();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		System.out.println("Browser has been "+driver.getCurrentUrl()+" luanched");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println(driver.getTitle()); 
		System.out.println(sc.getName());
	}
//	@Before(order = 2)
//	public void getUrl() {
//		getCurrentUrl();
//	}
	@After(order = 2)
	public void closeBrowser() {
		//tearDown();
	}
//	@After(order = 1)
//	public void logOut(Scenario sc) {
//		System.out.println(sc.getName());
//	}
	@BeforeStep
	public void screenShot() {
		//takesScreenshot();
	}
	@AfterStep
	public void refreshPage() {
//		driver.navigate().refresh();
	//	System.out.println("Page has been refreshed");
	}
}
