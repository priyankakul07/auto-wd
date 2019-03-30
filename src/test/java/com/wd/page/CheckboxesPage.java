package com.wd.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage {

	WebDriver driver = null;

	static String xpathHeading = "//div[@class='example']/h3";
	final static String TXT_HEADING = "Checkboxes";

	public CheckboxesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyCheckboxesPage() {

		WebElement eleHeading = driver.findElement(By.xpath(xpathHeading));
		String actualHeading = eleHeading.getText();
		assertEquals(actualHeading, TXT_HEADING,
				"Heading " + actualHeading + " should be same as expected " + TXT_HEADING);

	}

}
