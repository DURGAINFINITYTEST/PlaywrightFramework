package com.docPractice;

import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.util.regex.Pattern;

public class HeadLessAndHeadAndScreenshots {
	@Test(priority = 1)
	public void first() {
		// for default headless +screenshot
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.webkit().launch();
			Page page = browser.newPage();
			page.navigate("https://www.orangehrm.com/en/contact-sales/");
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("orange.png")));
		}
	}

	@Test(priority = 2)
	public void Second() {
		// for skip headless by writing like this we can also skip headless mode
		// execution +screenshot

		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.webkit()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
			Page page = browser.newPage();
			page.navigate("https://www.orangehrm.com/en/contact-sales/");
			// screenshot
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("orange.png")));
		}
	}

	@Test(priority = 3)
	public void Three() {
		// for skip headless by writing like this we can also skip headless mode
		// execution +screenshot

		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.webkit()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
			Page page = browser.newPage();
			page.navigate("https://www.orangehrm.com/en/contact-sales/");
			// validations
			System.out.println(page.title());
			Assert.assertEquals(page.title(), "Contact OrangeHRM | OrangeHRM");

			
			//another way assertions
			
			/*
			 * import java.util.regex.Pattern; import static
			 * com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
			 * 
			 * assertThat(page).hasTitle(Pattern.compile("Playwright"));
			 */
		}
	}
}