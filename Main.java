import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main
{
    public static void main(String[] args ){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement Elements = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]/div[1]"));
        Elements.click();

        WebElement WebTables = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4)"));
        WebTables.click();

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Yezdan");

        WebElement lastName = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"Last Name\"]"));
        lastName.click();
        lastName.sendKeys("TEKIRDAGLI");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("yezdan.tekirdagli@gmail.com");

        WebElement age = driver.findElement(By.cssSelector(".mr-sm-2[id=age]"));
        age.click();
        age.sendKeys("25");

        WebElement salary = driver.findElement(By.id("salary"));
        salary.click();
        salary.sendKeys("40000");

        WebElement deparment = driver.findElement(By.id("department"));
        deparment.click();
        deparment.sendKeys("Quality Assurance");

        WebElement submitButton = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        submitButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();
}
}
