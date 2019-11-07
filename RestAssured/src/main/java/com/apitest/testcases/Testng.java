package com.apitest.testcases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	
	@Test
	public void test()
	{
		System.out.println("inside test1");
		
	}
	
	
	@Test
public void test2()
{
	
	System.out.println("inside test 2");
}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Afyter method");
	}
	
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class ");
	}
	
	

}
