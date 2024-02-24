package com.naveenvideos;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class TraceViewer7 {

	@Test
	public static void getTrace() {
		try (Playwright playwright = Playwright.create()) {
			
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext context = browser.newContext();
			
			context.tracing().start((new Tracing.StartOptions().setScreenshots(true).setSnapshots(true)));

			// Open new page
			Page page = context.newPage();
			// Go to https://naveenautomationlabs.com/opencart/
			page.navigate("https://naveenautomationlabs.com/opencart/");
			// Click text=My Account
			page.click("text=My Account");
			page.pause();
			// Click text=Register
			page.click("text=Register");

			page.fill("[placeholder=\"First Name\"]", "durga prasad");

			page.fill("[placeholder=\"Last Name\"]", "kata");

			page.fill("[placeholder=\"E-Mail\"]", "kata@gmail.com");

			page.fill("[placeholder=\"Telephone\"]", "12345789521");

			page.fill("[placeholder=\"Password\"]", "Chinna5237");

			page.fill("[placeholder=\"Password Confirm\"]", "Chinna5237");

			context.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("hello.zip")));
			
			

		}
	}

}
