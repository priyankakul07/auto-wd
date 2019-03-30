package com.wd.test;

import org.testng.annotations.Test;

import com.wd.page.CheckboxesPage;
import com.wd.page.WelcomePage;
import com.wd.utility.Init;

public class CheckboxesTest extends Init {

	@Test
	public void testCheckboxesPage() {

		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickOnLinkUsingXpath("Checkboxes");

		CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
		checkboxesPage.verifyCheckboxesPage();

		System.out.println();

	}

}
