package rbp.ui.tests;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class testSetUp {
	
	protected WebDriver driver;
    protected String baseUrl;

    @BeforeMethod
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        baseUrl = "http://localhost:3003/";
        //baseUrl = "http://192.168.99.100:3003/";
    }

    @AfterMethod
    public void TearDown()
    {
        driver.quit();
    }

}
