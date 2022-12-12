package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	
	
	@FindBy(id="Selenium Training")
	private WebElement drag;
	
	@FindBy(id="cartArea")
	private WebElement drop;
	
	@FindBy(xpath="(//i[@class='fa fa-twitter'])[2]")
	private WebElement twitter;
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getDrag() {
		return drag;
	}

	public WebElement getDrop() {
		return drop;
	}

	public WebElement getTwitter() {
		return twitter;
	}
	
	public void gtwitter() 
	{
		
	twitter.click();
		
	}

}
