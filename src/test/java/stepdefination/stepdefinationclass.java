package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;


public class stepdefinationclass {
	
	
	WebDriver driver = hooksclass.driver;
	

	@Given("User navigated to the Login page")
	public void user_navigated_to_the_Login_page() {
		
		
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
	    System.out.println("user is navigated to the login page");
	    }

	@When("Enter Username {string} and password {string}")
	
	public void enter_Username_and_password(String un, String pw) throws InterruptedException {
		
		driver.findElement(By.id("input-username")).sendKeys(un);;
		
		driver.findElement(By.id("input-password")).sendKeys(pw);
		
		driver.findElement(By.xpath("//button[text()=' Login']")).click();
		Thread.sleep(5000);
		
		String Expected = "Dashboard";
		String actual = driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
		
		Assert.assertEquals(Expected, actual);
			
	}
	
	@Then("Home page should be displayed")
	public void error_message_displayed() {
		
	   System.out.println("Home page should be displayed");
	   driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}
	
	@Given("User is on coupon create page")
	public void couponpage() {
		
		driver.findElement(By.xpath("//i[@class='fa fa-share-alt fw']")).click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Coupons")).click();
			
	}
   
	@When("Enter Coupon name {string} and Code {string}")
	public void enter_CouponDetails(String CN, String CD) throws InterruptedException {
		driver.findElement(By.cssSelector("#content > div.page-header > div > div > a")).click();
    
	    driver.findElement(By.id("input-name")).sendKeys(CN);;
		
		driver.findElement(By.id("input-code")).sendKeys(CD);
		
		driver.findElement(By.xpath("//button[(@type='submit')]")).click();	
		
//		String Expected = "Success: You have modified coupons! ";
//		String actual = driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]")).getText();
//		
//		Assert.assertEquals(Expected, actual);
		
    	
    }
    
	@And("Coupon should be created")
	public void SuccessCoupon() {
		
	   System.out.println("Coupon successfully created");
	}
	
	@And("Select the created coupon and delete from the list")
	public void DeleteCoupon() throws InterruptedException {
       
		driver.findElement(By.xpath("//*[@id='form-coupon']/div/table/thead/tr/td[2]/a")).click();						
	    driver.findElement(By.xpath("//form[@id='form-coupon']/div/table/tbody/tr[1]/td[1]/input")).click();	    
	    
//		Alert ale=driver.switchTo().alert();		
//        ale.accept();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/button")).click();		
		
		Alert ale=driver.switchTo().alert();		
	    ale.accept();
	    
	    Thread.sleep(3000);
		
		System.out.println("Coupon successfully deleted");
		
		
		
	}
	
	



}
