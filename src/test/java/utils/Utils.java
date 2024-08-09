package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Utils {

    public  static void takeScreenshot(WebDriver driver) throws IOException ,IOException{
        File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String time = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new Date());
        String filewithPath="./src/test/resources/screenshots/"+ time +".png";
        File Destfile= new File(filewithPath);
        FileUtils.copyFile(screenshotFile,Destfile);
    }
    public static void waitForUrl(WebDriver driver, String url, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.urlToBe(url));
    }
}
