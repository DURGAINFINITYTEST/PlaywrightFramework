package com.naveenvideos;

import java.util.List;
import java.util.zip.Deflater;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Locaters9 {

	Playwright playwright;

	Browser browser;

	@Test
	public void Locaters() {

		playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext context1 = browser.newContext();

		// Open new page
		Page page1 = context1.newPage();

		// Go to https://demo.playwright.dev/todomvc/
		page1.navigate("https://www.orangehrm.com/en/contact-sales/");
		page1.waitForLoadState();
		page1.locator(
				"//a[@href='/en/contact-sales/']//button[@class='btn btn-ohrm btn-free-demo'][normalize-space()='Contact Sales']")
				.click();

		// sometimes mutliple element will apper so that time write a method like
		// first() we can click on that one

		page1.locator(
				"//a[@href='/en/contact-sales/']//button[@class='btn btn-ohrm btn-free-demo'][normalize-space()='Contact Sales']")
				.first().click();

		// count
		Locator loc = page1.locator(
				"//a[@href='/en/contact-sales/']//button[@class='btn btn-ohrm btn-free-demo'][normalize-space()='Contact Sales']");
		int coun = loc.count();
		System.out.println(coun);

		// how to write multiple locaters
		Locator countryElements = page1.locator("list of countrys");

		// Using for loop
		for (int i = 0; i < countryElements.count(); i++) {
			String countryText = countryElements.nth(i).textContent();

			System.out.println(countryText);
		}

		// Using forEach loop
		//allTextContents();---it will give the list of String 

		List<String> allList = countryElements.allTextContents();

		for (String element : allList) {

			System.out.println(element);

		}
		
		//Streams
		allList.stream().forEach(ele->System.out.println(ele));
		

		browser.close();
		
		
		//Streams
		

	}
}
