package qa.guru.allure.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchForm {

    public SelenideElement searchInput = $(".input");
    public SelenideElement searchButton = $(".button");

    public void search(String request) {
        searchInput.sendKeys(request);
        searchButton.submit();
    }
}
