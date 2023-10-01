package com.WithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterSendQuote {
	WebDriver driver;

	public EnterSendQuote(WebDriver driver) {
		this.driver = driver;
	}

	public void EnterEmail(String mail) {
		driver.findElement(By.id("email")).sendKeys(mail);
	}

	public void EnterPhone(String ph) {
		driver.findElement(By.id("phone")).sendKeys(ph);
	}

	public void EnteruserName(String un) {
		driver.findElement(By.id("username")).sendKeys(un);
	}

	public void EnterPassword(String ps) {
		driver.findElement(By.id("password")).sendKeys(ps);
	}

	public void EnterConfirmPassword(String cps) {
		driver.findElement(By.id("confirmpassword")).sendKeys(cps);
	}

	public void EnterComments(String cmt) {
		driver.findElement(By.id("Comments")).sendKeys(cmt);
	}

	public void ClickSendButton() {
		driver.findElement(By.id("sendemail")).click();
	}

	public void GetErrMsg() {
		WebElement msg = driver.findElement(By.xpath("/html/body/div[4]/h2"));
		System.out.println(msg.getText());
		driver.findElement(By.className("confirm")).click();
		driver.findElement(By.xpath("//*[@id=\"backmain\"]/span/i")).click();
	}

}
