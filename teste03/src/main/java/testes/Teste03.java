package testes;

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

public class Teste03 {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	 public void teste03() {
	    driver.get("https://opentdb.com/");
	    driver.manage().window().setSize(new Dimension(1062, 812));
	    driver.findElement(By.cssSelector(".btn:nth-child(5)")).click();
	    driver.findElement(By.cssSelector(".alert")).click();
	    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("ERROR! You must be logged in to submit a trivia question."));
	}
}
