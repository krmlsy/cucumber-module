package setDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implement.Belly;

import org.junit.Assert;

public class Test_Steps {


    private Belly belly;
    private int waitingTime;



    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes) throws Throwable {
         belly = new Belly();
         belly.eat(cukes);
    }
    
    @Given("^I have (\\d+) cukes in my kelly$")
    public void i_have_cukes_in_my_kelly(int cukes) throws Throwable {
    	   Assert.assertEquals(21,cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int wt) throws Throwable {
        this.waitingTime=wt;
    }



    @Then("^My belly should be:(\\S*)$")
    public void myBellyShouldBeSound(String expectedSound) throws Throwable {
        String actualSound = belly.getSound(waitingTime);
        Assert.assertEquals(expectedSound,actualSound);
    }
}
