import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2EndTesing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)'] "))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
//			System.out.println(driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).getText());
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.id("btnclosepaxoption")).click();
//		    Thread.sleep(2000);
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@class='MultiCityContent']")).getText());
		driver.findElement(By.id("MultiCityModelAlert")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
