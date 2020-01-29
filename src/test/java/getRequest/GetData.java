package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;


public class GetData {
  @Test
  public void validateGetTest() {
	  
	  //test get api
	  RestAssured.baseURI = "https://reqres.in/";
	  given()
	  .when()
	  .get("api/users/2")
	  .then()
	  .log().all()
	  .assertThat()
	   .statusCode(200);
	   
  }
}
