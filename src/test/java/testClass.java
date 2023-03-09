import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testClass {
  public static WebDriver driver;

    @BeforeTest
    void web (){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://facebook.com");
    }
    @Test
    void verifyTitle (){
        String title =driver.getTitle();
        String actualTitle= "Facebook - log in or sign up";

        System.out.println(title);
        Assert.assertEquals(title,actualTitle);

    }
    @Test
    void verify (){
        String title =driver.getTitle();
        String actualTitle= "Facebook - log in or sign up";

        System.out.println(title);
        Assert.assertEquals(title,actualTitle);

    }

}
