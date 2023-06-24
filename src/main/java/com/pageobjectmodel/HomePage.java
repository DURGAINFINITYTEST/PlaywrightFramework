package com.pageobjectmodel;

import com.microsoft.playwright.Page;

public class HomePage {

	private String search = "//input[@placeholder='Search']";
	private String searchIcon = "//button[@class='btn btn-default btn-lg']";
	private String Output = "//h1[normalize-space()='Search - mobile']";

	// Page constructor:

	Page page;

	public HomePage(Page page) {

		this.page = page;

	}

	// 1.String Locater

	public void doSearch(String ProductName) {

		page.fill(search, ProductName);
		page.click(searchIcon);
		page.textContent(Output);

	}

}
