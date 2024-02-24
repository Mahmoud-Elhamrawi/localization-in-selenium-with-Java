package testCases;

import Data.jsonDataReader;
import Pages.P01_searchPage;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TC01_searchTest extends TestBase{

   P01_searchPage searchPage ;

    @Test
    public void testSearch() throws IOException, ParseException, InterruptedException {
        jsonDataReader jsonDataReader = new jsonDataReader();
        jsonDataReader.jsonReader("DE");
        searchPage = new P01_searchPage(driver);

        searchPage.enterTxtSearch(jsonDataReader.searchWord);

        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(searchPage.UiList())) ;
        Thread.sleep(3000);

       // searchPage.liList().get(1).click();
    }





}
