package herokuapp;

import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HerokuappTests {

    //Не работает через actions
    @Test
    void herokuappActionsTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().build().perform();;
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

    //Работает через DragAndDrop и DragAndDropTo
    @Test
    void herokuappDragAndDropTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

    @Test
    void herokuappDragAndDropToTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}