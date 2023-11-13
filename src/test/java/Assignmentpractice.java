import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmentpractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticdropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".nav-link.btn.btn-primary")));
		List<WebElement>products=driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<products.size();i++) {
			products.get(i).click();
		}
		
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
	}

}
