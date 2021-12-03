package com.kesmez;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class App extends MainPage{
    private static final Logger logger = LogManager.getLogger(MainPage.class);

    public App(WebDriver driver) {
        super(driver);
    }

    public void homePageMethod() throws InterruptedException {

        assertUrl("https://www.gittigidiyor.com/");

        click(By.cssSelector("a[class='tyj39b-5 lfsBU']"));
        //popup kapatma

        click(By.cssSelector("div[title='Giriş Yap']"));
        TimeUnit.SECONDS.sleep(1);

        click(By.cssSelector("a[data-cy='header-login-button']"));
    }



}

