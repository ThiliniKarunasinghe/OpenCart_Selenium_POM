package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='content']/div[3]//img")
	List<WebElement> searchProducts;



	public boolean isProductExist(String productName) {
	    for (WebElement product : searchProducts) {
	        if (product.getAttribute("title").equals(productName)) {
	            return true;  // Product found, return immediately
	        }
	    }
	    return false;  // Product not found after checking all elements
	}

}
