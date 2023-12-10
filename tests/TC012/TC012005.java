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

public class TC012005Test {
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
    public void tC012005() {
        driver.get("https://school.moodledemo.net/");
        driver.manage().window().setSize(new Dimension(1800, 1125));
        driver.findElement(By.linkText("Đăng nhập")).click();
        driver.findElement(By.cssSelector(".login-wrapper")).click();
        driver.findElement(By.id("password")).sendKeys("moodle");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("My courses")).click();
        driver.findElement(By.cssSelector("#course-info-container-72-3 .multiline")).click();
        driver.findElement(By.cssSelector("#module-1181 .aalink")).click();
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.id("id_duedate_day")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_duedate_day"));
            dropdown.findElement(By.xpath("//option[. = '25']")).click();
        }
        driver.findElement(By.id("id_duedate_month")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_duedate_month"));
            dropdown.findElement(By.xpath("//option[. = 'November']")).click();
        }
        driver.findElement(By.id("id_duedate_year")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_duedate_year"));
            dropdown.findElement(By.xpath("//option[. = '2023']")).click();
        }
        driver.findElement(By.id("id_submitbutton2")).click();
        driver.findElement(By.cssSelector("#module-1181 .aalink")).click();
        driver.findElement(By.linkText("View all submissions")).click();
        driver.findElement(By.id("action-menu-toggle-1")).click();
        driver.findElement(By.linkText("Grant extension")).click();
        driver.findElement(By.id("id_extensionduedate_day")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_extensionduedate_day"));
            dropdown.findElement(By.xpath("//option[. = '30']")).click();
        }
        driver.findElement(By.id("id_extensionduedate_month")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_extensionduedate_month"));
            dropdown.findElement(By.xpath("//option[. = 'November']")).click();
        }
        driver.findElement(By.id("id_extensionduedate_year")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_extensionduedate_year"));
            dropdown.findElement(By.xpath("//option[. = '2023']")).click();
        }
        driver.findElement(By.id("id_cancel")).click();
        driver.findElement(By.id("mod_assign_grading-1859_r0_c4")).click();
        driver.findElement(By.id("mod_assign_grading-1859_r0_c4")).click();
        {
            WebElement element = driver.findElement(By.id("mod_assign_grading-1859_r0_c4"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.cssSelector(".avatar > .userpicture")).click();
        driver.findElement(By.linkText("Log out")).click();
        driver.close();
    }
}
