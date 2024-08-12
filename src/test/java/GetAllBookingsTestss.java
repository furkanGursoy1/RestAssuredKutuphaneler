import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetAllBookingsTestss {
    //Cagrı yap
    //response controlü
    @Test
    public void getgoogle() {
        RestAssured.useRelaxedHTTPSValidation();
        given()
                .when()
                .get("https://www.google.com.tr/")
                .then()
                .log().all()
                .statusCode(200);

    }

    @Test
    public void getGoogleAlternative() {

    }
}
