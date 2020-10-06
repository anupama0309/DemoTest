package com.cjc;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostDemo 
{
  @Test
  public void postTest()
  {
	  RequestSpecification rs=RestAssured.given();
	  rs.header("Content-type","application/json");
	  
	  JSONObject json=new JSONObject();
	  json.put("name", "cjccjc");
	  json.put("job", "Pune");
	  
	  rs.body(json.toJSONString());
	  Response rsp=rs.post("https://reqres.in/api/users");
	  
	  int stcode=rsp.getStatusCode();
	  System.out.println(stcode);
	  
	  Assert.assertEquals(stcode, 201);
	  
  }
  @Test
  public void putTest()
  {
	  RequestSpecification rs=RestAssured.given();
	  rs.header("Content-type","application/json");
	  
	  JSONObject json=new JSONObject();
	  json.put("name", "cjccjc");
	  json.put("job", "Pune");
	  
	  rs.body(json.toJSONString());
	  Response rsp=rs.put("https://reqres.in/api/users/2");
	  
	  int stcode=rsp.getStatusCode();
	  System.out.println(stcode);
	  
	  Assert.assertEquals(stcode, 200);
	  
  }
  @Test
  public void deleteTest()
  {
	  RequestSpecification rs=RestAssured.given();
	  
	  Response rsp=rs.delete("https://reqres.in/api/users/2");
	  
	  int stcode=rsp.getStatusCode();
	  System.out.println(stcode);
	  
	  Assert.assertEquals(stcode, 200);
	  
  }
	
}
