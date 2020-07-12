package automation;

import automation.page.object.NewOwnerPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import automation.page.object.HomePage;
import automation.page.object.OwnersPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OwnersAllTest extends  TestBase{

    private HomePage homepage = new HomePage();
   private OwnersPage ownerspage = new OwnersPage();
    private NewOwnerPage newownerpage = new NewOwnerPage();

    @BeforeClass
    public void setUp() {open(Configuration.baseUrl);}

    @Test
    public void OwnersAllPageOpen() {
        homepage.clickOwnersAll();
        $(byText("Owners")).shouldBe(visible);

    }

    @Test
    public void AddOwnerButton() {
        homepage.clickOwnersAll();
        ownerspage.clickAddOwner();
        $(byText("New Owner")).shouldBe(visible);
        $(byText("First Name")).shouldBe(visible);
        $(byText("Last Name")).shouldBe(visible);
        $(byText("Address")).shouldBe(visible);
        $(byText("City")).shouldBe(visible);
        $(byText("Telephone")).shouldBe(visible);

    }

     @Test
     public void FillAndAddOwner() {

          String firstName = "Тесток";
         String  lastName ="Тестовый";
         String  address ="ул Тестовая";
         String  city ="Днепр";
         String telephone ="380679006030";

         homepage.clickOwnersAll();
         ownerspage.clickAddOwner();
         newownerpage.addUser(firstName,lastName,address,city,telephone);
//         $(byText("New Owner")).shouldBe(visible);
//         $(byText("First Name")).shouldBe(visible);
//         $(byText("Last Name")).shouldBe(visible);
//         $(byText("Address")).shouldBe(visible);
//         $(byText("City")).shouldBe(visible);
//         $(byText("Telephone")).shouldBe(visible);

     }


//
}
