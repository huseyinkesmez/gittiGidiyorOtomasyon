package com.kesmez;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends MainPage {
    private static final Logger logger = LogManager.getLogger(MainPage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginPageMethod() throws InterruptedException {
        assertUrl("https://www.gittigidiyor.com/uye-girisi?s=1");

        sendKeys(By.id("L-UserNameField"), "hsynkesmez@outlook.com");
        TimeUnit.SECONDS.sleep(1);
        sendKeys(By.id("L-PasswordField"), "Test0101");
        TimeUnit.SECONDS.sleep(1);
        click(By.id("gg-login-enter"));
        logger.info("Basarili Giris");

    }
}
