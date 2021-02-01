package modanisa.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modanisa.pages.SearchPage;
import modanisa.utilities.BrowserUtils;
import org.junit.Assert;

public class ListStepDefs3 {
    @Given("The user is on the main page with the items in ToDo list")
    public void the_user_is_on_the_main_page_with_the_items_in_ToDo_list() {

        BrowserUtils.waitForVisibility(new SearchPage().itemInTheList,10);
        String expected = "buy some milk";
        String actual = new SearchPage().itemInTheList.getText();

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected,actual);

        BrowserUtils.waitForVisibility(new SearchPage().itemInTheList2,10);
        String expected2 = "enjoy the assignment";
        String actual2 = new SearchPage().itemInTheList2.getText();

        System.out.println(expected2);
        System.out.println(actual2);

        Assert.assertEquals(expected2,actual2);
    }


    @When("The user clicks on buy some milk text")
    public void the_user_clicks_on_buy_some_milk_text() {

        //BrowserUtils.waitForClickability(new SearchPage().mark,10);
        new SearchPage().mark.click();



    }
    @Then("The user should see buy some milk item as marked")
    public void the_user_should_see_buy_some_milk_item_as_marked() {
        //BrowserUtils.waitForVisibility(new SearchPage().mark,10);
        Assert.assertTrue(new SearchPage().mark.isSelected());

        System.out.println(new SearchPage().mark.isSelected());
    }
}
