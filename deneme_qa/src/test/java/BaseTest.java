import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    //Translate translate;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //driver = new ChromeDriver();
        System.out.println("Test initiated.");
        //translate = new Translate(driver);
    }

    @BeforeEach
    public void beforeMethod(){
        driver = new ChromeDriver();
    }

    //@AfterEach
    //public void afterMethod(){
    //    driver.quit();
    //}

    //@AfterAll
    //public void tearDown(){
    //    driver.quit();
    //    System.out.println("Test finished.");
    //}

}
