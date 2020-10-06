package com.cjc;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo 
{
     @Test
	public void getDetails()
	{
		RestAssured.baseURI="https://reqres.in/api/unknown";
		
		RequestSpecification rs= RestAssured.given();
		Response res=RestAssured.request(Method.GET,"/2");
		
		res.contentType();
		
		String bodyresponse =res.getBody().asString();
		System.out.println("Body Data"+bodyresponse);
		
		int status = res.getStatusCode();
		Assert.assertEquals(status, 200);
		
		System.out.println(status);
		
		String statusline=res.getStatusLine();
		System.out.println(statusline);
		
		System.out.println(res.getHeaders());
	}
	
	
	
}
