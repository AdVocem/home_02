package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import tests.site.main_page;
import tests.site.job_page;
import tests.site.results_page;

public class job_search {
    protected WebDriver driver;
    private String baseUrl;

    @Parameters({ "searchString", "section" })
    @Test
    public void job_search_test(String searchString, String section) throws Exception {
        main_page.open(driver, baseUrl);
        main_page.openJobSection(driver, section);
        job_page.searchJob(driver, searchString);
        int amount = results_page.countResults(driver, searchString);
        Assert.assertTrue(amount > 0);

    }

    @Parameters({ "baseURL" })
    @BeforeTest(alwaysRun = true)
    public void setUp(String baseURL) throws Exception {
        driver = new ChromeDriver();
        baseUrl = baseURL;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }

}
