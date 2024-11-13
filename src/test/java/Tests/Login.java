package Tests;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;

public class Login extends BaseClass {
	
	
	@Test
	public void login()
	{
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lg=new LoginPage(driver);
		lg.setEmail("testthilik1234@gmail.com");
		lg.setPW("1234");
		lg.clickLogin();

}
}