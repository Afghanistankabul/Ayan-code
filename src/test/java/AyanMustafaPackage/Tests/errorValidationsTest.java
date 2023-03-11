package AyanMustafaPackage.Tests;

import AyanMustafaPackage.TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ConfirmationPage;
import pages.productCatalogue;

import java.io.IOException;
import java.util.List;

public class errorValidationsTest extends BaseTest {
    static String productName = "ADIDAS ORIGINAL";

    @Test
    public void loginErrorValidation() throws InterruptedException, IOException {

         page.applicationLogin("mustafa.ayan29@yahoo.com", "Javaselenium12");
        page.getErrorMessage();
        Assert.assertEquals("Incorrect email or password.",page.getErrorMessage());


    }
    @Test
    public void productErrorValidation() throws InterruptedException, IOException {

        productCatalogue productCatalogue = page.applicationLogin("mustafa.ayan29@yahoo.com", "Javaselenium12@");
        List<WebElement> products = productCatalogue.getProductList();
        WebElement pro = products.stream().filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
        productCatalogue.addProductToCart(productName);
        CartPage cartPage = productCatalogue.goToCartPage();
        Boolean match = cartPage.VerifyProductDisplay("ADIDAS ORIGINAL23");
        Assert.assertTrue(match);
    }


}
