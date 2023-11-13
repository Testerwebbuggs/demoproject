



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();	
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(staticDropDown);
		Thread.sleep(2000);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//    	driver.findElement(By.id("autosuggest")).click();
		Thread.sleep(2000);
        List <WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option:options) {
        	if(option.getText().equalsIgnoreCase("India"))
        	{
        	option.click();
        	break;
   }
	
		
		

}
	}
}

