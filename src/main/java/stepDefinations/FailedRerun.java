package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"@target/failedrerun.txt"},
		glue= {"stepDefinations","Guru9"},
		
		dryRun=false,// need to check on that
		monochrome=true,
		
		plugin= {"pretty", "rerun:target/failedrerun.txt"}
		
		)
	
	
	public class FailedRerun {
		
		
}
