package batch23;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuildTesting {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe\\");
		driver = new ChromeDriver();

	}
	@Test
	public void openAutopractice () {
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sobhanrstech@gmail.com");
		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("sabiha2019");
		driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
	}
	@Test (priority=1)
	public void scrchproduct () {
	System.out.println(" looking for scrchproduct");
	}
	@Test(enabled= false)
	public void selectItem () {
		System.out.println(" i select selectItem");
	}
@AfterTest
 public void closeBrowser() {
	System.out.println("i want to close");
	driver.close();
	 
	 }
 }




	
