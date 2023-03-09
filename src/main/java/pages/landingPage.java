package pages;

import AyanMustafa.AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage extends AbstractComponent {


    WebDriver driver;

    public landingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //WebElement userEmail=driver.findElement(By.id("userEmail"));
    // pageFactory

    @FindBy(id = "userEmail")
    WebElement userEmail;

    //WebElement userPassword= driver.findElement(By.id("userPassword"));

    @FindBy(id = "userPassword")
    WebElement passwordEle;

    // WebElement login = driver.findElement(By.id("login"));
    @FindBy(id = "login")
    WebElement submit;
    @FindBy(css = "[class*='flyInOut']")
    WebElement errorMessage;

    public productCatalogue applicationLogin(String email, String password){
        userEmail.sendKeys(email);
        passwordEle.sendKeys(password);
        submit.click();
        productCatalogue productCatalogue = new productCatalogue(driver);
        return productCatalogue;
    }
    public String getErrorMessage(){
        waitForWebElementToAppear(errorMessage);
        return errorMessage.getText();
    }
    public void goTo(){

        driver.get("https://rahulshettyacademy.com/client");

    }


}
