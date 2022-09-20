package steps;

import pages.SearchResultPage;

public class SearchResultSteps {
    private SearchResultPage searchResultPage = new SearchResultPage();

    public SearchResultSteps verifyThatTopResultContainsCorrectTest(String text) {
        searchResultPage.asserThatTopResultContainsCorrectText(text);

        return this;
    }

    public SearchResultSteps verifyThatTopResultContainsProperAttributeText(String text) {
        searchResultPage.asserThatTopResultContainsProperAttributeText(text);
        return this;
    }
}
