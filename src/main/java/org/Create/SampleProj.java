package org.Create;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProj extends BaseClass1 {
	

private String url;
public void getEmail() {
	
}
public void getPassword() {
}



	@Test
public void tc2() {
		System.out.println("Test Case 2");
}
	@Before 
	public void startDate() {

launchBrowser();
maxi();
	}
	@After
	public void endDate() {
	closetheBrowser();
	
	}
	@BeforeClass
	public static void Browser(){
		launchBrowser();
		maxi();
}
	@AfterClass
	public static void closetheBrowser() {
		//closetheBrowser();
		
	}
	
	@Test
		public void tc3() {
			System.out.println("Test Case 3");
			launchUrl("https://www.inmakes.com/");
			
			
		}
	@Test
	public void tc4() {
		System.out.println("Test Case 4");
		launchUrl("https://www.facebook.com/");
        String title = Pagetitle();
        String Url = PageUrl();
		fbLogin s = new fbLogin();
		PassText("SeleniumInmakes", s.getVarRef());
		Assert.assertEquals("Chech Your url",url, url.contains("facebook"));
		PassText("infotech",s.getPwd());

	}
	
	
	@Test
	public void tc5() {
		System.out.println("Test Case 5");

launchUrl("https://www.flipkart.com/");
		
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://www.youtube.com/");
		
		
	}
	
	
	
}



