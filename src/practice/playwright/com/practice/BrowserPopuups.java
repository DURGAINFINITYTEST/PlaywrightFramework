package com.practice;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserPopuups {
	Playwright playwright;

	Browser browser;

	@Test
	public void BrowserWindow() {

		playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext context1 = browser.newContext();

		BrowserContext context2 = browser.newContext();

		// Open new page
		Page page1 = context1.newPage();
		Page page2 = context2.newPage();

		// Go to https://demo.playwright.dev/todomvc/
		page1.navigate("https://demo.playwright.dev/todomvc/");

		// Go to https://demo.playwright.dev/todomvc/#/
		page2.navigate("https://naveenautomationlabs.com/opencart/");
	}
}