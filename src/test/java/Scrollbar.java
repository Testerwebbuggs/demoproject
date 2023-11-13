import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=4000");
		int sum=0;
	    List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i=0;i<driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")).size();i++) {
	sum= sum +   Integer.parseInt(driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")).get(i).getText());
	    
	     
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
	int totalvalue=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	Assert.assertEquals(sum, totalvalue);
	System.out.println(totalvalue);
	
	}

}
