package modanisa.pages;

import modanisa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
    public SearchPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "/html/body/section/section/ul/li/div/label")
    public WebElement itemInTheList;

    @FindBy(xpath = "/html/body/section/section/ul/li[2]/div/label")
    public WebElement itemInTheList2;

    @FindBy(xpath = "/html/body/section/section/ul/li[1]/div/input")
    public WebElement mark;

    @FindBy(className = "destroy")
    public WebElement delete;
}
