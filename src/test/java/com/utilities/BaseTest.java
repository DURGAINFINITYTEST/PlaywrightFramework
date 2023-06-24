package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest {

	Playwright playwright;

	Browser browser;

	BrowserContext browserContext;

	public Page page;

	public Page initBrowser() throws Exception {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\katak\\eclipse-workspace\\PlaywrightPOM\\src\\test\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		playwright = Playwright.create();

		switch (browserName.toLowerCase()) {
		case "chromium":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "firfox":
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "safari":
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "chrome":
			browser = playwright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false));
			break;

		default:
			System.out.println("please pass the right browsername");
			break;
		}

		browserContext = browser.newContext();
		page = browserContext.newPage();
		page.navigate(prop.getProperty("url"));

		return page;

	}

	@BeforeTest
	public void setup() throws Exception {

		page = initBrowser();

	}

	@AfterTest
	public void tearDown() {

		page.context().browser().close();
	}

}
