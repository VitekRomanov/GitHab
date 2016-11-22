package pageObdjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewRepository {
WebDriver driver;
	
	@FindBy (xpath ="(//a[contains(text(),'New repository')])[2]")
	protected WebElement startproj;                
	  
	//page 2
	
	@FindBy (id ="repository_name")
	protected WebElement repositoryName;
	
	@FindBy (id ="repository_auto_init")
	protected WebElement autoInit;
	
	@FindBy (xpath ="(//button[@type='submit'])[2]")
	protected WebElement createrep;
	
	
	
	public CreateNewRepository(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	
	public void repositoriCreate(String nameOfRepository){
		
		startproj.click();
		repositoryName.clear();
		repositoryName.sendKeys(nameOfRepository);
		autoInit.click();
		createrep.click();
	}
}
	

