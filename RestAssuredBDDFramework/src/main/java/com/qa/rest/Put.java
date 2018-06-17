package com.qa.rest;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {

	
	
@Test
	
	public void Test1() {
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json =new JSONObject();
		json.put("id", " 12 ");
		json.put("first_name", "Rachel");
		json.put("last_name", "Mark");
		
		request.body(json.toString());
		Response response=request.put("https://reqres.in/api/users/12");
		int code=response.getStatusCode();
		
		Assert.assertEquals(code, 200);
	}
}


