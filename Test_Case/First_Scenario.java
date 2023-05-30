package Test_Case;
import java.io.IOException;
import org.testng.annotations.Test;
import Page_Object_Model.Logout_Page;
import Page_Object_Model.Login_Page;
import Page_Object_Model.User_Add;
import TestComponent.Login_Test;
public class First_Scenario extends Login_Test {

	@Test(enabled=true, priority=0) 
	public void Adding_New_User_In_Addmin_Section() throws InterruptedException, IOException {
			
		login();	//launching Browser and login With Valid Admin Credentials
		
		//Navigating to User Add Page from home page
		User_Add HrAdministration = new User_Add(driver);	//Admin Section Object
		HrAdministration.HRAdmin();		//calling Admin Function
		HrAdministration.UserDetails("a", "Aavinasha", "1234Avi#", "1234Avi#");		//User details for Adding User
		
		//Logout page
		Logout_Page Object_For_Logout_Page = new Logout_Page(driver);	//Logout Object Creation
		Object_For_Logout_Page.logoutApplication();		//calling Logout Function
		
		//Login With Added User
		Login_Page Object_For_Login_Page = new Login_Page(driver);	//Login Object creation For Login With New Added User
		Object_For_Login_Page.loginApplication("Aavinasha","1234Avi#");//Login Details Of Newly Added User
		HrAdministration.Verifying();	// Verifying UserName added
	    
		// Deleting Added User
		Object_For_Logout_Page.logoutApplication();	//calling Logout Function to Logout From The Added User Section
		login();	//Again Logging In With Admin User To Initiate The Delete of The Added User
		HrAdministration.DeleteUser(); 	//Calling Deleting Function Of newly added user
		Object_For_Logout_Page.logoutApplication();	//logout after The Deleting Added User
		
	}
}

