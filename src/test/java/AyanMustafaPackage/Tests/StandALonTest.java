package AyanMustafaPackage.Tests;

import AyanMustafaPackage.TestComponents.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.List;

public class StandALonTest extends BaseTest {
    static String productName = "ADIDAS ORIGINAL";

    @Test
    public void standAlonTest() throws InterruptedException, IOException {

        productCatalogue productCatalogue = page.applicationLogin("mustafa.ayan29@yahoo.com", "Javaselenium12@");
        List<WebElement> products = productCatalogue.getProductList();
        WebElement pro = products.stream().filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
        productCatalogue.addProductToCart(productName);
        CartPage cartPage = productCatalogue.goToCartPage();
        Boolean match = cartPage.VerifyProductDisplay(productName);
        Assert.assertTrue(match);
        CheckoutPage checkoutPage = cartPage.goToCheckout();
        checkoutPage.selectCountry("af");
        ConfirmationPage confirmationPage = checkoutPage.submitOrder();
        String confirmMessage = confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));



    }
    @Test(dependsOnMethods = {"standAlonTest"})
    public void orderStoryTest(){
        productCatalogue productCatalogue =
                page.applicationLogin("mustafa.ayan29@yahoo.com", "Javaselenium12@");

    }
}
