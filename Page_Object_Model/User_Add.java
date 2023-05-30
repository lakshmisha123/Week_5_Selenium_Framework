package Page_Object_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Method_1.Wait_For_Element;
public class User_Add extends Wait_For_Element{
		
		WebDriver driver;
		public User_Add (WebDriver wd) {
			super(wd);
			this.driver=wd;	
			PageFactory.initElements(driver, this);
		} 
		@FindBy(xpath="//*[@class='name']")
		WebElement name;
		
		By HRAdministration = By.xpath("(//span[contains(text(),'HR Administration')])[1]");
		By usernameforwait = By.xpath("//*[contains(text(),'Username ')]");
		By addUser = By.xpath("//i[contains(text(),'add')]");
		
		By eName = By.xpath("//*[@id='selectedEmployee_value']");
		By selectEname = By.xpath("(//*[@class='angucomplete-title'])[1]");
		By Username = By.xpath("//*[@id='user_name']");
		By SelectRole = By.xpath("(//*[contains(text(),'arrow_drop_down')])[4]");
		By SelectRoleName = By.xpath("(//*[contains(text(),'Global Admin')])[5]");//(//*[contains(text(),'Asset Manager')])[2]
		By Password = By.xpath("//*[@id='password']");
		By ConfirmPassword = By.xpath("//*[@id='confirmpassword']");
		
		By Save = By.xpath("//*[@id='modal-save-button']");
		By Saveuser = By.xpath("(//*[@class='btn btn-secondary'])");
		
		By Name = By.xpath("//*[@class='name']");
		
		By DropDown = By.xpath("//*[contains(text(),'more_horiz')]");
		By SelectAll = By.xpath("//*[@id='systemUserDiv']//tr[1]//td[1]");
		By DeleteSelected = By.xpath("//*[contains(text(),'Delete Selected')]");
		By Yes = By.xpath("//*[contains(text(),'Yes, Delete')]");
		
		
		public void HRAdmin() {
			
			wait_For_Element_ToAppear_And_Click(HRAdministration);
			waitForElementToAppear(usernameforwait);
			wait_For_Element_ToAppear_And_Click(addUser);
		}	
			
		public void UserDetails(String EmployeName,String userName,String PassWord,String confirmPassWord) throws InterruptedException {

			wait_For_Element_ToAppear_And_sendkeys(eName, EmployeName);
			
			wait_For_Element_ToAppear_And_Click(selectEname);
			
			wait_For_Element_ToAppear_And_sendkeys(Username, userName);
			
			wait_For_Element_ToAppear_And_Click(SelectRole);
			
			wait_For_Element_ToAppear_And_Click(SelectRoleName);
			
			wait_For_Element_ToAppear_And_sendkeys(Password, PassWord);
			
			wait_For_Element_ToAppear_And_sendkeys(ConfirmPassword, confirmPassWord);
			wait_For_Element_ToAppear_And_Click(Save);
			Thread.sleep(2000);
			//wait_For_Element_ToAppear_And_Click(Saveuser);
		}
		
		public void Verifying() {
			waitForElementToAppear(Name);
			String a = name.getText();
			System.out.print(a);
		    String b = "Aaliyah Haq";
		    if(a.equals(b)) {
		    	System.out.print("\t"+true+"\t");
		    }else {
		    	System.out.print("\t"+false+"\t");
		    }    
		}
		
		public void DeleteUser() {
			wait_For_Element_ToAppear_And_Click(HRAdministration);
			
			waitForElementToAppear(usernameforwait);
			
			wait_For_Element_ToAppear_And_Click(SelectAll);
			
			wait_For_Element_ToAppear_And_Click(DropDown);
			
			wait_For_Element_ToAppear_And_Click(DeleteSelected);
			
			wait_For_Element_ToAppear_And_Click(Yes);
			
		}
		
	}
