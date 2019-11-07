package com.apitest.testcases;
import org.testng.annotations.*;

public class Testngannoaions2 {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before Suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test  ");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass2" );
	}
	
	@Test
	public void test3()
	{
		System.out.println("inside test3 ");
	}

	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afetrclass2" );
	}
	
	
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Aftyer suite");
	}
}
