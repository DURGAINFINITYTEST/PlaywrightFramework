package com.practice;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SetRecord {

	public static void main(String[] args) {

		Playwright playWright = Playwright.create();
		Browser browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser.newContext(
				new Browser.NewContextOptions().setRecordVideoDir(Paths.get("myvideo/")).setRecordVideoSize(640, 480));
		Page page = browserContext.newPage();

		page.navigate("https://naveenautomationlabs.com/opencart/");
		// TODO Auto-generated method stub

		browserContext.close();

	}

}
