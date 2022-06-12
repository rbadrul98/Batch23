package smarttech.nyc.javatesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLoginTest {
	
	// 1. How to open the browser in selenium?	
	public static void main(String[] args) {		                   
	 // System is a java final class    // Driver name  Location of driver or path
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
    // Interface  Object   Java keyword & chrome is a Class
	   WebDriver  driver  =  new ChromeDriver();  // Up-casting 
		
    // 2. How you enter the URL	
	   driver.get("https://www.ups.com/us/en/Home.page");
	  
		  
	// Navigate method help to go forward & backward 
	// driver.navigate().to("https://www.facebook.com/");
	// 3. What is the different between get & navigate 

	  
    // 4. How to maximize the browser
	  driver.manage().window().maximize();
	  
	  // How to find the web-element ?
	  
	  //driver.findElement(By.partialLinkText("Sign up / Log in")).click();
	  driver.findElement(By.linkText("Sign up / Log in")).click();
	  
	  
	  driver.findElement(By.id("email")).sendKeys("alammohammed79@gmail.com");
	  driver.findElement(By.id("pwd")).sendKeys("SAYEDawan2008");
	  
	  //driver.findElement(By.id("submitBtn")).click();
	  
	  System.out.println(driver.getTitle());
	  
	  
	  // How to close the browser  
	   driver.quit();
	  // driver.close();
	    
	 // 5. What is the different between close & quit
	  
	  // Ans:- Driver.quit method close the browser as well as close the server
	  // Driver.close only close the browser 
	  // Driver.close help to close the IE browser
	  
	}


}