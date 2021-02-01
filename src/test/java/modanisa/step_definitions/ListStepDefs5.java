package modanisa.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modanisa.pages.SearchPage;
import modanisa.utilities.BrowserUtils;
import modanisa.utilities.ConfigurationReader;
import modanisa.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ListStepDefs5 {
    @Given("The user is on the search page with the rest for a while item in ToDo list")
    public void the_user_is_on_the_search_page_with_the_rest_for_a_while_item_in_ToDo_list() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        new SearchPage().textBox.click();
        new SearchPage().textBox.sendKeys("rest for a while");
        new SearchPage().textBox.sendKeys(Keys.ENTER);

        BrowserUtils.waitForVisibility(new SearchPage().itemInTheList,10);
        String expected = "rest for a while";
        String actual = new SearchPage().itemInTheList.getText();

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected,actual);
    }


    @When("The user clicks on delete button next to rest for a while item")
    public void the_user_clicks_on_delete_button_next_to_rest_for_a_while_item() {

        Actions actions = new Actions(Driver.get());

        actions.moveToElement(new SearchPage().itemInTheList).perform();

        BrowserUtils.waitForVisibility(new SearchPage().delete,10);
        new SearchPage().delete.click();

    }
    @Then("The list should be empty")
    public void the_list_should_be_empty() {
        String list = "";
        new SearchPage().textBox.getAttribute("value");
        System.out.println(new SearchPage().textBox.getText());
        if(new SearchPage().textBox.getAttribute("value")==list) {
            System.out.println("list is empty");
        } else {
            System.out.println("list is not empty");
        }
        Driver.closeDriver();
    }
}
