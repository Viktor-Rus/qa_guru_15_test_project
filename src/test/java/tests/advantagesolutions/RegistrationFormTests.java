package tests.advantagesolutions;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class RegistrationFormTests extends TestBase {
    @Test
    void mainLogoVisible() {
        step("Open registrations form", () -> {
            open("/");
            $("svg[class*='main-logo']").should(appear);

        });
//

    }
}
