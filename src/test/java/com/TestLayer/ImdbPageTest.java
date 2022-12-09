package com.TestLayer;

import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.GoogleSearchPage;
import com.PageLayer.ImdbPage;

public class ImdbPageTest extends BaseClass {
	static String countryibmdb;
	static String releaseimdb;

	private static GoogleSearchPage search;
	private static ImdbPage imdbpage;

	@Test(groups = { "imdb" }, priority = 3)
	public void clickonImdb() {
		driver.navigate().back();
		search = new GoogleSearchPage();
		search.clickOnimdb();
	}

	@Test(groups = { "imdb" }, priority = 4)
	public void captureCountry() {
		imdbpage = new ImdbPage();

		countryibmdb = imdbpage.capture_imdb_country();
	}

	@Test(groups = { "imdb" }, priority = 5)
	public void captureReleaseDate() {
		releaseimdb = imdbpage.capture_imdb_date();
	}

}
