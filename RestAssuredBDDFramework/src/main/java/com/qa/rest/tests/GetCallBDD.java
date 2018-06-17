package com.qa.rest.tests;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GetCallBDD {

	
	@Test
	public void test_numblerOfCircuitsFor2017_Session() {
		
		//given().
		//when().
		//then().
		//assert()
		
		/*given().
		when().
		get("http://ergast.com/api/f1/2017/circuits.json").
			then().
			assertThat().
			statusCode(200).
			and().
			body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
		    and().
		    header("content-length",equalTo("4551"));*/
		
		given().
		when().
		get("http://jsonplaceholder.typecode.com/posts/3").
			then().
			assertThat().
			statusCode(200);
		
		given().
		when().
		get("http://services.groupkt.com/country/get/iso?code/in").
			then().
			assertThat().
			statusCode(200).
			log().all();	
		
		/*given().
		when().
		get("http://services.groupkt.com/country/get/iso?code/us").
			then().
		body("RestRespose.result.name",equalTo("United States of America"));
			
		
		given().
		when().
		get("http://services.groupkt.com/country/get/all").
			then().
			assertThat().
			body("RestResponse.result.name",hasItems("Afghanistan","Argentina","Australia"));
	*/	
		
	}
	
	@Test
	public void testSingleContent() {
	given().
	get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10/").
	then().
    
	body("CUSTOMER.FIRSTNAME",equalTo("Sue")).body("CUSTOMER.LASTNAME",equalTo("Fuller")).
	body("CUSTOMER.STREET",equalTo("135 upland pl")).body("CUSTOMER.CITY",equalTo("dallas"));
		
	}

	
	}
	
	

