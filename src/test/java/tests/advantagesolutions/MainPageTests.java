package tests.advantagesolutions;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.*;

public class MainPageTests extends TestBase {

    @BeforeEach
    public void visitMainPage() {
        open("/");
        new MainPage().openMainPage();
    }


    @Test
    @Owner("vaurusov")
    @DisplayName("Проверка отображения логотипа на главной странице")
    void mainLogoVisible() {
        new MainPage().checkLogoVisible();

    }

    @Test
    @Owner("vaurusov")
    @DisplayName("Проверка открытия формы поиска")
    void openFormSearch() {
        new MainPage().checkLogoVisible().checkOpenSearchForm();
    }

    @Test
    @Owner("vaurusov")
    @DisplayName("Проверка наличия блока made to order и скролл до него")
    void madeToOrderScroll() {
        MainPage mainPage = new MainPage();

        mainPage.scrollToMadeToOrder()
                .checkVisibleMadeToOrderSection();
    }

    @Test
    @Owner("vaurusov")
    @DisplayName("Проверка перехода на вкладку INVESTORS")
    void investorsOpenPage() {
        MainPage mainPage = new MainPage();

        mainPage.goToTabInvestors()
                .checkOpenTabInvestors();
    }

    @Test
    @Owner("vaurusov")
    @DisplayName("Проверка открытия формы авторизации из футера")
    void associateLoginInFooter() {
        MainPage mainPage = new MainPage();

        mainPage.scrollToFooter()
                .clickLoginFooter()
                .checkOpenFormAuthorization();
    }


}
