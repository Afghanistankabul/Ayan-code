package AyanMustafaPackage.Tests;

import AyanMustafaPackage.TestComponents.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class StandALonTest extends BaseTest {
    String productName = "ADIDAS ORIGINAL";

    @Test(dataProvider = "getData", groups = {"purchase"})
    public void standAlonTest(HashMap<String, String> input) throws InterruptedException, IOException {

        productCatalogue productCatalogue = page.applicationLogin(input.get("email"), input.get("password"));
        List<WebElement> products = productCatalogue.getProductList();
        WebElement pro = products.stream().filter(product -> product.findElement(By.cssSelector("b")).getText().equals(product)).findFirst().orElse(null);
        productCatalogue.addProductToCart(input.get("product"));
        CartPage cartPage = productCatalogue.goToCartPage();
        Boolean match = cartPage.VerifyProductDisplay(input.get("product"));
        Assert.assertTrue(match);
        CheckoutPage checkoutPage = cartPage.goToCheckout();
        checkoutPage.selectCountry("af");
        ConfirmationPage confirmationPage = checkoutPage.submitOrder();
        String confirmMessage = confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));


    }

    @Test(dependsOnMethods = {"standAlonTest"})
    public void orderStoryTest() {
        productCatalogue ProductCatalogue =
                page.applicationLogin("mustafa.ayan29@yahoo.com","Javaselenium12@");
        OrderPage ordersPage = ProductCatalogue.goToOrdersPage();
        Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));


    }

    @DataProvider
   public Object[][] getData() throws IOException {
       List<HashMap<String, String>> data= getJsonDataToMap("C:\\desktop\\SeleniumFrameworkDesign\\src\\test\\java\\AyanMustafa\\Data\\PurchaseOrder.json");


       return new Object[][]{{data.get(0)},{data.get(1)}};
   }


    //second way
    //2
//    @Test(dataProvider = "getData",groups = {"purchase"})
//    public void standAlonTest(HashMap<String,String> input) throws InterruptedException, IOException {
//
//        productCatalogue productCatalogue = page.applicationLogin(input.get("email"),input.get("password"));
//        List<WebElement> products = productCatalogue.getProductList();
//        WebElement pro = products.stream().filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
//        productCatalogue.addProductToCart(input.get("product"));
//        CartPage cartPage = productCatalogue.goToCartPage();
//        Boolean match = cartPage.VerifyProductDisplay(input.get("product"));
//        Assert.assertTrue(match);


    //2
//    @DataProvider
//    public Object[][] getData() {
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("email", "mustafa.ayan29@yahoo.com");
//        map.put("password", "Javaselenium12@");
//        map.put("product", "ADIDAS ORIGINAL");
//
//        HashMap<String, String> map1 = new HashMap<String, String>();
//        map1.put("email", "massieayan29@gmail.com");
//        map1.put("password", "Seleniumjava12@");
//        map1.put("product", "ZARA COAT 3");
//
//
//        return new Object[][]{{map}, {map1}};
//    }

}



//-------------------------------------------------------------------//


        // this is the first way to pass data
      //1
//    public void standAlonTest(String email, String password,String productName) throws InterruptedException, IOException {
//
//        productCatalogue productCatalogue = page.applicationLogin(email,password);
//        List<WebElement> products = productCatalogue.getProductList();
//        WebElement pro = products.stream().filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
//        productCatalogue.addProductToCart(productName);

       //1
//    @DataProvider
//    public Object[][] getData(){
//        return new Object[][]{{"mustafa.ayan29@yahoo.com","Javaselenium12@","ADIDAS ORIGINAL"},{"massieayan29@gmail.com","Seleniumjava12@","ZARA COAT 3"}};
//    }

