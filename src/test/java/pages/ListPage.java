package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPage {

    @FindBy(xpath = "//div[@data-cy=\"create-list\"]")
    WebElement labelList;

    ///label clcik board
    @FindBy(css="#board-10")
    WebElement boardlabel;
    @FindBy(xpath = "//input[@data-cy=\'add-list-input\']")
    WebElement txtlistTitle;
    @FindBy(xpath = "//button[text()='Add list']")
    public
    WebElement listBtn;
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
