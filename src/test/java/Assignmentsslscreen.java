import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Assignmentsslscreen {

	public static void main(String[] args) throws IOException {
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(screen,new File("C:\\Users\\Mubasher Mughal\\Desktop\\Selenium With Java Full Course\\Section 1\\screenshot.jpg"));
		

	}

}
