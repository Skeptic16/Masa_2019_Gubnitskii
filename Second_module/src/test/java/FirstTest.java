import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FirstTest {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
    }
    @Test
    public void openBrowser() throws InterruptedException {
        wd.get("https://www.google.ru/");
        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("Java");


    }
    @Test
    public void openBrowser2() throws InterruptedException {
        wd.get("https://yandex.ru/");
        wd.findElement(By.id("text")).click();
        wd.findElement(By.id("text")).clear();
        wd.findElement(By.id("text")).sendKeys("Wikipedia");
        Thread.sleep(5000);
    }
    @AfterClass
    public void tearDown(){
        wd.quit();
    }
}
