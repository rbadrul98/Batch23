package smarttech.nyc.javatesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryTest {
	
	
public PageFactoryTest(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[contains(@name,'txtUsername')]")
private WebElement UserName;

@FindBy(xpath="//*[contains(@name,'txtPassword')]")
private WebElement Password;

@FindBy(xpath="//*[contains(@class,'button')]")
private WebElement LogInBtns;

	   	
public WebElement getSignInBtn() {
	return getSignInBtn();
}
public WebElement getUserName() {
	return UserName;
}
public WebElement getPassword() {
	return Password;
}
public WebElement getSubmitBtn() {
	return getSubmitBtn();
}


}
	
