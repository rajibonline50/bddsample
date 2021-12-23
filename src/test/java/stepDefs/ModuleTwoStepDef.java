package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class ModuleTwoStepDef {
	
	@Before(order=1, value="@RegressionTest")
	public void initChrome() {
		System.out.println("init Chrome");
	}
	
	/*
	 * @Before(order=1) public void readFromFile() {
	 * System.out.println("Read from Property File"); }
	 */
	
	@Before(order=2, value="@RegressionTest")
	public void setDB() {
		System.out.println("Configure DB One");
	}
	
	
	@Before(order=1, value="@SmokeTest")
	public void initEdge() {
		System.out.println("init Edge"); 
	 }

	//@Before("@SmokeTest , RegressionTest")
	
	@Before(order=1, value="@SmokeTest")
	public void setDBTwo() {
		System.out.println("Configure DB Two");
	}
	


	@When("User create a new Tasks")
	public void user_create_a_new_tasks() {
		System.out.println("User create a new Tasks");
	}

	@When("User view Tasks details")
	public void user_view_tasks_details() {
		 System.out.println("User view Tasks details");
	}

	@When("User update a Tasks details")
	public void user_update_a_tasks_details() {
		System.out.println("User update a Tasks details");
	}
	
	@After
	public void closeDB() {
		System.out.println("Close DB");
	}
}
