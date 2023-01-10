import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
    WebDriver driver;
    @BeforeTest
    public void beforeRunTestSteps(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void connectMainPage(){
        driver.get("https://www.google.com");
    }

    @AfterTest
    public void StepsOfAfterTest(){
        driver.quit();
    }
    /*@Test
    public void successMailTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("This is a success mail test");
        driver.close();

    }
    @Test
    public void unsuccessMailTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("This is a unsuccess mail test");
        driver.close(); */

    }

