import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommercetest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		String[] items= {"Brocolli","Onion","Walnuts"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		Ecommercetest b= new Ecommercetest();
//		b.itemssequence(driver, items);
		itemssequence(driver,items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	
	
	}
	public static void itemssequence(WebDriver driver,String[] items) {
		List<WebElement>products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0 ;i<products.size();i++) {
			String[] name=products.get(i).getText().split("-");
			String formartedname=name[0].trim();
			
			List itemspro=Arrays.asList(items);
			if(itemspro.contains(formartedname)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			}
		}
		
	}
	
}
