package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
@FindBy(xpath="//button[@aria-label='Play']")
private WebElement playbtn;

@FindBy(xpath="//button[@aria-label='Pause']")
private WebElement pausebtn;

@FindBy(xpath="//span[text()='Add To Wishlist']")
private WebElement addtowhishlist;

public WishlistPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void play() {
	playbtn.click();
}
public void pause() {
	pausebtn.click();
}
public void wishlist() {
	addtowhishlist.click();
}


}
