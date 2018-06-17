package com.qa.rest;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {

	@Test
	
	public void Test1() {
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json =new JSONObject();
		json.put("id", "25");
		json.put("title", " Selenium webDriver ");
		json.put("author", "learn Automation");
		
		request.body(json.toString());
		Response response=request.post("https://reqres.in/api/users");
		int code=response.getStatusCode();
		
		Assert.assertEquals(code, 201);
	}
}
