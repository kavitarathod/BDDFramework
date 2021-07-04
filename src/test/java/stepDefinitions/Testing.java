package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Testing {
	
		
	       @Given("testing1")
	       public void givenStatment(){
	              System.out.println("Testing 1");
	       }
	       
	       @When("testing2")
	       public void whenStatement(){
	              System.out.println("Testing 2");
	       }
	       
	       @Then("testing3")
	       public void thenStatment(){
	              System.out.println("Testing 3");
	       }
	}




