package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver);	
	}
	

	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;


	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;

	@FindBy(xpath="//a[normalize-space()='Login']") 
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement searchbar;

	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") 
	WebElement clicksearch;

public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}

public void clickLogin()
{
	lnkLogin.click();
}

public void addSearch(String item)
{
	searchbar.sendKeys(item);
}

public void clickSearch()
{
	clicksearch.click();
}


}
