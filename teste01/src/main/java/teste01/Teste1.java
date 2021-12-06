package teste01;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Teste1 {
	private WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void untitled() {
		driver.get("https://opentdb.com/");
		driver.manage().window().setSize(new Dimension(1057, 811));
		driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
		driver.findElement(By.id("query")).click();
		driver.findElement(By.id("query")).sendKeys("Science: Computers");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.cssSelector(".alert")).click();
		assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("No questions found."));
	}
}
