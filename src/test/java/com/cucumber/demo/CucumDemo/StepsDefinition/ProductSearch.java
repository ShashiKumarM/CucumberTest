package com.cucumber.demo.CucumDemo.StepsDefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.demo.CucumDemo.DriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSearch extends DriverManager {

    WebDriver driver;

    @Given("^Open firefox and start application$")
    public void open_firefox_and_start_application() {
        openBrowser();

    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String arg1, String arg2) {

    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() {

    }

    @Then("^I logout$")
    public void i_logout() {
        closeBrowser();
    }

}
