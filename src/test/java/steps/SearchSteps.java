package steps;

import pages.SearchPage;

public class SearchSteps {
    private SearchPage searchPage = new SearchPage();


    public SearchResultSteps executeSearchByKeyWord(String keyword) throws InterruptedException {
        searchPage.fillSearchField(keyword);
        searchPage.pressEnter();
        Thread.sleep(3000);
        return new SearchResultSteps();
    }
}
