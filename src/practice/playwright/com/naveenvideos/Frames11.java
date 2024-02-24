package com.naveenvideos;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Frames11 {

	public static void main(String[] args) {
		/*
		 * A Page can have one or more Frame objects attached to it. Each page has a
		 * main frame and page-level interactions (like click) are assumed to operate in
		 * the main frame.
		 * 
		 * A page can have additional frames attached with the iframe HTML tag. These
		 * frames can be accessed for interactions inside the frame.
		 * 
		 * // Locate element inside frame
		 */
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
		page.navigate("http://www.londonfreelance.org/courses/frames/index.html");
		// ONEWAY
		String parentFrame = page.frame("main").locator("h2").textContent();

		System.out.println(parentFrame);

		String parentFrame1 = page.frame("navbar").locator("//body/p[4]/a").textContent();

		System.out.println(parentFrame1);
 
	}

}
