package com.naveenvideos;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Invocation4 {

	Playwright playWright;

	public static void main(String[] args) {

		Playwright playWright = Playwright.create();
		Browser browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser.newContext();
		Page page = browserContext.newPage();

		page.navigate("https://naveenautomationlabs.com/opencart/");
		System.out.println(page.url());
		System.out.println(page.title());

		browser.close();
		playWright.close();
	}

}
