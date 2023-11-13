import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderdynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");

		Thread.sleep(3000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		List<WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day "));

		for (int i = 0; i < driver.findElements(By.cssSelector(".flatpickr-day ")).size(); i++) {
			String text = driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();
			}

		}

	}

}
