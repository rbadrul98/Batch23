package batch23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory1 {
	
	
public PageFactory1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	    @FindBy(xpath="//*[contains(@class,'login')]")
    private WebElement SignInBtn;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement UserName;
	
	@FindBy(xpath="//*[contains(@name, 'passwd')]")
	private WebElement Password;
	
	@FindBy(xpath="//*[contains(@class,'button')]")
	private WebElement SubmitBtn;
	
	public WebElement getSignInBtn() {
		return SignInBtn;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
}