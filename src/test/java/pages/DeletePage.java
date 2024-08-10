package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Utils;

import javax.rmi.CORBA.Util;

public class DeletePage {
    WebDriver driver;

    public DeletePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getDeleteElement(int index) {
        String xpath = String.format("(//input[@data-cy='list-name'])[%d]/following-sibling::button", index);
        return driver.findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//div[@data-cy='delete-list']")
    //Delete list icon
    public WebElement cursorDeleteList;

    public void doDeleteList(int listNumber, DeletePage deletePage) throws InterruptedException {
        WebElement deleteElement = deletePage.getDeleteElement(listNumber);
        deleteElement.click();
        cursorDeleteList.click();
        Thread.sleep(500);
        boolean isElementPresent;
        try {
            isElementPresent = deleteElement.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            isElementPresent = false;

        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            isElementPresent = false;
        }
        Assert.assertFalse(isElementPresent, "checking element visibility.");
        System.out.println("Successfully deleted the mentioned list");
    }

}
