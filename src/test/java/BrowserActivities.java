import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserActivities {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mubasher Mughal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Webbuggs");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.id("contact-form-name")).sendKeys("Tester");
		driver.findElement(By.id("contact-form-email")).sendKeys("Webbugss@gmail.com");
		driver.findElement(By.id("contact-form-phone")).sendKeys("0300000000000");
		driver.findElement(By.id("contact-form-massage")).sendKeys("Thank you");
		WebElement staticdropdown=driver.findElement(By.id("Services_item"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("branding");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Web Development");
     	System.out.println(dropdown.getFirstSelectedOption().getText());
     	Thread.sleep(2000);
     	dropdown.selectByIndex(4);
     	System.out.println(dropdown.getFirstSelectedOption().getText());
		

	}

}
