package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;
public class OpenBrowseFirstTime {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratapChauhan\\git\\automationassignment\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//driver.manage().window().getSize();
		//		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		

		Dimension dm = new Dimension(300, 500);
		driver.manage().window().setSize(dm);

		driver.manage().window().minimize();

		System.out.println(driver.getPageSource());
		
		driver.close();
		driver.quit();
	}

}
