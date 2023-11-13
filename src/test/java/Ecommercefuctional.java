import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommercefuctional {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemspro = { "Cucumber", "Brocolli", "Cauliflower" };
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatitems=name[0].trim();
			List itemsproduct = Arrays.asList(itemspro);
			if (itemsproduct.contains(formatitems)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}

	}

}
