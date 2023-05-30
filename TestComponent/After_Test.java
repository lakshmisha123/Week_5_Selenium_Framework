package TestComponent;
import org.testng.annotations.AfterSuite;

import Test_Case.Second_Scenario;

public class After_Test extends Second_Scenario {
	@AfterSuite
	public void Quit() {
		driver.quit();//Closing chrome Controlled By Sele
	}

}
