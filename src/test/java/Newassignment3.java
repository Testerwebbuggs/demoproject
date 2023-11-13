import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Iterators;

public class Newassignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
//	    WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String>window=driver.getWindowHandles();
		java.util.Iterator<String>p=window.iterator();
		String parentid=p.next();
		String childid=p.next();
		driver.switchTo().window(childid);
		
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='New Window']")));
		Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
        driver.switchTo().window(parentid);
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Opening a new window']")));
        Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
		
	}

}
