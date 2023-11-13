import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamectrlkey {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(driver.findElements(By.tagName("a")).size());
	WebElement footertag=driver.findElement(By.id("gf-BIG"));
	System.out.println(footertag.findElements(By.tagName("a")).size());
	WebElement footer1column=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(footer1column.findElements(By.tagName("a")).size());
	for(int i=1;i<footer1column.findElements(By.tagName("a")).size();i++) {
	String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	footer1column.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	
	}
	
	Set<String>childwindow=driver.getWindowHandles();
     Iterator<String> it= childwindow.iterator();
    while(it.hasNext()) {
    	driver.switchTo().window(it.next());
    	System.out.println(driver.getTitle());
    }
	
	
	
	
	
	
	
	}

}
