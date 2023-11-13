import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Childwindowandsplit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String>window=driver.getWindowHandles();
		java.util.Iterator<String> p= window.iterator();
		String parentid =p.next();
		String childid= p.next();
		driver.switchTo().window(childid);
	   System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//	   driver.findElement(By.cssSelector(".im-para.red")).getText();
	   
	  String emailid= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	  Thread.sleep(2000);
	  driver.switchTo().window(parentid);
	  driver.findElement(By.id("username")).sendKeys(emailid);
	   
	   
	   
	   
	}

}
