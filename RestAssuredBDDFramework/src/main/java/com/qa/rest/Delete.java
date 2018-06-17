package com.qa.rest;


	import org.json.JSONObject;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class Delete {
		@Test
		
		public void Test1() {
			
			RequestSpecification request=RestAssured.given();
								
			Response response=request.delete("https://reqres.in/api/users/12");
			int code=response.getStatusCode();
			
			Assert.assertEquals(code, 204);
		}
	}

	
	
	

