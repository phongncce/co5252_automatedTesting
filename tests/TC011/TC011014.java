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

public class TC011014Test {
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
    public void tC011014() {
        driver.get("https://school.moodledemo.net/");
        driver.manage().window().setSize(new Dimension(1800, 1125));
        driver.findElement(By.linkText("Đăng nhập")).click();
        driver.findElement(By.cssSelector(".login-wrapper")).click();
        driver.findElement(By.id("password")).sendKeys("moodle");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#course-info-container-72-3 .multiline")).click();
        js.executeScript("window.scrollTo(0,424)");
        driver.findElement(By.linkText("Summative assignment")).click();
        driver.findElement(By.linkText("View all submissions")).click();
        driver.findElement(By.cssSelector("#mod_assign_grading-1859_r1_c5 > .btn")).click();
        driver.findElement(By.id("id_grade")).click();
        driver.findElement(By.id("id_grade")).sendKeys("114.38");
        driver.findElement(By.name("savechanges")).click();
        driver.findElement(By.id("id_error_grade")).click();
        driver.findElement(By.name("resetbutton")).click();
        driver.findElement(By.linkText("View all submissions")).click();
        driver.findElement(By.id("user-menu-toggle")).click();
        driver.findElement(By.linkText("Log out")).click();
    }
}
