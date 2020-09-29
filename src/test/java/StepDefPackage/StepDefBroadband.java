package StepDefPackage;

import PageObjectPackage.BroadbandPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefBroadband {
    BroadbandPage broadbandPage=new BroadbandPage();
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    broadbandPage.baseurl();
    }

    @When("^user navigate the broadband section$")
    public void user_navigate_the_broadband_section() throws Throwable {
    broadbandPage.broadband();
    }

    @When("^user find a broadband deal$")
    public void user_find_a_broadband_deal() throws Throwable {
    broadbandPage.selectdeal();
    }

    @Then("^user select the appropriate deal for him$")
    public void user_select_the_appropriate_deal_for_him() throws Throwable {

    }

}
