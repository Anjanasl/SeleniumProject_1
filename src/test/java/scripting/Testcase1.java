package scripting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import genericLib.BaseClass;
import pomPage.AddtoCart;
import pomPage.SkillrarydemologinPage;
import pomPage.SkillraryloginPage;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tcl()
	{
	SkillraryloginPage s1=new SkillraryloginPage(driver);
	s1.gears();
	s1.demoapp();
	driverutilities.switchtabs(driver);
	
	SkillrarydemologinPage s2=new SkillrarydemologinPage(driver);
	driverutilities.mouseover(driver,s2.getCourse());
	s2.seleniumtraining();
	
	AddtoCart as=new AddtoCart(driver);
	driverutilities.doubleclick(driver, as.getPlus());
	as.addtocart();
	driverutilities.alertpopup(driver);
	}

}
