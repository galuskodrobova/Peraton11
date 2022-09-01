import Base.BaseTest;
import Model.HomePage;
import Model.SecondPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebFormTest extends BaseTest {

    @Test
    public void testWebForm() {

        SecondPage submittedForm = new HomePage(getDriver())
                .textInput("Peraton")
                .passwordInput("123455")
                .textAreaInput("Hello world")
                .drobDownSelect("1")
                .clickFile()
                .clickCheckBox1()
                .clickCheckBox2()
                .clickSubmit();

        Assert.assertEquals(submittedForm.getSubmitFormText(),"Form submitted");
    }

    @Test
    public void testIsTextInputVisible() {

        String actual = new HomePage(getDriver()).getTextInputName();

        Assert.assertEquals(actual,"Text input");
    }
}

