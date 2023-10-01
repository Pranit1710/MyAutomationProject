package com.WithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterPriceList {
	WebDriver driver;

	public EnterPriceList(WebDriver driver) {
		this.driver = driver;
	}

	String act_price, act_onlineclaim;

	public void EnterPricePerYear() {
		act_price = driver.findElement(By.id("selectsilver_price")).getText();
	}

	public void EnterActualClaim() {
		act_onlineclaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
	}

	public void SelectPriceOption(String exp_price, String exp_onlineclaim) {
		// Price per Year
		if (exp_price.equals(act_price)) {
			System.out.println("Price is matching");
		} else {
			System.out.println("Price not Matching");
		}

		// Online Claim
		if (exp_onlineclaim.equals(act_onlineclaim)) {
			System.out.println("Claim is matching");
		} else {
			System.out.println("Claim not Matching");
		}

		Actions act = new Actions(driver);
		// act.moveToElement(driver.findElement(By.id("selectsilver"))).click().perform();
		act.click(driver.findElement(By.id("selectsilver"))).perform();
	}

	public void ClickNextButton() {
		driver.findElement(By.id("nextsendquote")).click();
	}

	public void CheckPrice(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover, String Type) {
		String ActPrice, ActOnlClaim, ActClaimDisc, ActWWCover;

		switch (Type) {
		case "Silver":
			ActPrice = driver.findElement(By.id("selectsilver_price")).getText();
			ActOnlClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
			ActClaimDisc = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText();
			ActWWCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
			if (ActPrice.equals(ExpPrice))
				System.out.println("Price is matching");
			else
				System.out.println("Price not matching");

			if (ActOnlClaim.equals(ExpOnlClaim))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			if (ActClaimDisc.equals(ExpClaimDisc))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			if (ActWWCover.equals(ExpWWCover))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			Actions act = new Actions(driver);
			act.click(driver.findElement(By.id("selectsilver"))).perform();
			break;

		case "Gold":
			ActPrice = driver.findElement(By.id("selectgold_price")).getText();
			ActOnlClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")).getText();
			ActClaimDisc = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")).getText();
			ActWWCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
			if (ActPrice.equals(ExpPrice))
				System.out.println("Price is matching");
			else
				System.out.println("Price not matching");

			if (ActOnlClaim.equals(ExpOnlClaim))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			if (ActClaimDisc.equals(ExpClaimDisc))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			if (ActWWCover.equals(ExpWWCover))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			act = new Actions(driver);
			act.click(driver.findElement(By.id("selectgold"))).perform();
			break;

		case "Platinum":
			ActPrice = driver.findElement(By.id("selectplatinum_price")).getText();
			ActOnlClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[4]")).getText();
			ActClaimDisc = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[4]")).getText();
			ActWWCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[4]")).getText();
			if (ActPrice.equals(ExpPrice))
				System.out.println("Price is matching");
			else
				System.out.println("Price not matching");

			if (ActOnlClaim.equals(ExpOnlClaim))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			if (ActClaimDisc.equals(ExpClaimDisc))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			if (ActWWCover.equals(ExpWWCover))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			act = new Actions(driver);
			act.click(driver.findElement(By.id("selectplatinum"))).perform();
			break;

		case "Ultimate":
			ActPrice = driver.findElement(By.id("selectultimate_price")).getText();
			ActOnlClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[5]")).getText();
			ActClaimDisc = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[5]")).getText();
			ActWWCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[5]")).getText();
			if (ActPrice.equals(ExpPrice))
				System.out.println("Price is matching");
			else
				System.out.println("Price not matching");

			if (ActOnlClaim.equals(ExpOnlClaim))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			if (ActClaimDisc.equals(ExpClaimDisc))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			if (ActWWCover.equals(ExpWWCover))
				System.out.println("claim matching");
			else
				System.out.println("online claim not matching");

			act = new Actions(driver);
			act.click(driver.findElement(By.id("selectultimate"))).perform();
			break;

		}

	}

}
