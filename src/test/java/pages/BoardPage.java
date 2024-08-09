package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BoardPage {
    @FindBy(xpath = "//h1[text()=' Create new board ']")
    //Create new board
    WebElement labelBoard;
    @FindBy(xpath = "//input[@placeholder='Add board title']")
   //Add Board Title
    WebElement txtBoardtitle;
    @FindBy(xpath = "//button[text()='Create board']")
   //Create Board Button
    WebElement createBtn;
    @FindBy(xpath="//input[@placeholder='Enter list title...']")
    //Enter List Title
    public WebElement txtTitle;
    public BoardPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void docreateBoard(String boardname) {
        labelBoard.click();
        txtBoardtitle.sendKeys(boardname);
        createBtn.click();
    }


}
