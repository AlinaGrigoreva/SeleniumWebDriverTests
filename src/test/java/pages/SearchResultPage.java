package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'yuRUbf']//h3")
    private WebElement resultRow;

    public SearchResultPage() {
        super();
    }

    public void asserThatTopResultContainsCorrectText(String expectedText) {
        assertThat(resultRow.isDisplayed()).as("Element has not been displayed").isTrue();
        assertThat(resultRow.getText()).as("Wrong text has been displayed").isEqualTo(expectedText);
    }

    public void asserThatTopResultContainsProperAttributeText(String expectedAtribute) {
        assertThat(resultRow.getAttribute("class")).as("Wrong attribute text").contains(expectedAtribute);
    }
}
