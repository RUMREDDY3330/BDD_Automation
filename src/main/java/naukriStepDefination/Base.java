package naukriStepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	
	WebDriver d;
	@BeforeClass
	public void Browser() {
	   WebDriverManager.chromedriver().setup();
	   d = new ChromeDriver();
	   d.manage().window().maximize();
	   d.navigate().to("https://www.naukri.com");
	   d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   d.findElement(By.className("Login")).click();
}
}
