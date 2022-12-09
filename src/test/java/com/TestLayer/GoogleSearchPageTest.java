package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.GoogleSearchPage;

@Test(dependsOnGroups = { "google" })
public class GoogleSearchPageTest extends BaseClass {
	private static GoogleSearchPage search;

	@Test(groups = { "wiki", "imdb" }, priority = 1)
	public void verifyGoogleSearchPageTitle() {
		search = new GoogleSearchPage();
		Assert.assertEquals(true, search.captureGoogleTitle().contains("ushpa"));
	}

	@Test(groups = { "wiki" }, priority = 2)
	public void clickonWiki() {
		search = new GoogleSearchPage();
		search.clickOnwiki();

	}

}
