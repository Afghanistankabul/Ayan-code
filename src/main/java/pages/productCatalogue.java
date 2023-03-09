package pages;

import AyanMustafa.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class productCatalogue extends AbstractComponent {
    WebDriver driver;

    public productCatalogue(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   // List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
    // pageFactory

    @FindBy(css = ".mb-3")
    List <WebElement> products ;
    @FindBy(css = ".ng-animating")
            WebElement spinner;


    By productsBy=By.cssSelector(".mb-3");
    By addToCart=By.cssSelector(".card-body button:last-child");
    By toastMessage=By.cssSelector(".toast-container");

    public List<WebElement>getProductList(){
        waitForElementToAppear(productsBy);
        return products;
    }

    public WebElement getProductByName(String productName){
        WebElement pro = getProductList().stream().filter(product ->
                product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
        return pro;
    }

    public void addProductToCart(String productName) throws InterruptedException {
        WebElement pro=getProductByName( productName);
                pro.findElement(addToCart).click();
                waitForElementToAppear(toastMessage);
                waitForElementToDisappear(spinner);
    }





}
