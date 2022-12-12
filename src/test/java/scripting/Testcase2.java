package scripting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.WebDriverUtilities;
import pomPage.SkillrarydemologinPage;
import pomPage.SkillraryloginPage;
import pomPage.TestingPage;

public class Testcase2 extends BaseClass{
	
     @Test
	public void tc2() throws IOException
	{
    SkillraryloginPage sl=new SkillraryloginPage(driver);
    sl.gears();
    sl.demoapp();
    
        driverutilities.switchtabs(driver);
	
    SkillrarydemologinPage sp=new SkillrarydemologinPage(driver);
    driverutilities.dropdown(sp.getDropdown(),pdata.getdata("dropdownopt"));
    
    TestingPage tp=new TestingPage(driver);
    driverutilities.draganddrop(driver, tp.getDrag(), tp.getDrop());
    
    Point point = tp.getTwitter().getLocation();
    int x = point.getX();
    int y = point.getY();
    driverutilities.scrollbar(driver, x, y);
    tp.gtwitter();
    
	}

}
