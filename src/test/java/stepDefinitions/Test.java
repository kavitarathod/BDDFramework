package stepDefinitions;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Test {
		
	       @Given("test1")
	       public void givenStatment(){
	              System.out.println("Test 1");
	       }
	       
	       @When("test2")
	       public void whenStatement(){
	              System.out.println("Test 2");
	       }
	       
	       @Then("test3")
	       public void thenStatment(){
	              System.out.println("Test 3");
	       }
	}


