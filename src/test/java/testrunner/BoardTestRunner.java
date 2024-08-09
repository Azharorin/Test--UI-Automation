package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BoardPage;
import pages.ListPage;
import setup.Setup;

public class BoardTestRunner extends Setup {

    @Test(priority = 1)
    public void crudeBoard() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.docreateBoard("Test_Board");
        // Verify if txtTitle is displayed
        // Access txtTitle via the boardPage instance
        Assert.assertTrue(boardPage.txtTitle.isDisplayed(), "The title is  displayed.");
        ListPage listPage = new ListPage(driver);
        listPage.docreateList("test", "hshhshs", driver);
        Assert.assertTrue(listPage.listBtn.isDisplayed());


    }

}
