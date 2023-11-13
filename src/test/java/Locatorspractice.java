import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mubasher Mughal\\eclipse-workspace\\SeleniumJava\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Tester");
		driver.findElement(By.name("inputPassword")).sendKeys("Webbuggs");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Webbuggs");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Webbuggs@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("03000000000");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='logout-btn']")).click();
		
	}

}
