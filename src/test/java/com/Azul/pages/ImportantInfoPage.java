package com.Azul.pages;

import com.Azul.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ImportantInfoPage extends BasePage{

    @FindBy(id = "tab_cont_cedit1")
    public WebElement Ptext;

    @FindBy(id = "tab_cont_cedit2")
    public WebElement Details;

    @FindBy(id = "bx_file_detail_picture_add")
    public WebElement tripleLineIcon;



    public void setPtext() {

        Ptext.click();
    }

    public void setDetails() {
        BrowserUtils.waitFor(3);
        Details.click();

    }


    public void setTripleLineIcon(){
        tripleLineIcon.click();


    }

}

