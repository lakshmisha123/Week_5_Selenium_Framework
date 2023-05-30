package Page_Object_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Method_1.Wait_For_Element;

public class Login_Page extends Wait_For_Element {
		
		WebDriver driver;
		public Login_Page(WebDriver wd) {
			super(wd);
			//initialization
			this.driver=wd;
			PageFactory.initElements(driver, this);
		}
		//Login Locator
		By User= By.xpath("//*[@name='txtUsername']");
		By Pass= By.xpath("//*[@name='txtPassword']");
		By Login = By.xpath("//*[@type='submit']");
		
		
		public void loginApplication(String name, String password) {
			wait_For_Element_ToAppear_And_sendkeys(User, name);
			wait_For_Element_ToAppear_And_sendkeys(Pass, password);
			wait_For_Element_ToAppear_And_Click(Login);
		}
	
			
	}


