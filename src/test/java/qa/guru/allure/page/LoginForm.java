package qa.guru.allure.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginForm {

    public SelenideElement loginInput = $(".login-input");
    public SelenideElement passwordInput = $(".password-input");

    public void login(String username, String password) {
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void loginAndSearch(String username, String password, String request) {
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);

        //бяда, так не надо делать
        SearchForm form = new SearchForm();
        form.search(request);
    }
}
