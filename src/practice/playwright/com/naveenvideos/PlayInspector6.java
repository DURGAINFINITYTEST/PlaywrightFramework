package com.naveenvideos;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayInspector6 {
	@Test
	public static void get() {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext context = browser.newContext();
			// Open new page
			Page page = context.newPage();
			// Go to https://naveenautomationlabs.com/opencart/
			page.navigate("https://naveenautomationlabs.com/opencart/");
			// Click text=My Account
			page.click("text=My Account");
			// Click text=Register
			page.click("text=Register");
			// assert
			// page.url().equals("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			// Click [placeholder="First Name"]

			page.fill("[placeholder=\"First Name\"]", "durga");

			page.fill("[placeholder=\"Last Name\"]", "prasad");

			page.fill("[placeholder=\"E-Mail\"]", "kata@gmail.com");

			page.fill("[placeholder=\"Telephone\"]", "9848022338");

			page.fill("[placeholder=\"Password\"]", "Chinna@5237");

			page.fill("[placeholder=\"Password Confirm\"]", "Chinna@5237");

			page.click("input[name=\"newsletter\"]");
			page.check("input[name=\"agree\"]");
			page.click("text=Continue");

		}
	}
}