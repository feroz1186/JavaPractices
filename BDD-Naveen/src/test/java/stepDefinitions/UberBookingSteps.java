package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	@Given("User wants to select a car type as {string} from uber app")
	public void user_wants_to_select_a_car_type_as_from_uber_app(String carType) {
	    System.out.println("step1 : "+carType);
	}

	@When("User select a car type as {string} and pickuppoint is {string} and drop at {string}")
	public void user_select_a_car_type_as_and_pickuppoint_is_and_drop_at(String carType, String pickuppoint, String droppingpoint) {
		System.out.println("step2 : "+carType+" "+pickuppoint+" "+droppingpoint);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("step4");
	}

	@Then("User pays {int} USD to driver")
	public void user_pays_usd_to_driver(Integer fee) {
		System.out.println("step5 amount is : "+fee);
	}


}
