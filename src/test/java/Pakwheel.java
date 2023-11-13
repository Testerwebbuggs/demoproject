import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pakwheel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.pakwheels.com/");
		driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
		driver.findElement(By.id("home-query")).sendKeys("Civic");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("Honda Civic")) {
				option.click();
				break;

			}

		}
		driver.findElement(By.xpath("//span[text()='All Cities']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Lahore");
		Thread.sleep(2000);
		driver.findElement(By.id("UsedCity_chzn_o_3")).click();
//	  List<WebElement>cities= driver.findElements(By.xpath("//li[@class='active-result group-option']  "));	  for(WebElement city:cities) {
//		  if(city.getText().equalsIgnoreCase("Lahore"));
//		  city.click();
//		  break;
//	  }
//
		driver.findElement(By.id("pr-range-filter")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pr_from")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tt-suggestion tt-selectable'])[2]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("pr_to")).sendKeys("30");
//		Thread.sleep(2000);	
//		driver.findElement(By.xpath("(//div[@class='tt-suggestion tt-selectable'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[6]" )).click();

	}
}