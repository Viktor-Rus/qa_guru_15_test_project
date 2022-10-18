package tests.advantagesolutions;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    @Test
    void mainLogoVisible() {
        step("check logo visible", () -> {
            open("/");
            $("svg[class*='main-logo']").should(appear);
        });
    }

    @Test
    void openFormSearch() {
        step("Open search form", () -> {
            open("/");
            $("div[class='search-site']").click();
            $("input[name='s']").should(appear);
        });
    }

    @Test
    void madeToOrderScroll() {
        step("Scroll to made to order", () -> {
            open("/");
            $("section[class='made-to-order']").scrollTo();
        });
        step("check section made to order", () -> {
            $("section[class='made-to-order']").should(appear);
        });
    }

    @Test
    void investorsOpenPage() {
        step("Open page Investors", () -> {
            open("/");
            $("a[title='Investors']").click();
        });
        step("check open page Investors", () -> {
            assertEquals( "INVESTORS", $("h1[class='page-title']").getText());
        });
    }

    @Test
    void associateLoginInFooter() {
        step("Scroll to foote", () -> {
            open("/");
            $("footer[class='footer-wrapper']").scrollTo();
        });
        step("Click associate login and check form", () -> {
            $x("//a[.='Associate Login']").click();
            assertEquals( "ASSOCIATE LOGIN", $("h1[class='page-title']").getText());
        });
    }



}
