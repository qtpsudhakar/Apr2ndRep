package com.tng.basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class OhrmAddEmployee_Default {
	WebDriver driver;

	@BeforeClass
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		// find element timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

	}

	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();

	}

	@Test(dependsOnMethods = "login")
	public void addEmployee() {
		driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("hq");
		driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();
	}

}
