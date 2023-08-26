package testbase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class CucumberTestBase {
public static WebDriver driver;
	public static void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("Browser has been luanched");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Title of the browser is "+driver.getTitle());
}
	public static void tearDown() {
		
			driver.quit();
			System.out.println("Browser has been closed");
	
	}
	public static void getCurrentUrl() {
	System.out.println("Current url is : "+driver.getCurrentUrl());
	}
	public static void takesScreenshot() {
		String timeStamp=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenShotPath=System.getProperty("user.dir")+ "//src//test//resources//Screenshots_"+timeStamp+".png";
		
		try {
			//screenShotPath
			FileUtils.copyFile(scrFile,new File(screenShotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}