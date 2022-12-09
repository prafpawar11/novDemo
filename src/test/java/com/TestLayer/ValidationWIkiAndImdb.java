package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

public class ValidationWIkiAndImdb extends BaseClass {
	@Test(groups = { "validation" }, priority = 10)
	public void validateCountry() {

		Assert.assertEquals(WikipediaPageTest.countrywiki, ImdbPageTest.countryibmdb);
	}

	@Test(groups = { "validation" }, priority = 11)
	public void validateReleaseDate() {
		char[] imdbdate = ImdbPageTest.releaseimdb.toCharArray();
		String a = UtilsClass.captureValue(imdbdate);
		char c[] = a.toCharArray();
		Assert.assertEquals(WikipediaPageTest.releasewiki, UtilsClass.shortlistImdbValue(c));
	}
}
