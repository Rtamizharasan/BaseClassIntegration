package org.base;

import java.io.IOException;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Screenshotanatation extends Base1 {
	@Rule
	
	public TestName test = new TestName();

	@BeforeClass
	public static void launching() {

		launch("https://adactinhotelapp.com/");
	}

	@Before
	public void before() throws IOException {

		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void tc01() {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("tamilarasan607");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Tamilarasan607@");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@Test
	public void tc02() {

		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(1);
	}

	@After
	public void after() throws IOException {

		Date date = new Date();
		System.out.println(date);
		String methodName = test.getMethodName();
		takeScreenShot(methodName);
	}

	@AfterClass
	public  static void afterClass() {
		driver.quit();
	}

}
