package Test_Case;

import java.io.IOException;
import org.testng.annotations.Test;

import Page_Object_Model.Logout_Page;
import Page_Object_Model.Manage_User_Role;

public class Second_Scenario extends First_Scenario {

	@Test(enabled = true, priority = 0)
	public void Adding_New_User_In_Addmin_Section_Manage_User_Role() throws InterruptedException, IOException {
		login();
		Manage_User_Role c=new Manage_User_Role(driver);
		c.HRAdmin_Manage_User_Role("End to End Tester");
		Logout_Page Object=new Logout_Page(driver);
		Object.logoutApplication();
	}
}
