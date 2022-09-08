package udin.dev;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class WitchSagaTest {

    /**
     * 
     */
    @Test
    public void villagerByYearEndPoint() {
        Response response = given().contentType(ContentType.JSON)
                .when().post("/witch/kills/6")
                .then()
                .statusCode(200).contentType(ContentType.JSON).extract().response();

        System.out.println(response.getBody().asString());
    

    }

    @Test
    public void averageKillEndPoint() {
        Response response = given().contentType(ContentType.JSON).body("[{\"personName\" : \"ahmad\", \"ageOfDeath\" : 10, \"yearOfdeath\" : 13},{\"personName\" : \"johny\", \"ageOfDeath\" : 13, \"yearOfdeath\" : 17}]").when().post("/witch/kills/average").then()
        .statusCode(200).contentType(ContentType.JSON).extract().response();

        System.out.println(response.getBody().asString());
    }

}
