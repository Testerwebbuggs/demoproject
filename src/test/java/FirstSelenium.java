import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mubasher Mughal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com/");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
