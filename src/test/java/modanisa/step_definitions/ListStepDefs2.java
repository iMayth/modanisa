package modanisa.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modanisa.pages.SearchPage;
import modanisa.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ListStepDefs2 {
    @Given("The user is on the main page with the item in ToDo list")
    public void the_user_is_on_the_main_page_with_the_item_in_ToDo_list() {
        BrowserUtils.waitForVisibility(new SearchPage().itemInTheList,10);
        String expected = "buy some milk";
        String actual = new SearchPage().itemInTheList.getText();

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected,actual);
    }

    @When("The user writes enjoy the assignment to text box and click to add button")
    public void the_user_writes_enjoy_the_assignment_to_text_box_and_click_to_add_button() {
        BrowserUtils.waitForClickability(new SearchPage().textBox,10);
        new SearchPage().textBox.click();
        new SearchPage().textBox.sendKeys("enjoy the assignment");
        new SearchPage().textBox.sendKeys(Keys.ENTER);


    }
    @Then("The user should see enjoy the assignment inserted to ToDo list below buy some milk")
    public void the_user_should_see_enjoy_the_assignment_inserted_to_ToDo_list_below_buy_some_milk() {

        BrowserUtils.waitForVisibility(new SearchPage().itemInTheList2,10);
        String expected = "enjoy the assignment";
        String actual = new SearchPage().itemInTheList2.getText();

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected,actual);
    }
}
