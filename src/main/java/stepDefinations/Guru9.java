package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru9 {
	 
	    WebDriver d;
	    @Given("User is on Guru99 demo application")
	    public void user_is_on_guru99_demo_application() {
	        WebDriverManager.chromedriver().setup();
	         d=new ChromeDriver();
	         d.manage().window().maximize();
	         d.get("https://demo.guru99.com/test/newtours/index.php");
	         
	    }
	 
	    @When("User enter the {string} and {string}")
	   // public void user_enter_the_username_and_password(String un, String pwd) {
	    public void User_enter_the_username_and_passwrod(String un, String pwd) { 
	    d.findElement(By.xpath("//input[@name='userName']")).sendKeys(un);
	      d.findElement(By.name("password")).sendKeys(pwd);        
	    }
	 
	    @And("User clicks on the login button..")
	    public void User_clicks_on_the_login_button()
	    {
	    d.findElement(By.xpath("//input[@name='submit']")).click();    
	    }


	    @Then("User is on the home page")
	    public void user_is_on_the_home_page() throws InterruptedException {
	      Thread.sleep(4000);
	      String title=d.getTitle();
	      System.out.println(title);
//	      if(title.equals("Login: Mercury Tours"))
//	      {
//	      System.out.println("Logged in succcessfullyu");
//	      }
//	      else
//	          System.out.println("Invalid login");
//	  
	      d.close();
	}
	}
