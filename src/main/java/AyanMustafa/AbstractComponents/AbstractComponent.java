package AyanMustafa.AbstractComponents;

import pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.OrderPage;

import java.time.Duration;

public class AbstractComponent {
    WebDriver driver;

    public AbstractComponent(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[routerlink *='cart']")
    WebElement cardHeader;
    @FindBy(xpath = "(//button[@class='btn btn-custom'])[2]")
    WebElement orderHeader;

    public void waitForElementToAppear(By findBY ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBY));
    }
    public void waitForWebElementToAppear(WebElement findBY ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(findBY));
    }
    public CartPage goToCartPage(){
        cardHeader.click();
        CartPage cartPage=new CartPage(driver);
        return cartPage;

    }
    public OrderPage goToOrdersPage(){
        orderHeader.click();
        OrderPage orderPage=new OrderPage(driver);
        return orderPage;

    }

    public void waitForElementToDisappear(WebElement ele) throws InterruptedException {
        Thread.sleep(1000);
//       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.invisibilityOf(ele));
    }
}
