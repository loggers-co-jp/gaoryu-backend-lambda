package jp.co.loggers.lambda;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class LambdaHandlerTest {

	Long RESTAURANT_ID = 1L;

	@Test
	public void testSimpleLambdaSuccess() throws Exception {

		given().contentType("application/json").accept("application/json").body(RESTAURANT_ID).when().post().then()
				.statusCode(200).body(notNullValue());
	}

}
