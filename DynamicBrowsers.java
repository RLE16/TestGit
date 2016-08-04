import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DynamicBrowsers {

	public static void main(String[] args) {
		
		String browser= "Chrome";
		WebDriver driver=null;
		
		if(browser.equals("Mozilla"))
			driver= new FirefoxDriver();
		else if(browser.equals("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\iedriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
			
		 driver.get("https://bbc.com");
		 System.out.println(driver.getTitle());
			
	}

}
