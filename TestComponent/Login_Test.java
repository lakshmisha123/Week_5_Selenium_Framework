package TestComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Page_Object_Model.Login_Page;

public class Login_Test extends Beforetest {

	public Login_Page login() throws IOException {
		Properties pr = new Properties();				//Creating Object for Reading Properties
		FileInputStream FIS = new FileInputStream(System.getProperty("user.dir")
				+"//src//main//java//pro//global_login.properties");//Calling inPut Reader With Setting .property file Path
		pr.load(FIS);
		String URL = pr.getProperty("url");				//Getting Value for URL From .property file
		String userName = pr.getProperty("username");	//Getting Value for username From .property file
		String Password = pr.getProperty("password");	//Getting Value for password From .property file
		driver.get(URL);								//launch Url
		Login_Page Object_For_Login_Page = new Login_Page(driver);	//creating Object For Login_page
		Object_For_Login_Page.loginApplication(userName,Password);	//Putting username and password From .property file
		return Object_For_Login_Page;
	}
	
}
