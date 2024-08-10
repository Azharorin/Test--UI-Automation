package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BoardPage;
import pages.DeletePage;
import pages.ListPage;
import setup.Setup;

public class BoardTestRunner extends Setup {

    @Test(priority = 1)
    public void crudeBoard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.docreateBoard("Test_Board");
        // Verify if txtTitle is displayed
        // Access txtTitle via the boardPage instance
        Assert.assertTrue(boardPage.txtTitle.isDisplayed(), "The title is  displayed.");
        ListPage listPage = new ListPage(driver);
        listPage.docreateList("List-1", "List-2", driver);
        Assert.assertTrue(listPage.listBtn.isDisplayed());
        DeletePage deletePage = new DeletePage(driver);
        deletePage.doDeleteList(1,deletePage);

    }

}
