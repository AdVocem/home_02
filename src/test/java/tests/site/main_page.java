package tests.site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class main_page {

    public static void openJobSection(WebDriver driver, String section) {
        String rawXPath = String.format("//div[@id='mainmenu']//a[@title='%s']", section);
        driver.findElement(By.xpath(rawXPath)).click();
    }

    public static void open(WebDriver driver, String baseUrl) {
        driver.get(baseUrl);
    }


}
