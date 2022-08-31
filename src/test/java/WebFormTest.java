import Base.BaseTest;
import Model.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.ListIterator;

public class WebFormTest extends BaseTest {

    @Test
    public void testWebForm() throws InterruptedException {

        HomePage newHomePage = new HomePage(getDriver())
                .textInput("Peraton")
                .passwordInput("123455")
                .textAreaInput("Hello world")
                .drobDownSelect("1")
                .clickFile()
                .clickCheckBox1()
                .clickCheckBox2();

        Thread.sleep(10000);


        }

    }
