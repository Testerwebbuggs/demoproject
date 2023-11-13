import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']/p")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='navbar-brand'])[2]")));
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains(name)) {
				driver.findElement(By.cssSelector(".btn.btn-info")).click();

			}
		}
			driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
	}

}