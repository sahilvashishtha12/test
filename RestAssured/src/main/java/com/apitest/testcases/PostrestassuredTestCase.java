package com.apitest.testcases;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apitest.base.BaseClass;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostrestassuredTestCase extends BaseClass {
	
	@Test(dataProvider="empdataprovider")
	void postTest(String name,String salary, String age)
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		rs=RestAssured.given();
		
		JSONObject jo=new JSONObject();
		jo.put("name", name);
		jo.put("salary", salary);
		jo.put("age", age);

		
		rs.body(jo.toJSONString());
		rs.headers("Content-Type","application/json");
		
		resp=rs.request(Method.POST,"/create");
		
		System.out.println(resp.getBody().asString());
		 
	}
	
	
	@DataProvider(name="empdataprovider")
	String[][] prviderdata() throws IOException
	{
		String path="C:/Users/SAHIL/eclipse-workspace/Test/src/main/resources/test.xlsx";
		int rowcount=XLUtils.getRowCount(path, "sheet");
		int colcount=XLUtils.getCellCount(path, "sheet", 1);
			System.out.println(colcount);	
		
		String empdata[][]= new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				empdata[i-1][j]=XLUtils.getCellData(path,"sheet", i, j);
			}
		}
		//String empdata[][]= { {"sahilxyz","2763726","23"} ,{"vaishalixyz","2763746","45"}  }; --data using string array
		return empdata;
	}

}
