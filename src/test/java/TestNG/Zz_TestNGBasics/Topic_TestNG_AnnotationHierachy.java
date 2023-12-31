package TestNG.Zz_TestNGBasics;

import org.testng.annotations.*;

/*
 
@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass
@AfterTest
@AfterSuite
 
 */


public class Topic_TestNG_AnnotationHierachy {

	@Test
    public void first ()
    {
       System.out.println("From first test annotated in AnnotationsTest....");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("From BeforeMethod annotation in AnnotationsTest....");
    }

    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("From AfterMethod annotation in AnnotationsTest....");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("From BeforeClass annotation test in AnnotationsTest class....");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("From AfterClass annotation test in AnnotationsTest class....");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("From AfterTest annotation in AnnotationsTest class ....");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("From AfterSuite annotation in AnnotationsTest class ....");
    }


}
