package tests.site;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class results_page {
    public static int countResults(WebDriver driver, String searchString) {
        String rawXPath = "//div[@class='search-result-item__head']/a[";
        String [] result = searchString.split(" ");

        int i = 0;
        do{
            if (i > 0){
                rawXPath += " and ";
            }
            rawXPath += "contains(text(), \""+ result[i] +"\")";
            i++;
        } while (i < result.length);

        rawXPath += "]";

        List<WebElement> elements = driver.findElements(By.xpath(rawXPath));

        return elements.size();
    }


}
