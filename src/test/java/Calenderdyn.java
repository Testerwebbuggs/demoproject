import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderdyn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");
		Thread.sleep(2000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		Thread.sleep(2000);
		while (!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().equalsIgnoreCase("August")) {
			
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		}

		List<WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day "));
		for (int i = 0; i < driver.findElements(By.cssSelector(".flatpickr-day ")).size(); i++) {
			String text = driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();
			}

		}

	}

}
