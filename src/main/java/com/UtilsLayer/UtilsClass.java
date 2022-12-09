package com.UtilsLayer;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void enterValue(WebElement wb, String value) {
		if ((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.sendKeys(value);
		}

	}

	public static void click(WebElement wb) {
		if ((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.click();
		}
	}

	public static String captureValue(char[] abc) {
		String a = "";
		for (int i = 0; i < abc.length; i++) {
			if (i <= 16) {
				a = a + abc[i];
			}
		}
		return a;
	}

	public static String shortlistImdbValue(char[] c) {
		String a = "";
		for (int i = 0; i < c.length; i++) {
			if ((i < 3) || (i > 7)) {
				a = a + c[i];
			}
		}

		return a;
	}
}
