package fabelio.bdd.FabelioBdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TwoArraysFunctionTest {

	TwoArraysFunction function = null;
	int[] outputFunction;
	
	@Given("Execute Two Arrays Output")
	public void execute_two_arrays_output() {
		function = new TwoArraysFunction();
	}

	@When("input parameters are two array")
	public void input_parameters_are_two_array() {
		int[] array1 = new int[] {1,2,3,4,5};
		int[] array2 = new int[] {1,3,5,7,9};
		outputFunction = function.outputFromTwoArrays(array1, array2);
	}

	@Then("user should have correct output")
	public void user_should_have_correct_output() {
		int[] expectedOutput = new int[] {1,3};
		Assert.assertArrayEquals(expectedOutput, outputFunction);
	}
	

}

