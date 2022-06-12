package smarttech.nyc.javatesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest{
	
	public static void main(String[] args) {		                   
		 // System is a java final class    // Driver name  Location of driver or path
			System.setProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
			
	    // Interface  Object   Java keyword & chrome is a Class
		   WebDriver  driver  =  new ChromeDriver();  // Up-casting 
			
	    // 2. How you enter the URL	
		   driver.get("https://www.facebook.com/");
		   // 4. How to maximize the browser
			 // driver.manage().window().maximize();
			  //driver.findElement(By.id("email")).sendKeys("badrulrahman75@gmail.com");
			 //driver.findElement(By.id("password")).sendKeys("");
			  //driver.findElement(By.xpath("log in")).click();
			  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Badrulrahman75@gmail.com");
			  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("");
			 // driver.findElement(By.xpath("(//*[contains(@name,'login')])[2]\"]")).click();
			  driver.findElement(By.xpath("(//*[contains(@name,'login')])[2]")).click();
			 
	}}
			  
	
