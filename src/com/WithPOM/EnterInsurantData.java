package com.WithPOM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class EnterInsurantData {
	WebDriver driver;

	public EnterInsurantData(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String first) {
		driver.findElement(By.id("firstname")).sendKeys(first);
	}

	public void enterLastName(String last) {
		driver.findElement(By.id("lastname")).sendKeys(last);
	}

	public void selectDob(String dob) {
		driver.findElement(By.id("birthdate")).sendKeys(dob);
	}

	public void selectGender(String gender) {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]")).click();
	}

	public void selectCountry(String country) {
		new Select(driver.findElement(By.id("country"))).selectByVisibleText(country);
	}

	public void enterZipCode(String zipcode) {
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);
	}

	public void selectOccupation(String occupation) {
		new Select(driver.findElement(By.id("occupation"))).selectByVisibleText(occupation);
	}

	public void selectHobbies(String hobbies) {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")).click();
	}

	public void clickNextButton() {
		driver.findElement(By.id("nextenterproductdata")).click();
	}
}
