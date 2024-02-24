package com.docPractice;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Second {

	@Test(priority = 1)
	public void DrapandDrop() {
		// for skip headless by writing like this we can also skip headless mode
		// execution +screenshot

		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.webkit()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
			Page page = browser.newPage();
			page.navigate("https://www.globalsqa.com/demo-site/draganddrop/");
			
			page.locator(".btn.btn-ohrm.btn-contact-sales").first().click();

			
		}
	}

}
