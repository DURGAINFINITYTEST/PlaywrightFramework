package com.naveenvideos;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Inspector6 {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext context = browser.newContext();

			// Open new page
			Page page = context.newPage();

			// Go to https://demo.playwright.dev/todomvc/
			page.navigate("https://demo.playwright.dev/todomvc/");

			// Go to https://demo.playwright.dev/todomvc/#/
			page.navigate("https://demo.playwright.dev/todomvc/#/");

			// Go to https://naveenautomationlabs.com/opencart/
			page.navigate("https://naveenautomationlabs.com/opencart/");

			// Click text=My Account
			page.click("text=My Account");

			// Click text=Login
			page.click("text=Login");
			// assert
			// page.url().equals("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

			// Click [placeholder="E-Mail Address"]
			page.click("[placeholder=\"E-Mail Address\"]");

			// Fill [placeholder="E-Mail Address"]
			page.fill("[placeholder=\"E-Mail Address\"]", "katakatladurgaprasad962@gmail.com");

			// Click [placeholder="Password"]
			page.click("[placeholder=\"Password\"]");

			// Press CapsLock
			page.press("[placeholder=\"Password\"]", "CapsLock");

			// Fill [placeholder="Password"]
			page.fill("[placeholder=\"Password\"]", "C");

			// Press CapsLock
			page.press("[placeholder=\"Password\"]", "CapsLock");

			// Fill [placeholder="Password"]
			page.fill("[placeholder=\"Password\"]", "Chinna@5237");

			// Click input:has-text("Login")
			page.click("input:has-text(\"Login\")");
			// assert
			// page.url().equals("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

			// Click #column-right >> text=Register
			page.click("#column-right >> text=Register");
			// assert
			// page.url().equals("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

			// Click [placeholder="First Name"]
			page.click("[placeholder=\"First Name\"]");

			// Fill [placeholder="First Name"]
			page.fill("[placeholder=\"First Name\"]", "durga");

			// Click [placeholder="Last Name"]
			page.click("[placeholder=\"Last Name\"]");

			// Fill [placeholder="Last Name"]
			page.fill("[placeholder=\"Last Name\"]", "prasad");

			// Click [placeholder="E-Mail"]
			page.click("[placeholder=\"E-Mail\"]");

			// Fill [placeholder="E-Mail"]
			page.fill("[placeholder=\"E-Mail\"]", "katakatladurgaprasad@gmail.com");

			// Click [placeholder="Telephone"]
			page.click("[placeholder=\"Telephone\"]");

			// Fill [placeholder="Telephone"]
			page.fill("[placeholder=\"Telephone\"]", "9966019169");

			// Click [placeholder="Password"]
			page.click("[placeholder=\"Password\"]");

			// Press CapsLock
			page.press("[placeholder=\"Password\"]", "CapsLock");

			// Fill [placeholder="Password"]
			page.fill("[placeholder=\"Password\"]", "C");

			// Press CapsLock
			page.press("[placeholder=\"Password\"]", "CapsLock");

			// Fill [placeholder="Password"]
			page.fill("[placeholder=\"Password\"]", "Chinna@5237");

			// Click [placeholder="Password Confirm"]
			page.click("[placeholder=\"Password Confirm\"]");

			// Press CapsLock
			page.press("[placeholder=\"Password Confirm\"]", "CapsLock");

			// Fill [placeholder="Password Confirm"]
			page.fill("[placeholder=\"Password Confirm\"]", "C");

			// Press CapsLock
			page.press("[placeholder=\"Password Confirm\"]", "CapsLock");

			// Fill [placeholder="Password Confirm"]
			page.fill("[placeholder=\"Password Confirm\"]", "Chinna@5237");

			// Fill input[name="newsletter"]
			page.fill("input[name=\"newsletter\"]", "1");

			// Click input[name="newsletter"]
			page.click("input[name=\"newsletter\"]");

			// Check input[name="agree"]
			page.check("input[name=\"agree\"]");

			// Click text=Continue
			page.click("text=Continue");
			// assert
			// page.url().equals("https://naveenautomationlabs.com/opencart/index.php?route=account/success");
		}
	}
}
