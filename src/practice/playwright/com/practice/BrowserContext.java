package com.practice;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContext {

	Playwright playWright;

	@Test
	public static void BrowserContext() {

		Playwright playWright = Playwright.create();
		Browser browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		com.microsoft.playwright.BrowserContext browserContext = browser.newContext();
		Page page = browserContext.newPage();
		page.navigate("https://academy.naveenautomationlabs.com/");
		System.out.println(page.url());
		System.out.println(page.title());
		page.click("text = Login"); 

		browser.close();
		playWright.close();
	}

}
