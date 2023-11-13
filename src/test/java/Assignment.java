import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name'][1]")).sendKeys("Tester");
		driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("Tester@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticdropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("5/8/2000");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		

	}

}
