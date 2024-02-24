package com.naveenvideos;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelector10 {

	public static void main(String[] args) {

		// BY USING TEXT CONTENT

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext();

		Page page = context.newPage();

		page.navigate("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		String text = page.locator("div.card-body h2:has-text('New Customer')").textContent(); // ----------------------2WAY

		System.out.println(text);

		String text1 = page.locator("'Returning Customer'").textContent();// ----------------------3 WAY
		System.out.println(text1);

		// we can also use first() method

		// can we use text for button
		String text2 = page.locator("text=Continue").textContent();// ----------------------4th for BUTTON
		System.out.println(text2);

		//when ever we are using has text we put free braces
		page.locator("from button:has-text('Login')").click();// ----------------------5th for BUTTON

		context.close();
		playwright.close();

	}
}
