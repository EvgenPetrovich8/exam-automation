package automation.page.object;


import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;


import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public HomePage clickOwnersAll(){
        $(byText("Owners")).click();
        $(byText("All")).click();
        return new HomePage();
    }
}
