package com.naveenvideos;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserInvocation5 {

	Playwright playWright;

	@Test
	public static void BrowserInvocation() {

		Playwright playWright = Playwright.create();
		Browser browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		// Browser browser = playWright.chromium().launch();

		BrowserContext context = browser.newContext(
				new Browser.NewContextOptions().setRecordVideoDir(Paths.get("videos/")).setRecordVideoSize(640, 480));
		Page page = context.newPage();
		page.navigate("https://academy.naveenautomationlabs.com/");
		System.out.println(page.url());
		System.out.println(page.title());
		page.click("text = Login");

		browser.close();
		playWright.close();
	}

}
