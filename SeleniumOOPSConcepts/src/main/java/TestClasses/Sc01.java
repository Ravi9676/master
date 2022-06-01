package TestClasses;

import OOPSConcepts.BaseClass;
import PageobjectModel.Homepage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sc01 extends BaseClass {
    public  Homepage obj;
    @BeforeClass
    public void beforeclass()
    {
        obj=new Homepage(driver);
    }
    @Test
    public void verifyHomePage(){
            obj.openUrl("https://www.amazon.com");
            obj.clickOnMobileslink();
    }
}
