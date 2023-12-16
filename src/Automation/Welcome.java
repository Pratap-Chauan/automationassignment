package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Welcome {

	public static void main(String[] args) {
	
		//C:\Users\PratapChauhan\git\automationassignment\Chrome driver\chromedriver.exe
		//C:\Users\PratapChauhan\git\automationassignment\FireFox\geckodriver.exe
		//C:\Users\PratapChauhan\git\automationassignment\Edge\msedgedriver.exe
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratapChauhan\\git\\automationassignment\\Chrome driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.quit();
		
System.setProperty("webdriver.firefox.driver","C:\\Users\\PratapChauhan\\git\\automationassignment\\FireFox\\geckodriver.exe");
WebDriver driver1 =  new FirefoxDriver();

driver1.get("https://techelliptica.com/");
driver1.quit();

System.setProperty("webdriver.edge.driver", "C:\\Users\\PratapChauhan\\git\\automationassignment\\Edge\\msedgedriver.exe");
WebDriver driver2 = new EdgeDriver();

driver2.get("https://www.youtube.com/");
driver2.quit();

	}
	
}
