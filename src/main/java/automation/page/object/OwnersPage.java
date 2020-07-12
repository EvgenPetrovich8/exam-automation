package automation.page.object;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selectors.byAttribute;


public class OwnersPage {


    public OwnersPage clickAddOwner(){
        $(".btn-default").click();
        return new OwnersPage();
    }





}
