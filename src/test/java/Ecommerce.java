import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String[] productsItem = { "Mushroom", "Corn", "Pears" };
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formateditem = name[0].trim();

			List productThing = Arrays.asList(productsItem);

			if (productThing.contains(formateditem)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement staticdropdown = driver.findElement(By.xpath("//div/select"));
		Select dropdown = new Select(staticdropdown);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Pakistan");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".chkAgree")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		

	}

}
