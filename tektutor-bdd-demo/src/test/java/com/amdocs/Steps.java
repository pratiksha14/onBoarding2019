package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private Hello hello;
	private String actualResponse;

@Given("I have created a hello object")
public void i_have_created_a_hello_object() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	hello = new Hello();
}

@When("I invoke the sayHello method on the hello object")
public void invokeSayHello() {
    // Write code here that turns the phrase above into concrete actions
    actualResponse = hello.sayHello();
	//throw new cucumber.api.PendingException();
}

@Then("I expect the response as {string}")
public void i_expect_the_response_as(String expectedResponse) {
    // Write code here that turns the phrase above into concrete actions
    assertEquals(expectedResponse, actualResponse);
	//throw new cucumber.api.PendingException();
}
	
}
