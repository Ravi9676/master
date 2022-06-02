import org.testng.annotations.*;

public class TestngAnotations {
    @BeforeSuite
    public void before(){

        System.out.println("My name is");
    }
    @BeforeClass
    public  void beforeclass(){

        System.out.println("Navya is intelligent");
    }
    @BeforeMethod
    public  void beforemethod(){
        System.out.println("Navya is intelligent before method");
    }
    @Test
    public  void printName(){
        System.out.println("Navya");
    }

    @Test
    public void printage(){

        System.out.println(28);
    }

    @AfterClass
    public  void afterclass(){

        System.out.println("after class");
    }

    @AfterMethod
    public  void afterMethod(){

        System.out.println("after method");
    }
}
