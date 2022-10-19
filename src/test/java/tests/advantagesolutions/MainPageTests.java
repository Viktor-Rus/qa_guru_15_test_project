package tests.advantagesolutions;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    @Test
    void mainLogoVisible() {
        step("Проверка отображения логотипа на главной странице", () -> {
            open("/");
            $("svg[class*='main-logo']").should(appear);
        });
    }

    @Test
    void openFormSearch() {
        step("Проверка открытия формы поиска", () -> {
            open("/");
            $("div[class='search-site']").click();
            $("input[name='s']").should(appear);
        });
    }

    @Test
    void madeToOrderScroll() {
        step("Скролл до блока made to order", () -> {
            open("/");
            $("section[class='made-to-order']").scrollTo();
        });
        step("Проверка отображения блока  made to order", () -> {
            $("section[class='made-to-order']").should(appear);
        });
    }

    @Test
    void investorsOpenPage() {
        step("Перехода на вкладку INVESTORS", () -> {
            open("/");
            $("a[title='Investors']").click();
        });
        step("проверка открытии вкладки Investors", () -> {
            assertEquals( "INVESTORS", $("h1[class='page-title']").getText());
        });
    }

    @Test
    void associateLoginInFooter() {
        step("Скролл до футтера", () -> {
            open("/");
            $("footer[class='footer-wrapper']").scrollTo();
        });
        step("Клик по кнопке входа и проверка открытия формы", () -> {
            $x("//a[.='Associate Login']").click();
            assertEquals( "ASSOCIATE LOGIN", $("h1[class='page-title']").getText());
        });
    }



}
