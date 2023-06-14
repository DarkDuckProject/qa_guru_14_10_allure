package qa.guru.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Owner("kurpanov")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing", url = "https://testing.github.com")
    @DisplayName("Создание Issue для авторизованного пользователя")
    public void testStaticLabels() {
         Allure.getLifecycle().updateTestCase(
                 t -> t.setName("Создание Issue для авторизованного пользователя")
         );
         Allure.feature("Issue в репозитории");
         Allure.label("owner", "kurpanov");
         Allure.label("severity", SeverityLevel.CRITICAL.value());
         Allure.link("Testing", "https://testing.github.com");
    }

    @Test
    public void testDynamicLabels() {

    }
}
