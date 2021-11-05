package cucumber.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExamplePage extends BasePage {
    WebDriver driver;


    @FindBy(name="q")
    WebElement inputQ;

    @FindBy(xpath="//*[contains(text(), 'I agree')]")
    WebElement agreeButton;

    public ExamplePage(WebDriver driver) throws InterruptedException {
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);

        agreeButton.click();

        if(agreeButton.isDisplayed()) {
            agreeButton.click();
        }
    }



    public void setInputQ(String qText){
        waitForElementToBeVisible(inputQ);
        inputQ.sendKeys(qText);
    }

    public void submitInputQ(){
        inputQ.submit();
    }
}
