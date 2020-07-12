package automation.page.object;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byId;

public class NewOwnerPage {

    public NewOwnerPage addUser(String firstName, String lastName, String address, String city, String telephone) {
        inputFirstName(firstName);
        inputLastName(lastName);
        inputAdress(address);
        inputCity(city);
        inputTelephone(telephone);
        return clickAddOwnerButton();
    }
    public void inputFirstName(String firstName) {
        System.out.println("Input firstName");
        $(byId("firstName")).setValue(firstName);
    }

    public void inputLastName (String lastName) {
        System.out.println("Input lastName");
        $(byId("lastName")).setValue(lastName);
    }

    public void inputAdress (String address) {
        System.out.println("Input address");
        $(byId("address")).setValue(address);
    }

    public void inputCity (String city) {
        System.out.println("Input city");
        $(byId("city")).setValue(city);
    }

    public void inputTelephone (String telephone) {
        System.out.println("Input telephone");
        $(byId("telephone")).setValue(telephone);
    }

    public NewOwnerPage clickAddOwnerButton() {
        System.out.println("clickAddOwnerButton");
        $(".btn-default").click();
        return new NewOwnerPage();
    }

}
