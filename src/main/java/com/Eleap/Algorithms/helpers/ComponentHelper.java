package com.Eleap.Algorithms.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public interface ComponentHelper {

    default void scrollDown(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight));");
        Thread.sleep(2000);
    }

    default void scrollElementDisplayed(WebDriver driver, WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
    }

    default void  scrollHorizontal (WebDriver driver) throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.querySelector('table th:last-child').scrollIntoView();");
        Thread.sleep(2000);


    }

    default void alertMethod(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    default  void  hoverEffect (WebDriver driver,WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).moveToElement(element).build().perform();
    }

    default  void selectMethod (WebElement element,int name){
        Select select = new Select(element);
        select.selectByIndex(name);
    }


}

