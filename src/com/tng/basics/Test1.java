package com.tng.basics;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeTest
	public void bt1() {
		System.out.println("this is before test");
		System.out.println("this is change1");
	}
	@BeforeSuite
	public void bs1() {
		System.out.println("this is before suite");
		System.out.println("this is change2");
		System.out.println("this is change3");
	}
  @Test(priority=1)
  public void t1() {
	  System.out.println("this is t1 method");
	  System.out.println("this is a change in remote");
  }
  @Test(groups="smoke")
  public void t2() {
	  System.out.println("this is t2 method");
  }
}
