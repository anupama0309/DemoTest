package com.cjc;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class API_Auth
{
	@Test
  public void testmethod()
  {
	  int stcode=RestAssured.given().auth().basic("ToolsQA", "TestPassword").
			  when().get("http://restapi.demoqa.com/authentication/CheckForAuthentication").getStatusCode();
	  
	
	  System.out.println(stcode);
	  
	  Assert.assertEquals(stcode, 200);
	  
  }
}
