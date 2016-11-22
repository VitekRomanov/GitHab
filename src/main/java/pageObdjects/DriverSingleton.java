package pageObdjects;

import org.openqa.selenium.chrome.ChromeDriver;



public final class DriverSingleton {
    private static ChromeDriver driver = null;

    private DriverSingleton() {}

    public static synchronized ChromeDriver getInstance() {
        if (driver == null)
        System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();      
        return driver;
    }
}