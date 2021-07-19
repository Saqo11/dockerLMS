package com.Eleap.Algorithms.helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public interface WaitHelper {


         default void waitForElementToBeClickable(WebDriver driver, WebElement element, int timeout){

            WebDriverWait wait = new WebDriverWait(driver,timeout);
            wait.until((ExpectedConditions.elementToBeClickable(element)));


        }

           default  void waitForElementInVisibilityOf  (WebDriver driver, WebElement element, int timeout){

            WebDriverWait wait = new WebDriverWait(driver,timeout);
            wait.until((ExpectedConditions.invisibilityOf(element)));


        }
         default void waitForElementToVisibilityOfElement  (WebDriver driver, WebElement element, int timeout){

            WebDriverWait wait = new  WebDriverWait(driver,timeout);
            wait.until((ExpectedConditions.visibilityOf(element)));


        }



    }





