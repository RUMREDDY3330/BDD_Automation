package naukriStepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class NaukriLogin extends Base {

	
		@Given("User enter the naukri url")
		public void user_enter_the_naukri_url() {
		   d.navigate().to("https://www.naukri.com");
		   d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   d.findElement(By.className("Login")).click();
			
		}

		@When("User enter the username and password")
		public void user_enter_the_username_and_password() {
			
		    d.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("maheshreddy3330@gmail.com");
		    d.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys("Password@1234");
		    
		}

		@And("User Click on the login button")
		public void user_click_on_the_login_button() throws InterruptedException {
			d.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
		    //d.findElement(By.xpath("//div[@id='b1']//form/button")).click();
		}

		@Then("User is on home page")
		public void user_is_on_home_page() {
		    String title = d.getTitle();
		    System.out.println(title);
		    
		    if (title.equals("Search Jobs")) {
		    	System.out.println("User is on home page");
		    }
		    else {
		    	System.out.println("user not in home page");
		    	String title1=d.findElement(By.xpath("//div[@class='col s12 search-title mb5']")).getText();
				System.out.println(title1);
		    }
		  
		
		}
		

}



