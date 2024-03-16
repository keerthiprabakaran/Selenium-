package org.Create;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest1 extends BaseClass1 {
	@Test(priority = 6)
	private void tc6() {
		launchUrl("https://www.amazon.in/");
		

	}
	@Test
	private void tc7() {
		launchUrl("https://www.facebook.com/");

	}
	@Test(priority = -15)
	private void tc8() {
		launchUrl("https://www.flipkart.com/");
		

	}
	@Test(priority = -2)
	private void tc9() {
		launchUrl("https://www.snapdeal.com/");

	}
	@Test(priority = 24)
	private void tc10() {
		launchUrl("https://www.youtube.com/");

	}
	@Test(priority = -2)
	private void tc11() {
		launchUrl("https://lh.inmakesedu.com/home");
		

	}
	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		maxi();
	}
	@AfterClass
	private void closeTheBrowser() {
		System.out.println("Browser Close");
	}
}
