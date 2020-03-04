package com.herokuapp.restfulbooker;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class HealthCheckTest extends BaseTest {
	
	@Test
	public void healthCheckTest() {
		given().
			spec(spec).
		when().
			get("/ping").
		then().
			assertThat().
			statusCode(201);
	}

}
