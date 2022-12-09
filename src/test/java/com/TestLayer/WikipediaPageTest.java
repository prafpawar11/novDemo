package com.TestLayer;

import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.WikipediaPage;

public class WikipediaPageTest extends BaseClass {
	static String countrywiki;
	static String releasewiki;

	private static WikipediaPage wikipediapage;

	@Test(groups = { "wiki" }, priority = 3)
	public void captureCountry() {
		wikipediapage = new WikipediaPage();
		countrywiki = wikipediapage.capture_wiki_country();
	
	}

	@Test(groups = { "wiki" }, priority = 4)
	public void captureReleaseDate() {
		releasewiki = wikipediapage.capture_wiki_date();
	}

}
