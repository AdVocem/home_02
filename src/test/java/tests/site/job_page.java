package tests.site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class job_page {

    public static void searchJob(WebDriver driver, String searchString) {
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Я ищу…']"));
        element.sendKeys(searchString);
        element.submit();
    }
}
