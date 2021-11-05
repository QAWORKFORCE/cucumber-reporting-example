package junit_tests;

import static io.github.bonigarcia.seljup.BrowserType.CHROME;
import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

import java.io.File;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;

import io.github.bonigarcia.seljup.DockerBrowser;
import io.github.bonigarcia.seljup.SeleniumJupiter;

@ExtendWith(SeleniumJupiter.class)
class DockerChromeRecordingTest {

    final Logger log = getLogger(lookup().lookupClass());

    File recordingFile;

    @AfterEach
    void teardown() {
        if (recordingFile != null) {
            assertThat(recordingFile).exists();
//            recordingFile.delete();
        }
    }

    @Test
    void recordingTest(
            @DockerBrowser(type = CHROME, recording = true) RemoteWebDriver driver)
            throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        assertThat(driver.getTitle()).contains("Selenium WebDriver");

        Thread.sleep(Duration.ofSeconds(3).toMillis());

        recordingFile = new File(
                "recordingTest_arg0_chrome_" + driver.getSessionId() + ".mp4");
    }


    @Test
    void recordingGoogleTest(
            @DockerBrowser(type = CHROME, recording = true) RemoteWebDriver driver)
            throws InterruptedException {


        driver.get("https://www.nationwide.co.uk/mortgages/mortgage-calculators/overpayment-calculator/");
        //Let's mark done first two items in the list.

        WebElement element = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        if(element.isDisplayed()){
            element.click();
        }

        driver.findElement(By.xpath("//label[contains(text(),'Repayment')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Get results')]")).click();

//        driver.findElement(By.name("li2")).click();
//
//        // Let's add an item in the list.
//        driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
//        driver.findElement(By.id("addbutton")).click();

        recordingFile = new File(
                "recordingTest_arg0_chrome_" + driver.getSessionId() + ".mp4");
    }

}