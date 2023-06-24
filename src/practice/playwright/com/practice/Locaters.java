package com.practice;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Locaters {

	Playwright playwright;

	Browser browser;

	@Test
	public void Locaters() {

		playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext context1 = browser.newContext();

		// Open new page
		Page page1 = context1.newPage();

		// Go to https://demo.playwright.dev/todomvc/
		page1.navigate("https://www.orangehrm.com/en/contact-sales/");
		page1.waitForLoadState();
		page1.locator(
				"//a[@href='/en/contact-sales/']//button[@class='btn btn-ohrm btn-free-demo'][normalize-space()='Contact Sales']")
				.click();

	}
}
