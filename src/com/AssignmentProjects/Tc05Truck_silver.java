package com.AssignmentProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc05Truck_silver {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sampleapp.tricentis.com/101/index.php#");
		
		driver.findElement(By.linkText("Truck")).click();
		
		// Vehical Data
		
		new Select(driver.findElement(By.xpath("//*[@id=\"make\"]"))).selectByIndex(15);
		driver.findElement(By.id("engineperformance")).sendKeys("1500");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("6/15/2022");
		new Select(driver.findElement(By.id("numberofseats"))).selectByIndex(3);
		new Select(driver.findElement(By.id("fuel"))).selectByIndex(2);
		driver.findElement(By.id("payload")).sendKeys("650");
		driver.findElement(By.id("totalweight")).sendKeys("18500");
		driver.findElement(By.id("listprice")).sendKeys("75000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("MH36BE5698");
		driver.findElement(By.id("annualmileage")).sendKeys("89000");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		// Insurant Data/ Personal Details
		
		driver.findElement(By.id("firstname")).sendKeys("Tony");
		driver.findElement(By.id("lastname")).sendKeys("Stark");
		driver.findElement(By.id("birthdate")).sendKeys("4/4/1965");
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]")).click();
		driver.findElement(By.id("streetaddress")).sendKeys("Walkers Street");
		new Select(driver.findElement(By.id("country"))).selectByIndex(1);
		driver.findElement(By.id("zipcode")).sendKeys("442589");
		driver.findElement(By.id("city")).sendKeys("Nagpur");
		new Select(driver.findElement(By.id("occupation"))).selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]")).click();
		driver.findElement(By.id("nextenterproductdata")).click();

		// Rating & Insurance
		driver.findElement(By.id("startdate")).sendKeys("10/1/2023");
		new Select(driver.findElement(By.id("insurancesum"))).selectByIndex(2);
		new Select(driver.findElement(By.id("damageinsurance"))).selectByIndex(3);
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]")).click();
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		// Select price Option
		
		String exp_price = "812.00", act_price, 
		exp_onlineclaim = "No", act_onlineclaim;
		
		act_price = driver.findElement(By.id("selectsilver_price")).getText();
		act_onlineclaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
		
		//Price per Year
		if(exp_price.equals(act_price))
			{
			System.out.println("Price is matching");
			}
		else
		{
			System.out.println("Price not Matching");
		}
		
		//Online Claim
		if(exp_onlineclaim.equals(act_onlineclaim))
		{
		  System.out.println("Claim is matching");
		}
	    else
	    {
		  System.out.println("Claim not Matching");
	    }
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("selectsilver"))).click().perform();
		
		driver.findElement(By.id("nextsendquote")).click();
		
		// Contact details
		
		driver.findElement(By.id("email")).sendKeys("Test123@gmail.com");
		driver.findElement(By.name("Username")).sendKeys("tonystark4465");
		driver.findElement(By.id("password")).sendKeys("TonyStark441965");
		driver.findElement(By.id("confirmpassword")).sendKeys("TonyStark441965");
		driver.findElement(By.id("Comments")).sendKeys("No comments");
		driver.findElement(By.id("sendemail")).click();
		
		// display success message
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/h2")).getText());
	    driver.findElement(By.className("confirm")).click();
	    driver.findElement(By.id("backmain")).click();	
		
	}

}
