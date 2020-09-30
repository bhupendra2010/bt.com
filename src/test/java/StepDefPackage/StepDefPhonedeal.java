package StepDefPackage;

import PageObjectPackage.PhoneDealPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefPhonedeal {
    PhoneDealPage dealPage=new PhoneDealPage();
    @When("^user navigate to mobiledeal$")
    public void user_navigate_to_mobiledeal() throws Throwable {
    dealPage.mobile();
    }

    @When("^user find sim only deal$")
    public void user_find_sim_only_deal() throws Throwable {
    dealPage.simonlydeal();
    }

    @Then("^user should select the deal and put it in basket$")
    public void user_should_select_the_deal_and_put_it_in_basket() throws Throwable {

    }

}
