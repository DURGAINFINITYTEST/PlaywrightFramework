package com.practice;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayWrightInspector {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext context = browser.newContext();

			// Open new page
			Page page = context.newPage();

			// Go to https://naveenautomationlabs.com/opencart/
			page.navigate("https://naveenautomationlabs.com/opencart/");

			// Click text=My Account
			page.click("text=My Account");
			// span[normalize-space()='My Account']

			// Click text=Login

		}
	}
}