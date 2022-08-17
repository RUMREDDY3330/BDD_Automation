package stepDefinations;


import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src\\test\\java\\Features\\Naukri.feature"},
        glue={"naukriStepDefination"},
        		//, "StepGuruRegistration"},
        //tags={"not @Smoke"}
        dryRun=false,
       monochrome=true,
        plugin= {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        
        //cucumber opetion
        
        //plugin= {"pretty", "html:target/cucumber-report.html"}
      // plugin= {"pretty", "junit:target/cucumber-report/Cucumber.xml"}
       //plugin= {"pretty", "junit:target/Cucumber.xml"}
      // plugin= { "pretty", "json:target/cucumber-reports/Cucumber.json" } 
       // plugin= {"pretty", "rerun:target/failedrerun.txt"}
      // plugin={"pretty", "rerun:target/failedrerun.txt", "html:target/cucumber-report.html"} 
		)

 

public class Testrunner {
 
}
