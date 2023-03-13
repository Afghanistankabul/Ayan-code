package AyanMustafaPackage.TestComponents;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.landingPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
   public landingPage page;
    public WebDriver initializeDriver() throws IOException {
        Properties pro=new Properties();
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AyanMustafa\\resources\\GlobalData.properties");
        pro.load(file);
        String browserName=pro.getProperty("browser");
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            driver.manage().window().maximize();
        } else if (browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            driver.manage().window().maximize();

        } else if (browserName.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            driver.manage().window().maximize();

            
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();


        return driver;
    }
    @BeforeMethod(alwaysRun = true)
    public landingPage lunchApplication() throws IOException {
       driver =initializeDriver();
         page = new landingPage(driver);
        page.goTo();
        return page;

    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.close();
    }
}
