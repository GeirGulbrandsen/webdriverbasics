package com.plusonetesting.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

public class FirstTest {

    @Test
    public void driverIsTheKing() {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://compendiumdev.co.uk/selenium/");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
