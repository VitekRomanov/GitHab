package pageObdjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy (linkText ="Sign in")
	private WebElement signIn;
	
	@FindBy (id ="login_field")
	private WebElement userLogin;
	
	@FindBy (id ="password")
	private WebElement password;
	
	@FindBy (name="commit")
	private WebElement commit;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void loginAs(String usserlog, String userpass){
		
		signIn.click();
		userLogin.sendKeys(usserlog);
		password.sendKeys(userpass);
		commit.click();
	}
		
}
