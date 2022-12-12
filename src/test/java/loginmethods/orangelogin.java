package loginmethods;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangelogin {

	WebDriver driver=null;

	@Given("^when user hits the url in the browser$")
	public void when_user_hits_the_url_in_the_browser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	
	
	
	
	@When("^user enters username and password$")
	public void user_enters_and() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}

	
	
	@Then("^user should be successfully able to login$")
	public void user_should_be_successfully_able_to_login() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		System.out.println("Done logged in...");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		boolean a=driver.findElement(By.xpath("//h6")).isDisplayed();
		if(a==true)
		{
			System.out.println("Login successful");	
		}
		else
		{
			System.out.println("Login failure");	
		}
		
		driver.close();
	}

}
