package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage {

    @FindBy(xpath="//button[@data-cy='list-options']")
    //list actions
    public WebElement cursorpointBtn;
    @FindBy(xpath="//div[@data-cy='delete-list']")
    //Delete list icon
    public WebElement cursordeleteList;

    public DeletePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void dodeleteList(){
        cursorpointBtn.click();
        cursordeleteList.click();


    }





}
