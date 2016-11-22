package tests;

import static org.junit.Assert.assertNotNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObdjects.CreateNewRepository;
import pageObdjects.LoginPage;

public class CreateNewRepositoryTest {

	public static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://github.com");
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		login.loginAs("testuser2710", "2710user");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void createRepository() {
		CreateNewRepository repository = new CreateNewRepository(driver);
		repository.repositoriCreate("pumba1111");
		assertNotNull(driver.findElement(By.linkText("pumba1111")));
		
	}
}
