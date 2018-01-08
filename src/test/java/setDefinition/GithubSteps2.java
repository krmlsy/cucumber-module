package setDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubSteps2 {

	private WebDriver webdriver;
	private Scenario scenario;
	
	
		@Before
		public void before(Scenario scenario) {
			this.scenario=scenario;
		}
	
	   @Given("Open new (.*) site2$")
	    public void i_have_cukes_in_my_belly(String site) throws Throwable {
	         
		   System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Desktop/Selenium Drivers/chromedriver.exe");
		   webdriver=new ChromeDriver();
		   webdriver.get(site);
		   
	    }
	   
	   @Given("^take new secreenshot2$")
	    public void takeScreenShots() throws Throwable {
	         
		  System.out.println("smile :)");
		  scenario.write("{\"menu\": {\r\n" + 
		  		"  \"id\": \"file\",\r\n" + 
		  		"  \"value\": \"File\",\r\n" + 
		  		"  \"popup\": {\r\n" + 
		  		"    \"menuitem\": [\r\n" + 
		  		"      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n" + 
		  		"      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n" + 
		  		"      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n" + 
		  		"    ]\r\n" + 
		  		"  }\r\n" + 
		  		"}}");
		   
	    }
	   
	   @When("Click Logout$")
	   public void logout(){
		   WebElement button=webdriver.findElement(By.id("logout"));
		   button.click();
	   }
	   
	   @Then("Close it$")
	    public void close() throws Throwable {
	         
		   webdriver.close();
		   
	    }
	   
	   @After
	    public void killBrowser(Scenario scenario){
	        if (scenario.isFailed()) {
	         scenario.embed(((TakesScreenshot)webdriver).getScreenshotAs(OutputType.BYTES), "image/png");
	        }
	        webdriver.close();
	        webdriver.quit();
	    }

	
}
