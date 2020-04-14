import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\JP NAUDIYAL\\Downloads\\latest webdriver gecko\\geckodriver-v0.26.0-win64 (1)\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");

	}

	@Test
	public void doLogin() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));
		username.sendKeys("naudiyalhimanshu@gmail.com");
		WebElement next = driver.findElement(By.xpath("//div[@class='qhFLie']"));
		next.click();
		Thread.sleep(10000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("noidaklassic@601");

		// div[@id='passwordNext']//div[@class='ZFr60d CeoRYc']

		WebElement Next2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		Next2.click();
		driver.findElement(By.xpath("sign_in")).click();

	}

	@AfterSuite

	public void tearDown() {
		driver.quit();
	}

}
