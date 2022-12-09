package com.TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.GooglePage;

@Test(groups = { "google" })
public class GooglePageTest extends BaseClass {
	private static GooglePage google;

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void searchOnGoogle() {
		google = new GooglePage();
		google.enter_search("pushpa the rise");
		google.clickOnsearch();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
