package naukriStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditProfile extends Base{
	@Given("user Mouse over the mynaukri and clik on edit button")
	public void user_mouse_over_the_mynaukri_and_clik_on_edit_button() throws InterruptedException {
		d.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view']/div[2]"));
		Actions action = new Actions(d);
	    action.build().perform();
	    d.findElement(By.xpath("//a[@title='Edit Profile']")).click();
	    Thread.sleep(3000);
	}

	@When("User Update the resume")
	public void user_update_the_resume() {
		d.findElement(By.xpath("//input[@id='attachCV']"))
		.sendKeys("C:\\Users\\umamaheswara.reddy\\Downloads\\Resume.docx");
	   
	}

	@And("User Edit the Resume Headlines")
	public void user_edit_the_resume_headlines() {
	   
	}

	@Then("User Successfully complete the update")
	public void user_successfully_complete_the_update() {
	   
	}
	
	}

