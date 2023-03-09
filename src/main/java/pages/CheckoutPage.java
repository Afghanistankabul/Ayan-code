package pages;

import AyanMustafa.AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends AbstractComponent {
    WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@placeholder='Select Country']")
    WebElement country;

    @FindBy(css = ".ta-item:nth-of-type(1)")
    WebElement selectCountry;
    @FindBy(css = ".action__submit ")
    WebElement submit;

    public void selectCountry(String countryName){


    Actions a = new Actions(driver);
        a.sendKeys(country,countryName).build().perform();

        selectCountry.click();



    }
    public ConfirmationPage submitOrder(){
        submit.click();
        return new ConfirmationPage(driver);
    }

}
