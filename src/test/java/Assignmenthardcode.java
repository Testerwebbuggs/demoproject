import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmenthardcode {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("checkBoxOption3")).click();
	String gettext=driver.findElement(By.cssSelector("label[for='honda']")).getText();
	WebElement staticdropdown= driver.findElement(By.id("dropdown-class-example"));
	Select dropdown= new Select(staticdropdown);
	dropdown.selectByVisibleText(gettext);
	driver.findElement(By.id("name")).sendKeys(gettext);
	driver.findElement(By.id("alertbtn")).click();
//	driver.switchTo().alert().accept();
	String text= driver.switchTo().alert().getText();
	if(text.contains(gettext)) {
		System.out.println("Test Run Successfully");
	}
	else {
		System.out.println("Test Fail");
	}
	
	

	}

}
