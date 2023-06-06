package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubSolutionTest {

    @Test
    void githubSolutionsEnterprizeTest() {

        open("https://github.com");
        $(".header-menu-wrapper").$(byText("Solutions")).click();
        $(".border-bottom").$(byText("Enterprise")).click();
        $(".eyebrow-banner").sibling(1).shouldHave(text("Build like the best"));
    }
}
