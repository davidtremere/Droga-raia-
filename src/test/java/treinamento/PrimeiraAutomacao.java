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

		driver.get("https://www.drogaraia.com.br/customer/account/login/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("davidwallan22@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Tremere21");

		driver.findElement(By.id("send2")).click();

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {

	}

}
