package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardPage {

    @FindBy(xpath = "//input[@placeholder='Enter list title...']")
    //Enter List Title
    public WebElement txtTitle;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement txtBoard;

    public BoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void docreateBoard(String boardname) {
        txtBoard.sendKeys(boardname);
        txtBoard.sendKeys(Keys.ENTER);
    }


}
