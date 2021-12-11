package com.Azul.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends BasePage {

    @FindBy(xpath = "//*[text()='Add News']")
    public WebElement addNewsBtn;



public void addNews(){
addNewsBtn.click();

}
}