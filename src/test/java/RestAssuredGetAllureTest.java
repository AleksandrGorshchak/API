import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;



import static io.restassured.RestAssured.given;


public class RestAssuredGetAllureTest {

    String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MTRmNDY5MzkyYWE5NTAwM2Q2MDEyOGIiLCJpYXQiOjE2MzY2NjA2NzcsImV4cCI6MTYzNzI2NTQ3N30.BR8-7o_h-S04Oo3IVWOH0esS-0Agh0mYPTRpIjgL1TM";

    @Before
    public void setUp() {
        RestAssured.baseURI= "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    @DisplayName("Yandex") // имя теста
    @Description("Checking WebSite URL is very important") // описание теста
    @TmsLink("www.ya.ru") // ссылка на тест-кейс
    @Issue("www.vk.com") // ссылка на баг-репорт
    public void getMyInfoStatusCode() {
        given()
                .auth().oauth2(bearerToken)
                .get("/api/users/me")
                .then().statusCode(200);
    }


}