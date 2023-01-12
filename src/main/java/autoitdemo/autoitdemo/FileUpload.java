package autoitdemo.autoitdemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String downloadpath=System.getProperty("user.dir");// gets the current working directory
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium drivers\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("profile.default_content_settings.popups", 0);
	    chromePrefs.put("download.default_directory", downloadpath);
		options.setExperimentalOption("prefs",chromePrefs);
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("C:\\Users\\RUPALI\\Desktop\\auto it prac\\fileuploadnew.exe");
	WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(15));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTask")));
	driver.findElement(By.id("processTask")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));
	driver.findElement(By.id("pickfiles")).click();
	Thread.sleep(5000);
	File f = new File(downloadpath+"\\sample_page-0001.jpg");
	
	if(f.exists())
	{

		System.out.println("we are happy for learning github");


		System.out.println("New item also added");


		System.out.println("New item added in it for practice");
		System.out.println("New line added for see");

	System.out.println("File found");
	f.delete();
	System.out.println("File deleted");
	}
	
		
		
		
		
		
	}

}
