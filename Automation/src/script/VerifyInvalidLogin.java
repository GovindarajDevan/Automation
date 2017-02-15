package script;

import org.testng.annotations.Test;

public class VerifyInvalidLogin {
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
	//click logoutii
	e.clickLogout();
	//verify login page is displayed
	l.verifyTitle("actiTime- Login");
}
}
