package Page_Object_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Method_1.Wait_For_Element;

public class Manage_User_Role extends Wait_For_Element{

	WebDriver driver;
	
	public Manage_User_Role (WebDriver wd) {
		
		super(wd);
	
		this.driver=wd;	
		PageFactory.initElements(driver, this);

	}
	By HRAdministration = By.xpath("(//span[contains(text(),'HR Administration')])[1]");
	By Wait =By.xpath("//thead/tr[1]/th[2]");
	By manage_user = By.xpath("//*[contains(text(),'Manage User Roles ')]");
	By Add_User_Role = By.xpath("//i[contains(text(),'add')]");
	By Type = By.xpath("(//*[@type='text'])[2]");
	By User_Role_Name =By.xpath("//*[@id='user_role_name']");
	By Emploer_Action =By.xpath("//*[@for='checkbox_employee_add']");
	By Work_Flow_Management = By.xpath("//*[@for='checkbox_leave']");
	By Save = By.xpath("//*[@form-name='userRoleForm']");
	By Toast_Message = By.xpath("(//*[@id='toast-container'])");
	
	@FindBy(xpath="(//*[@id='toast-container'])")
	WebElement toast_message;
	
	By Deleting_DropDown = By.xpath("(//*[@class='material-icons icons-color'])");
	By Deleting_select_All = By.xpath("(//*[@id='listdirective-options-dropdown-select-all'])");
	By Deleting_AllDropdown = By.xpath("(//*[@class='material-icons icons-color orange-text'])");
	By Deleting_DeleteAll = By.xpath("(//*[contains(text(),'Delete Selected')])");
	By Deleting_ConfirmDelete = By.xpath("(//*[contains(text(),'Yes, Delete')])");

public void HRAdmin_Manage_User_Role(String avi) throws InterruptedException {
	
	wait_For_Element_ToAppear_And_Click(HRAdministration);
	waitForElementToAppear(Wait);

	wait_For_Element_ToAppear_And_Click(manage_user);
	wait_For_Element_ToAppear_And_Click(Add_User_Role);
	wait_For_Element_ToAppear_And_sendkeys(User_Role_Name, avi);
	wait_For_Element_ToAppear_And_Click(Emploer_Action);
	wait_For_Element_ToAppear_And_Click(Work_Flow_Management);
	wait_For_Element_ToAppear_And_Click(Save);
	waitForElementToAppear(Toast_Message);
	String h=toast_message.getText();
	
	if (h.equals("Successfully Saved")) {
		
		System.out.print("Condition passed\t"+h);
	}else {
		System.out.print("Conditon Not Passed"+h);
	}
	wait_For_Element_ToAppear_And_Click(Deleting_DropDown);
	wait_For_Element_ToAppear_And_Click(Deleting_select_All);
	wait_For_Element_ToAppear_And_Click(Deleting_AllDropdown);
	wait_For_Element_ToAppear_And_Click(Deleting_DeleteAll);
	wait_For_Element_ToAppear_And_Click(Deleting_ConfirmDelete);
	
}	
}
