package com.Azul.step_definitions;

import com.Azul.pages.CompanyPage;
import com.Azul.pages.ImportantInfoPage;
import com.Azul.pages.LoginPage;
import com.Azul.utilities.BrowserUtils;
import com.Azul.utilities.ConfigurationReader;
import com.Azul.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class addnewsStepDf {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
        BrowserUtils.waitFor(3);
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @When("the user navigates to Company on the main page and clicks Add News")
    public void the_user_navigates_to_Company_on_the_main_page_and_clicks_Add_News() {
        new CompanyPage().company();
        new CompanyPage().addNews();

    }


    @Then("user can select the type of information")
    public void user_can_select_the_type_of_information() {
        WebElement dropdownElement = Driver.get().findElement(By.xpath("//select[@name='PROP[3][]']"));
        Select stateDropdown = new Select(dropdownElement);
        List<WebElement> options = stateDropdown.getOptions();
        System.out.println("options.size() = " + options.size());
        //print option one by one
        for (WebElement option : options) {
            System.out.println(option.getText());

        }
        stateDropdown.selectByVisibleText("Press Release");
        String expectedOption = "Press Release";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption, actualOption);
    }

    @When("the user types the world in the Title inputbox")
    public void the_user_types_the_world_in_the_Title_inputbox() {
     Driver.get().findElement(By.xpath("//input[@name='NAME']")).sendKeys("the world");

    }

    @And("the user clicks on Details")
    public void the_user_clicks_on_Details() {

        new ImportantInfoPage().setDetails();

    }
    @When("the user types picture in the tags inputbox")
    public void the_user_types_picture_in_the_tags_inputbox() {
        Driver.get().findElement(By.xpath("//input[@name='TAGS']")).sendKeys("picture");
    }
    @When("the user clicks on Save")
    public void the_user_clicks_on_Save() {
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.id("savebtn")).click();
        BrowserUtils.waitFor(3);
    }

    @Then("user is able to add tags under details")
    public void user_is_able_to_add_tags_under_details() {

    }
    @When("the user clicks on Text, HTML, and Visual Editor")
    public void the_user_clicks_on_Text_HTML_and_Visual_Editor() {
        WebElement textBtn = Driver.get().findElement(By.id("bxed_PREVIEW_TEXT_text"));
        WebElement htmlBtn = Driver.get().findElement(By.id("bxed_PREVIEW_TEXT_html"));
        WebElement editorBt = Driver.get().findElement(By.id("bxed_PREVIEW_TEXT_editor"));
textBtn.click();
        Assert.assertTrue(textBtn.isSelected());
        htmlBtn.click();
        Assert.assertTrue(htmlBtn.isSelected());
        editorBt.click();
        Assert.assertTrue(editorBt.isSelected());
    }

    @Then("User is able to select Text, HTML, and Visual Editor")
    public void user_is_able_to_select_Text_HTML_and_Visual_Editor() {

    }
    @When("the user types Expert Roundup: How Technology is Shaping the Future of Life Sciences in the Title inputbox")
    public void the_user_types_Expert_Roundup_How_Technology_is_Shaping_the_Future_of_Life_Sciences_in_the_Title_inputbox() {
        String newsTitle= "Expert Roundup: How Technology is Shaping the Future of Life Sciences";
        Driver.get().findElement(By.xpath("//input[@name='NAME']")).sendKeys(newsTitle);
    }

    @When("the user typeS Industry leaders share perspectives on moving the life sciences industry forward under the text.")
    public void the_user_typeS_Industry_leaders_share_perspectives_on_moving_the_life_sciences_industry_forward_under_the_text() {
       String newsText= "Industry leaders share perspectives on moving the life sciences industry forward";
       Driver.get().findElement(By.id("bxed_PREVIEW_TEXT")).sendKeys(newsText);
    }

    @When("the user clicks on Save and add")
    public void the_user_clicks_on_Save_and_add() {
       Driver.get().findElement(By.id("save_and_add")).click();
    }
    @Then("the page title contains {string}")
    public void the_page_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }

    }

