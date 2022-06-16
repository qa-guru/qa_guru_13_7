package qa.guru.allure;

import org.junit.jupiter.api.Test;
import qa.guru.allure.page.SearchForm;
import qa.guru.allure.page.LoginForm;

public class PageObjectTest {

    @Test
    public void pageObjectTest() {
        SearchForm searchForm = new SearchForm();
        searchForm.search("Привет");
        searchForm.searchInput.sendKeys("Привет");
        searchForm.searchButton.submit();
    }

    @Test
    public void pageObjectMethodTest() {
        SearchForm searchForm = new SearchForm();
        searchForm.search("Привет");

        LoginForm loginForm = new LoginForm();
        loginForm.login("eroshenkoam", "213123123");
    }


}
