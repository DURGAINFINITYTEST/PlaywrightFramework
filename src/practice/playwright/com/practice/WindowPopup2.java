package com.practice;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowPopup2 {

	Playwright playwright;

	Browser browser;

	@Test
	public void BrowserWindow() {

		playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext context1 = browser.newContext();

		// Open new page
		Page page1 = context1.newPage();

		// Go to https://demo.playwright.dev/todomvc/
		page1.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Page popup = page1.waitForPopup(() -> {
			page1.click("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']");

		});
		popup.waitForLoadState();

		System.out.println(popup.url());
		popup.close();
		System.out.println(page1.title());
		page1.close();
	}

//		// open new blank tag
//
//		Page popup = page1.waitForPopup(() -> {
//
//			page1.click("a[target='_blank']");

//		});

}
