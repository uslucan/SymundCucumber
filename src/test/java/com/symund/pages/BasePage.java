package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

}
