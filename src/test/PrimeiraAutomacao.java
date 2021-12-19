package treinamento;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraAutomacao {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4");
		driver.manage().window().maximize();

		driver.findElement(By.name("customerName")).sendKeys("");
		driver.findElement(By.name("customerName")).sendKeys("David");

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {

	}

}
