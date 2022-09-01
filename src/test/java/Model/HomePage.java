package Model;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "my-text-id")
    private WebElement textInput;

    @FindBy(name = "my-password")
    private WebElement password;

    @FindBy(name = "my-textarea")
    private WebElement myTextArea;

    @FindBy(name = "my-select")
    private WebElement drobdownSelect;

    @FindBy(name = "my-datalist")
    private WebElement drobdownDatalist;

    @FindBy(xpath = "//datalist[@id='my-options']/option")
    private List<WebElement> dataListOptions;

    @FindBy(id = "my-options")
    private WebElement frame;

    @FindBy(name = "my-file")
    private WebElement myFile;

    @FindBy(id = "my-check-1")
    private WebElement myCheckBox1;

    @FindBy(id = "my-check-2")
    private WebElement myCheckBox2;

    @FindBy(name = "my-colors")
    private WebElement myColors;

    @FindBy(xpath = "//label[normalize-space()='Text input']")
    private WebElement input;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage textInput(String text) {
        textInput.sendKeys(text);
        return this;
    }

    public HomePage passwordInput(String text) {
        password.sendKeys(text);
        return this;
    }

    public HomePage textAreaInput(String text) {
        myTextArea.sendKeys(text);
        return this;
    }

    public HomePage drobDownSelect(String value) {
        drobdownSelect.click();
        Select select = new Select(drobdownSelect);
        select.selectByValue(value);
        return this;
    }

    public HomePage drobDownDataList(String city) {
        drobdownDatalist.click();
        Actions action = new Actions(getDriver());
        action.moveToElement(getDriver()
                .findElement(By.xpath("//datalist[@id='my-options']/option[1]"))).click().build().perform();

        for (WebElement x : dataListOptions) {
            if (x.getAttribute("value").contains(city)) {
                x.click();
            }
        }
        return this;
    }

    public HomePage clickFile() {
        myFile.sendKeys("/usr/local/test/gibby.jpg");
        return this;
    }

    public HomePage clickCheckBox1() {
        myCheckBox1.click();
        return this;
    }

    public HomePage clickCheckBox2() {
        myCheckBox2.click();
        return this;
    }

    public String getTextInputName() {
        return input.getText();
    }

    public SecondPage clickSubmit(){
        submit.click();
        return new SecondPage(getDriver());
    }




}
