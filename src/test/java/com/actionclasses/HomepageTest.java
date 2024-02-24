package com.actionclasses;

import java.util.Properties;

import org.testng.annotations.Test;

import com.pageobjectmodel.HomePage;
import com.utilities.BaseTest;

public class HomepageTest extends BaseTest {
	Properties pro;

	@Test
	public void homePageSearch() {

		HomePage homePage = new HomePage(page);

		homePage.doSearch(pro.getProperty("search"));

	}

}
