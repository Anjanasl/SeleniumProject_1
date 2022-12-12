package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarydemologinPage {
	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement selenumtraining;
	
	@FindBy(name="addresstype")
	private WebElement dropdown;
	
	public SkillrarydemologinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourse() {
		return course;
	}
	
	public void seleniumtraining()
	{
		selenumtraining.click();
	}

	public WebElement getDropdown() {
		return dropdown;
	}
	
	

}
