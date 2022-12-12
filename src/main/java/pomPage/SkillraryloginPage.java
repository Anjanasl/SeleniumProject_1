package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryloginPage {
	
   @FindBy(xpath="//a[text()=' GEARS ']")
   private WebElement gears;
   
   @FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
   private WebElement demoapp;
   
   @FindBy(name="q")
   private WebElement searchtxtbox;
   
   @FindBy(xpath="//input[@type='submit']")
   private WebElement searchbtn;
   
   public SkillraryloginPage(WebDriver driver)
   {
	  PageFactory.initElements(driver, this); 
   }
   
   public void gears()
   {
	   	gears.click();
   }
   public void demoapp()
   {
	   demoapp.click();
   }
   
   public void searchbox(String Searchtext)
   {
	 searchtxtbox.sendKeys(Searchtext);  
   }
   
   public void searchbutton() 
   {
	  searchbtn.click(); 
   }
}
