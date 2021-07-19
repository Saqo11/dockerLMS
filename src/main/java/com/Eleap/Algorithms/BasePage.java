package com.Eleap.Algorithms;

import com.Eleap.Algorithms.helpers.ComponentHelper;
import com.Eleap.Algorithms.helpers.WaitHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  BasePage implements WaitHelper, ComponentHelper {
    public WebDriver driver;
    public WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver,this);

    }



}
