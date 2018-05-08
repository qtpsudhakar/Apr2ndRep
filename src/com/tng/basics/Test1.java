package com.tng.basics;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeTest
	public void bt1() {
		System.out.println("this is before test");
	}
	@BeforeSuite
	public void bs1() {
		System.out.println("this is before suite");
	}
  @Test(priority=1)
  public void t1() {
	  System.out.println("this is t1 method");
  }
  @Test(groups="smoke")
  public void t2() {
	  System.out.println("this is t2 method");
  }
}
