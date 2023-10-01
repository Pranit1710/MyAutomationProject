package com.WithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData {
	WebDriver driver;

	public EnterVehicleData(WebDriver driver) {
		this.driver = driver;
	}

	public void selectMake(String make) {
		new Select(driver.findElement(By.xpath("//*[@id=\"make\"]"))).selectByVisibleText(make);
	}

	public void enterCylinderCapacity(String cylinder) {
		driver.findElement(By.id("cylindercapacity")).sendKeys(cylinder);
	}

	public void selectModel(String model) {
		new Select(driver.findElement(By.id("model"))).selectByVisibleText(model);
	}

	public void enterEnginePerformance(String engperform) {
		driver.findElement(By.id("engineperformance")).sendKeys(engperform);
	}

	public void selectDom(String dom) {
		driver.findElement(By.id("dateofmanufacture")).sendKeys(dom);
	}

	public void selectNumberOfSeats(String nos) {
		new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(nos);
	}

	public void selectMotorcycleSeats(String seats) {
		new Select(driver.findElement(By.id("numberofseatsmotorcycle"))).selectByVisibleText(seats);
	}

	public void selectRHDrive(String drive) {
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]/span")).click();
	}

	public void selectFuelType(String fuel) {
		new Select(driver.findElement(By.id("fuel"))).selectByVisibleText(fuel);
	}

	public void enterPayload(String payload) {
		driver.findElement(By.id("payload")).sendKeys(payload);
	}

	public void enterTotalWeight(String weight) {
		driver.findElement(By.id("totalweight")).sendKeys(weight);
	}

	public void enterListPrice(String listprice) {
		driver.findElement(By.id("listprice")).sendKeys(listprice);
	}

	public void enterLicensePlateNumber(String license) {
		driver.findElement(By.id("licenseplatenumber")).sendKeys(license);
	}

	public void enterAnnualMileage(String mileage) {
		driver.findElement(By.id("annualmileage")).sendKeys(mileage);
	}

	public void clickNextInsurantData() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

}
