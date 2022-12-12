package scripting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPage.CoreJava;
import pomPage.SkillraryloginPage;
import pomPage.WishlistPage;

public class Testcase3 extends BaseClass{
	
	@Test
	
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryloginPage sp=new SkillraryloginPage(driver);
		sp.searchbox(pdata.getdata("Serachtext"));
		sp.searchbutton();
		
		CoreJava cj=new CoreJava(driver);
		cj.corelink();
		
		//driverutilities.switchtoframe(driver);
		
	//WishlistPage wp=new WishlistPage(driver);
	//wp.play();
	//Thread.sleep(3000);
	//wp.pause();
	
	//driverutilities.switchbackframe(driver);
	//wp.wishlist();
		
	
		
	}

}
