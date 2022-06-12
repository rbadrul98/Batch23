package batch23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryTest {
	
	
public PageFactoryTest(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	    @FindBy(xpath="//*[contains(@class,'login')]")
    private WebElement SignInBtn;
	
	@FindBy(xpath="//*[contains(@name,'txtUsername')]")
	private WebElement UserName;
	
	@FindBy(xpath="//*[contains(@name,'txtPassword')]")
	private WebElement Password;
	
	@FindBy(xpath="//*[contains(@name,'Submit')]")
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