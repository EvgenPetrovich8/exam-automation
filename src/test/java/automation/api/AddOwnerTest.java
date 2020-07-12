package automation.api;

import automation.owner.Owner;
import automation.owner.OwnerApi;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class AddOwnerTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "http://46.101.230.213:9966";
        RestAssured.basePath = "petclinic/api";
        RestAssured.requestSpecification =
                new RequestSpecBuilder()
                        .setAccept(ContentType.JSON)
                        .setContentType(ContentType.JSON)
                        .log(LogDetail.ALL)
                        .build();
    }

    @Test
    public void ownerCreationTest(){
        Owner owner = new Owner();
        owner.setAddress("ул.Тестовая");
        owner.setCity("Днепр");
        owner.setFirstName("Тестовик");
        owner.setLastName("Тестовченко");

        Owner newOwner = RestAssured
        .given()
                .body(owner)
                .when()
                .post("/api/owners")
                .then()
                .statusCode(200)
                .extract().body()
                .as(OwnerApi.class)
                .getOwner();
    }
}
