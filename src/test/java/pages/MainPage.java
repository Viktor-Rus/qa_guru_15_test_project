package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {
    private SelenideElement
            mainLogo = $("svg[class*='main-logo']"),
            iconSearch = $("div[class='search-site']"),
            inputSearch = $("input[name='s']"),
            sectionMadeToOrder = $("section[class='made-to-order']"),
            tabInvestors =  $("a[title='Investors']"),
            titlePage =  $("h1[class='page-title']"),
            footer = $("footer[class='footer-wrapper']"),
            loginFooter =  $x("//a[.='Associate Login']");


    @Step("Открытие главной страницы")
    public MainPage openMainPage() {
        open(Configuration.baseUrl);
//        open("/");
        return this;
    }

    @Step("Проверка отображения логотипа на главной странице")
    public MainPage checkLogoVisible() {
        mainLogo.should(appear);
        return this;
    }

    @Step("Проверка открытия формы поиска")
    public MainPage checkOpenSearchForm(){
        iconSearch.click();
        inputSearch.should(appear);
        return this;
    }

    @Step("Скролл до блока made to order")
    public MainPage scrollToMadeToOrder(){
        sectionMadeToOrder.scrollTo();
        return this;
    }

    @Step("Проверка отображения блока  made to order")
    public MainPage checkVisibleMadeToOrderSection(){
        sectionMadeToOrder.should(appear);
        return this;
    }

    @Step("Перехода на вкладку INVESTORS")
    public MainPage goToTabInvestors(){
        tabInvestors.click();
        return this;
    }

    @Step("Проверка открытии вкладки Investors")
    public MainPage checkOpenTabInvestors(){
        assertEquals("INVESTORS",titlePage.getText());
        return this;
    }

    @Step("Скролл до футтера")
    public MainPage scrollToFooter(){
        footer.scrollTo();
        return this;
    }

    @Step("Клик по кнопке входа из футера")
    public MainPage clickLoginFooter(){
        loginFooter.click();
        return this;
    }

    @Step("Проверка открытия формы авторизации")
    public MainPage checkOpenFormAuthorization(){
        assertEquals("ASSOCIATE LOGIN", titlePage.getText());
        return this;
    }


}
