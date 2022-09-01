package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecondPage extends BasePage {

    @FindBy(className = "display-6")
    private WebElement formSubmitted;

    public SecondPage(WebDriver driver) {
        super(driver);
    }

    public String getSubmitFormText(){
       return getWait5().until(ExpectedConditions.visibilityOf(formSubmitted)).getText();
    }

}
