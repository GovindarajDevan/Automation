package script;

public class VerifyVersion extends BaseTest1 {
	@Test
	public void testVerifyVersion()
	{
		// verify that version is actiTime 2016.1
		Loginpage l= new Loginpage(driver);
		l.verifyVersion("actiTime 2016.1");
	}

}
