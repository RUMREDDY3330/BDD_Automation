package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepGuruRegistration {
	WebDriver d;
	@Given("User given the Url and user is on home page")
	public void user_given_the_url_and_user_is_on_home_page() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    d= new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("https://demo.guru99.com/test/newtours/");
	    Thread.sleep(3000);
	}

	@When("User Click on the Register button to Register")
	public void user_click_on_the_register_button_to_register() {
	    d.findElement(By.xpath("//td[@class='mouseOut'][2]/child::a")).click();
	    String title = d.getTitle();
	    System.out.println(title);
	}

	@And("User give the valide credentials and user name and password")
	public void user_give_the_valide_credentials_and_user_name_and_password() {
	    d.findElement(By.name("firstName")).sendKeys("R Umamaheswara");
	    d.findElement(By.name("lastName")).sendKeys("Reddy");
	   d.findElement(By.xpath("//input[@name='phone']")).sendKeys("3333333333");
	   d.findElement(By.name("address1")).sendKeys("Owk");
	   	d.findElement(By.xpath("//input[@name='city']")).sendKeys("Kurnool");
	   	d.findElement(By.xpath("//input[@name='state']")).sendKeys("AndharaPradesh");
	   	d.findElement(By.name("postalCode")).sendKeys("11111");
	   	WebElement element = d.findElement(By.xpath("//select[@name='country']"));
	   	Select select = new Select(element);
	   	select.selectByVisibleText("INDIA");
	   	
	   	d.findElement(By.xpath("//input[@id='email']")).sendKeys("rumreddy");
	   	d.findElement(By.xpath("//input[@name='password']")).sendKeys("rumreddy");
	   	d.findElement(By.name("confirmPassword")).sendKeys("rumreddy");
	   	d.findElement(By.name("submit")).click();
	}
	   	
	@Then("User successfully Registered in guru99")
	public void user_successfully_registered_in_guru99() {
	    WebElement element1 = d.findElement(By.xpath(" //font[contains(text(),'Thank you for registering.')]"));
	    System.out.println(element1);
	    d.close();
	}
	
}
