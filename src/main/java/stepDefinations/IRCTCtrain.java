package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTCtrain {

	WebDriver d;
	@Given("User entered the Irctc Home Page")
	public void user_entered_the_irctc_home_page() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.irctc.co.in");
		String title = d.getTitle();
		System.out.println(title);
		
	    
	    
	}

	@When("User Search the train FROM - TO in")
	public void user_search_the_train_from_to_in() {
	    
	    
	}

	@And("User Search future date after 4days and select the sleeper class")
	public void user_search_future_date_after_4days_and_select_the_sleeper_class() {
	    
	    
	}

	@And("User clik on the Find Train and verify the correct train or not")
	public void user_clik_on_the_find_train_and_verify_the_correct_train_or_not() {
	    
	    
	}

	@Then("Disply theDisplay the number of trains available and names")
	public void disply_the_display_the_number_of_trains_available_and_names() {
	    
	    
	}

	@Then("Take a screen shot and close the application")
	public void take_a_screen_shot_and_close_the_application() {
	    
	    
	}

}
