import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticpractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webbuggs.com/");
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.id("contact-form-name")).sendKeys("Tester");
		WebElement staticdropdown=driver.findElement(By.id("Services_item"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByVisibleText("App Development");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		
		
		

	}

}
