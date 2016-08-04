import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static void main(String[] args) {
		
		//firefox
		FirefoxDriver dr1 = new FirefoxDriver();
		dr1.get("https://bbc.com");
		
		//chrome
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
		ChromeDriver dr2= new ChromeDriver();
		dr2.get("https://bbc.com");
		
		//ie
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\iedriver\\IEDriverServer.exe");
		InternetExplorerDriver dr3 =new InternetExplorerDriver();
		dr3.get("https://bbc.com");
		

	}

}
