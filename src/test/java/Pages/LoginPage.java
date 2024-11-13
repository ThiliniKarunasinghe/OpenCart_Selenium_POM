package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);	
	}
	

	@FindBy(xpath="//input[@id='input-email']") 
	WebElement set_EMail;

	@FindBy(xpath="//input[@id='input-password']") 
	WebElement set_PW;
	
	@FindBy(xpath="//input[@value='Login']") 
	WebElement clickLogin;



	public void setEmail(String email) {
		set_EMail.sendKeys(email);

	}

	public void setPW(String pw) {
		set_PW.sendKeys(pw);

	}
	
	public void clickLogin() {
		clickLogin.click();


}


}