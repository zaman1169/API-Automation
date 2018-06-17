package com.qa.rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {

		@Test
		
		public void Test1() {
			
			RequestSpecification request=RestAssured.given();
								
			Response response=request.get("https://reqres.in/api/users");
			int code=response.getStatusCode();
			System.out.println(code);
			Assert.assertEquals(code, 200);
		}
	}	
	
	
	

