package cucumber;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import batch23.PageFactoryTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Cucumber {
	WebDriver  driver;
	PageFactoryTest obj;
	@Given("^user able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe\\");
		 driver= new ChromeDriver();

	}

	@Given("^User able to enter the URL$")
	public void user_able_to_enter_the_URL() throws Throwable {
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User able click on Signin Button$")
	public void user_able_click_on_Signin_Button() throws Throwable {
	    
	    
	}

	@When("^User able to enter the Username$")
	public void user_able_to_enter_the_Username() throws Throwable {
	    
	    //driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]"))
		obj.getUserName().sendKeys("Admin");
	    
	}

	@When("^User able to enter the Password$")
	public void user_able_to_enter_the_Password() throws Throwable {
	    
	    
	}

	@When("^User able to click on the submit Button$")
	public void user_able_to_click_on_the_submit_Button() throws Throwable {
	    
	    
	}

	@Then("^User able to login Successfully$")
	public void user_able_to_login_Successfully() throws Throwable {
	    
	    
	}

	@Then("^User able see his/her Name in the home page$")
	public void user_able_see_his_her_Name_in_the_home_page() throws Throwable {
	    
	    
	}



}
