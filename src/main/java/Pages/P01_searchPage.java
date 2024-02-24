package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_searchPage extends pageBase{

    public P01_searchPage(WebDriver driver)
    {
        super(driver);
    }
   private final By searchINp = By.cssSelector("textarea[name=\"q\"]");
    private final  By listSuggest = By.cssSelector("div[id=\"Alh6id\"] ul[jsname=\"bw4e9b\"]");
    private final By lisuggest = By.cssSelector("ul[jsname=\"bw4e9b\"] li[class=\"sbct PZPZlf\"]");





    public void enterTxtSearch(String txt)
    {
        enterTxt(driver.findElement(searchINp), txt);
    }

   public WebElement UiList()
   {
       return driver.findElement(listSuggest);
   }

   public List<WebElement> liList()
   {
       return driver.findElements(lisuggest);
   }





}
