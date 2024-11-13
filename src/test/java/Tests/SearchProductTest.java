package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Pages.SearchPage;

public class SearchProductTest extends BaseClass{
	
	@Test
	public void searchProduct()
	{
		HomePage hp=new HomePage(driver);
		hp.addSearch("mac");
		hp.clickSearch();
		
		
		
		SearchPage sp=new SearchPage(driver);
		
		sp.isProductExist("MacBook");
		Assert.assertEquals(sp.isProductExist("MacBook"),true);
		
		
		
   
}

}
