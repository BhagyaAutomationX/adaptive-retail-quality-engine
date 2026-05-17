package tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class CustomerServiceValidationTest {

    @Test
    public void validateCustomerServiceAvailability() {

        given()

        .when()

        .get("https://jsonplaceholder.typicode.com/users")

        .then()

        .statusCode(200);

        System.out.println(
                "Customer service API validation completed successfully");
    }
}