package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pageObdjects.LoginPage;

public class LoginPageTest {
	public static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();     
        driver.get("https://github.com");
        driver.manage().window().maximize();
        		
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void isCorrectLogPass() {
        LoginPage login = new LoginPage(driver);
        login.loginAs("testuser2710", "2710user");
		assertTrue("Login or Email don't correct",  driver.getTitle().equals("GitHub"));
		 
	}
	
	@Test
	public void isIncorrectLogPass() {
        LoginPage login = new LoginPage(driver);
        login.loginAs("testuser", "2710user");
        assertNotNull(driver.findElement(By.id("js-flash-container")));
	}

}
