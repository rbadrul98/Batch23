package smarttech.nyc.javatesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {		                   
		 // System is a java final class    // Driver name  Location of driver or path
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
	    // Interface  Object   Java keyword & chrome is a Class
		   WebDriver  driver  =  new ChromeDriver();  // Up-casting 
			
	    // 2. How you enter the URL	
		   driver.get("http://automationpractice.com/index.php?");
		   
		   // 4. How to maximize the browser
			  driver.manage().window().maximize();
			  driver.findElement(By.className("login")).click();
			  driver.findElement(By.id("email")).sendKeys("sobhanrstech@gmail.com");
			  driver.findElement(By.name("passowrd")).sendKeys("sabiha2019");
			  driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
			  driver.close();
	}
	
}
