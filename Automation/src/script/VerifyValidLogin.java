package script;

import org.testng.annotations.Test;

public class VerifyValidLogin {
	@Test
	public void testVerifyValidLogin(){
	//Enter valid un
	Loginpage l = new Loginpage(driver);
	l.setUserName("admin");
	//Enter valid pw
	l.setPassword("manager");
	//click login button
	l.ClickloginButton();
	//verify the home page is displayed 
	EnterTimeTrackpage e = new EnterTimeTrack(driver);
	e.verifyTitle("actiTime - Enter Time Track");
	//click logout
	e.clickLogout();
	//verify login page is displayed
	l.verifyTitle("actiTime- Login");
}
}
