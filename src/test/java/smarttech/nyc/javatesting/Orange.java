package smarttech.nyc.javatesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe\\");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[contains(@name,'txtPassword')]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[contains(@id,'btnLogin')]")).click();


}
}
