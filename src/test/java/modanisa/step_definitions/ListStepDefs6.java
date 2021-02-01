package modanisa.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import modanisa.pages.SearchPage;
import modanisa.utilities.BrowserUtils;
import modanisa.utilities.ConfigurationReader;
import modanisa.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ListStepDefs6 {
    @Given("The user is on the search page with the rest for a while and drink water item in ToDo list")
    public void the_user_is_on_the_search_page_with_the_rest_for_a_while_and_drink_water_item_in_ToDo_list() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        new SearchPage().textBox.click();
        new SearchPage().textBox.sendKeys("rest for a while");
        new SearchPage().textBox.sendKeys(Keys.ENTER);


       new SearchPage().textBox.click();
       new SearchPage().textBox.sendKeys("drink water");
       new SearchPage().textBox.sendKeys(Keys.ENTER);

        BrowserUtils.waitForVisibility(new SearchPage().itemInTheList,10);
        String expected = "rest for a while";
        String actual = new SearchPage().itemInTheList.getText();

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected,actual);

        BrowserUtils.waitForVisibility(new SearchPage().itemInTheList2,10);
        String expected2 = "drink water";
        String actual2 = new SearchPage().itemInTheList2.getText();

        System.out.println(expected2);
        System.out.println(actual2);

        Assert.assertEquals(expected2,actual2);

    }


    @Then("The user should see drink water item in ToDo list")
    public void the_user_should_see_drink_water_item_in_ToDo_list() {

        String expectedresult = "drink water";
        String actualresult = new SearchPage().itemInTheList.getText();

        System.out.println(expectedresult);
        System.out.println(actualresult);
        Assert.assertEquals(expectedresult,actualresult);

    }
}
