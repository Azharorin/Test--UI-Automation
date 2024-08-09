package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPage {

    @FindBy(xpath = "//div[@data-cy=\"create-list\"]")
    //Create List
    WebElement labelList;
    @FindBy(xpath = "//input[@data-cy=\'add-list-input\']")
    //Add list input (enter List Title)
    WebElement txtlistTitle;
    @FindBy(xpath = "//button[text()='Add list']")
    // Add List Button
    public WebElement listBtn;

    public ListPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void docreateList(String listtitle, String secondlisttitle, WebDriver driver) {

        Actions actions = new Actions(driver);
        txtlistTitle.sendKeys(listtitle);
        listBtn.click();
        // actions.moveToElement(txtlistTitle).perform();
        txtlistTitle.sendKeys(secondlisttitle);
        listBtn.click();

    }


}
