package StepDefPackage;

import PageObjectPackage.SportsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefSports {
    SportsPage sportsPage=new SportsPage();
    @When("^user navigate to sports option$")
    public void user_navigate_to_sports_option() throws Throwable {
    sportsPage.sports();
    }

    @When("^user click on cricket$")
    public void user_click_on_cricket() throws Throwable {

    }

    @Then("^user find the right deal for cricket sports$")
    public void user_find_the_right_deal_for_cricket_sports() throws Throwable {

    }

}
