package com.apitest.testcases;


import static org.testng.Assert.assertEquals;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test {

	@Test
	void resassured(){
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";

	//Response resp=	RestAssured.get("https://ergast.com/api/f1/drivers.json");
	
	//System.out.println(resp.body().asString());
		
// JSONArray json= new JSONArray(resp.body().asString()) ;
// JSONObject js=json.getJSONObject(1);
// System.out.println(js.getInt("id"));
		
		
		RequestSpecification rs=RestAssured.given();
		Response response=rs.request(Method.GET,"/Delhi");
		String str=response.getBody().asString();
		int code=response.statusCode();
		
		System.out.println(str);
		
		JsonPath jsonp=response.jsonPath();
		
		System.out.println(jsonp.getString("City"));
		
		Assert.assertEquals(code, 200);
		
	}

}
