package com.Eleap.Algorithms.com.Admin.page;

import com.Eleap.Algorithms.helpers.ComponentHelper;
import com.Eleap.Algorithms.helpers.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTab   implements WaitHelper, ComponentHelper {
    public WebDriver driver;


    public BaseTab (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



}
