package TestComponent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Beforetest {
	protected WebDriver driver;
	@BeforeSuite
	public WebDriver Launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		return driver;
	}
	
	

}
