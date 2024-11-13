package Tests;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.AccountRegistrationPage;
import Pages.HomePage;

public class AccountRegistration extends BaseClass  {

	@Test
	public void account_registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		
		
		AccountRegistrationPage rp=new AccountRegistrationPage(driver);
		
		rp.setFirstName(randomeString());
		rp.setLastName(randomeString());
		rp.setEmail(randomeString()+"@gmail.com");
		rp.setTelephone(randomeNumber());
		rp.setPassword(randomAlphaNumeric());
		rp.setConfirmPassword(randomAlphaNumeric());
		
		rp.setPrivacyPolicy();
		rp.clickContinue();
		
		
   
}
}
