package modanisa.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modanisa.pages.SearchPage;
import modanisa.utilities.Driver;
import org.junit.Assert;

public class ListStepDefs4 {
    @Given("The user is on the main page with the item marked in ToDo list")
    public void the_user_is_on_the_main_page_with_the_item_marked_in_ToDo_list() {

        Assert.assertTrue(new SearchPage().mark.isSelected());
        System.out.println(new SearchPage().mark.isSelected());

    }

    @When("The user clicks on text")
    public void the_user_clicks_on_text() {

        new SearchPage().mark.click();


    }
    @Then("The user sould see mark of item should be cleared as buy some milk")
    public void the_user_sould_see_mark_of_item_should_be_cleared_as_buy_some_milk() {

        Assert.assertFalse(new SearchPage().mark.isSelected());
        System.out.println(new SearchPage().mark.isSelected());

        Driver.closeDriver();
    }

}
