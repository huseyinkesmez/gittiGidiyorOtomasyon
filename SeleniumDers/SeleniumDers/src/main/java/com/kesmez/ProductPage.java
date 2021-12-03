package com.kesmez;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductPage extends MainPage {
    private static final Logger logger = LogManager.getLogger(MainPage.class);

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void productsPageMethod() throws InterruptedException {

        TimeUnit.SECONDS.sleep(1);
        sendKeys(By.cssSelector("input[data-cy='header-search-input']"), "ipad");
        click(By.cssSelector("button[data-cy='search-find-button']"));
        logger.info("search ipad");


        for (int i = 1; i < 5; i++) {
            scrollDown();
            randomSelect(By.cssSelector("div[data-cy='product-favorite']"));
        }



        click(By.cssSelector("div[class='sc-1nx8ums-0 hdMghx']"));
        sendKeys(By.cssSelector("input[data-cy='header-search-input']"), "Iphone 13");
        click(By.cssSelector("button[data-cy='search-find-button']"));
        logger.info("search iphone13");


        TimeUnit.SECONDS.sleep(3);
        scrollDownMore();
        click(By.xpath("(//div[@class='sc-1yvp483-0 dTGwmm'])[8]"));


        TimeUnit.SECONDS.sleep(5);

        scrollDownMore();
        click(By.cssSelector("button[class='control-button gg-ui-button plr10 gg-ui-btn-default']"));
        TimeUnit.SECONDS.sleep(2);

        click(By.cssSelector("div[class='icon-sepet-line-wrapper']"));
    }
}
