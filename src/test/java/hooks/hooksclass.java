package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksclass {
	
	public static WebDriver driver;
	
	@Before
	public void Launchurl()
	{
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://retailm1.upskills.in/admin/index.php?route=common/dashboard&token=fOtazgcSDn3hST8dy4F1RPyPR15xQsnO");
		 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	
	@After
	public void appclose()
	{
		driver.quit();
	}

}
