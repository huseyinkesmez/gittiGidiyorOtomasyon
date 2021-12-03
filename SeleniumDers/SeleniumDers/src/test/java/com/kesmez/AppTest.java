package Kesmez;

import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;


public class AppTest extends BaseTest {

    App app;
    LoginPage loginPage;
    ProductsPage productsPage;

    ChartPage chartPage;
    NextPage nextPage;

    @Test
    public void appTest() throws InterruptedException {

        App app = new App(driver);
        app.homePageMethod();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginPageMethod();
        ProductPage productPage = new ProductPage(driver);
        productPage.productPageMethod();
        ChartPage chartPage = new ChartPage(driver);
        chartPage.basketPageMethod();
        NextPage nextPage = new NextPage(driver);
        nextPage.newTabPageMethod();
    }

}
