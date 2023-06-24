package com.practice;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizeOrFullScreen {

	public static void main(String[] args) {

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int) size.getHeight();
		int width = (int) size.getWidth();
		Playwright playWright = Playwright.create();
		Browser browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser
				.newContext(new Browser.NewContextOptions().setViewportSize(width, height));

		Page page = browserContext.newPage();

		page.navigate("https://naveenautomationlabs.com/opencart/");
		Locator ele = page.locator("durga");
		Boolean validation = ele.isVisible();
		System.out.println(validation);

		// website----what is my view point

	}

}
