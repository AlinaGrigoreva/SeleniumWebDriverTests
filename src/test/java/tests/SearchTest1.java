package tests;

import org.testng.annotations.Test;


public class SearchTest1 extends BaseTest {

    @Test(dataProvider = "dataProvider")
    public void openGoogleComInChromeTest1(String text) throws InterruptedException {

        steps.executeSearchByKeyWord(text)
                .verifyThatTopResultContainsCorrectTest("Пишем автотест с использованием Selenium Webdriver ...")
                .verifyThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md");

    }
}
