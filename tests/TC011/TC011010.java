import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TC011010Test {
    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void tC011010() {
        driver.get("https://school.moodledemo.net/");
        driver.manage().window().setSize(new Dimension(1800, 1125));
        driver.findElement(By.linkText("Đăng nhập")).click();
        driver.findElement(By.cssSelector(".login-container")).click();
        driver.findElement(By.id("password")).sendKeys("moodle");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#course-info-container-72-3 .multiline")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".modtype_page .aalink"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.linkText("Summative assignment")).click();
        js.executeScript("window.scrollTo(0,0)");
        driver.findElement(By.linkText("View all submissions")).click();
        driver.findElement(By.cssSelector("#mod_assign_grading-1859_r2_c5 > .btn")).click();
        driver.findElement(By.id("id_grade")).click();
        driver.findElement(By.id("id_grade")).sendKeys("17");
        driver.findElement(By.name("savechanges")).click();
        {
            WebElement element = driver.findElement(By.linkText("Assignment: Summative assignment"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.linkText("View all submissions")).click();
        driver.findElement(By.cssSelector("#mod_assign_grading-1859_r2_c5 > .btn")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".tox-mbtn:nth-child(3)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".fullwidth")).click();
        driver.findElement(By.id("id_grade")).sendKeys(" ");
        driver.findElement(By.name("savechanges")).click();
        {
            WebElement element = driver.findElement(By.id("yui_3_18_1_1_1702221962770_78"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.id("page-mod-assign-grader")).click();
        driver.findElement(By.cssSelector(".toast-message")).click();
        driver.findElement(By.linkText("View all submissions")).click();
        driver.findElement(By.id("user-menu-toggle")).click();
        driver.findElement(By.linkText("Log out")).click();
        {
            WebElement element = driver.findElement(By.linkText("Choose a role »"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
    }
}
