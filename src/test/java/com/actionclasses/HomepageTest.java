package com.actionclasses;

import java.util.Properties;

import org.testng.annotations.Test;

import com.pageobjectmodel.Constant;
import com.pageobjectmodel.HomePage;
import com.utilities.BaseTest;

public class HomepageTest extends BaseTest {
	Properties pro;

	@Test
	public void homePageSearch() {

		System.out.println(Constant.MY_NAME);

		HomePage homePage = new HomePage(page);

		homePage.doSearch(pro.getProperty("search"));

	}

}
