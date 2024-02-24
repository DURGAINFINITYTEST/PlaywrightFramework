package com.naveenvideos;

import com.microsoft.playwright.*;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDom12 {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext();

		Page page = context.newPage();

		page.navigate("https://books-pwakit.appspot.com/");

		page.locator("book-app[apptitle='BOOKS'] input#input").fill("testing books");

	}

}
/*
 * import com.microsoft.playwright.*;
 * 
 * public class ShadowDom12 {
 * 
 * public static void main(String[] args) {
 * 
 * Playwright playwright = Playwright.create(); Browser browser =
 * playwright.chromium().launch(new
 * BrowserType.LaunchOptions().setHeadless(false)); BrowserContext context =
 * browser.newContext(); Page page = context.newPage();
 * 
 * page.navigate("https://books-pwakit.appspot.com/");
 * 
 * page.querySelector("book-app[apptitle='BOOKS'] >> css=#input").
 * fill("testing books");
 * 
 * // Rest of your code...
 * 
 * } }
 */