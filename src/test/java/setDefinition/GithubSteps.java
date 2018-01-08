package setDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class GithubSteps {

	WebDriver webdriver;
	
	   @Given("Open (.*) site$")
	    public void i_have_cukes_in_my_belly(String site) throws Throwable {
	         
		   System.setProperty("webdriver.chrome.driver", "/bin/drivers/chromeDriver/chromedriver.exe");
		   webdriver=new ChromeDriver();
		   webdriver.get("site");
		   
	    }
	   
	   @Given("take secreenshot$")
	    public void takeScreenShots() throws Throwable {
	         
		  System.out.println("smile :)");
		   
	    }
	
}
