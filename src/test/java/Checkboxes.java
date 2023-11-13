import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
//		Calander syntax
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//		System.out.println(driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).getText());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
	}

}