package com.WithPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class AllTests {
	WebDriver driver;
	EnterVehicleData evd;
	EnterInsurantData eid;
	EnterProductData epd;
	EnterPriceList pldata;
	EnterSendQuote sdata;

	@Test(dataProvider = "getAutomobileData")
	public void AutomobileTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover,
			String Type) {
		System.out.println("Testing Automobile");

		driver.findElement(By.linkText("Automobile")).click();

		// Vehicle Data
		evd.selectMake("Ford");
		evd.enterEnginePerformance("1500");
		Calendar cal = Calendar.getInstance(); // read today's date
		cal.add(Calendar.DATE, -1); // get yesterday's date
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		evd.selectDom(prvDate);
		evd.selectNumberOfSeats("5");
		evd.selectFuelType("Diesel");
		evd.enterListPrice("95000");
		evd.enterLicensePlateNumber("MH34AE8045");
		evd.enterAnnualMileage("250");
		evd.clickNextInsurantData();

		// Insurant Data
		eid.enterFirstName("Pranit");
		eid.enterLastName("Taksande");
		eid.selectDob("10/17/1996");
		eid.selectGender("male");
		eid.selectCountry("India");
		eid.enterZipCode("442987");
		eid.selectOccupation("Employee");
		eid.selectHobbies("Bungee Jumping");
		eid.clickNextButton();

		// Product Data
		epd.enterStartDate("8/16/2023");
		epd.selectInsurance("5.000.000,00");
		epd.selectMeritRating("Super Bonus");
		epd.selectDamageInsurance("Full Coverage");
		epd.selectOptionalProducts("Euro Protection");
		epd.selectCourtesyCar("Yes");
		epd.clickNextBtn();

		// PiceList
		pldata.CheckPrice(ExpPrice, ExpOnlClaim, ExpClaimDisc, ExpWWCover, Type);
		pldata.ClickNextButton();

		// SendQuote
		sdata.EnterEmail("pranit96@gmail.com");
		sdata.EnterPhone("9665114477");
		sdata.EnteruserName("pranu");
		sdata.EnterPassword("Pranit17");
		sdata.EnterConfirmPassword("Pranit17");
		sdata.EnterComments("No comments");
		sdata.ClickSendButton();
		sdata.GetErrMsg();

	}

	@Test(dataProvider = "getTruckData")
	public void TruckTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover, String Type) {
		System.out.println("Truck");

		driver.findElement(By.linkText("Truck")).click();

		// Vehicle Data
		evd.selectMake("BMW");
		evd.enterEnginePerformance("1800");
		Calendar cal = Calendar.getInstance(); // read today's date
		cal.add(Calendar.DATE, -1); // get yesterday's date
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		evd.selectDom(prvDate);
		evd.selectNumberOfSeats("4");
		evd.selectFuelType("Diesel");
		evd.enterPayload("650");
		evd.enterTotalWeight("15800");
		evd.enterListPrice("98000");
		evd.enterLicensePlateNumber("AE31AP7035");
		evd.enterAnnualMileage("280");
		evd.clickNextInsurantData();

		// Insurant Data
		eid.enterFirstName("Pranit");
		eid.enterLastName("Taksande");
		eid.selectDob("10/17/1996");
		eid.selectGender("male");
		eid.selectCountry("India");
		eid.enterZipCode("442987");
		eid.selectOccupation("Employee");
		eid.selectHobbies("Bungee Jumping");
		eid.clickNextButton();

		// Product Data
		epd.enterStartDate("8/16/2023");
		epd.selectInsurance("5.000.000,00");
		epd.selectDamageInsurance("Full Coverage");
		epd.selectOption("Euro Protection");
		epd.clickNextBtn();

		// PiceList
		pldata.CheckPrice(ExpPrice, ExpOnlClaim, ExpClaimDisc, ExpWWCover, Type);
		pldata.ClickNextButton();

		// SendQuote
		sdata.EnterEmail("pranit96@gmail.com");
		sdata.EnterPhone("9665114477");
		sdata.EnteruserName("pranu");
		sdata.EnterPassword("Pranit17");
		sdata.EnterConfirmPassword("Pranit17");
		sdata.EnterComments("No comments");
		sdata.ClickSendButton();
		sdata.GetErrMsg();

	}

	@Test(dataProvider = "getMotorcycleData")
	public void MotorcycleTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover,
			String Type) {
		System.out.println("Motorcycle");

		driver.findElement(By.linkText("Motorcycle")).click();

		// Vehicle Data
		evd.selectMake("BMW");
		evd.selectModel("Motorcycle");
		evd.enterCylinderCapacity("1000");
		evd.enterEnginePerformance("900");
		Calendar cal = Calendar.getInstance(); // read today's date
		cal.add(Calendar.DATE, -1); // get yesterday's date
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		evd.selectDom(prvDate);
		evd.selectMotorcycleSeats("2");
		evd.enterListPrice("25000");
		evd.enterAnnualMileage("100000");
		evd.clickNextInsurantData();

		// Insurant Data
		eid.enterFirstName("Pranit");
		eid.enterLastName("Taksande");
		eid.selectDob("10/17/1996");
		eid.selectGender("male");
		eid.selectCountry("India");
		eid.enterZipCode("442987");
		eid.selectOccupation("Employee");
		eid.selectHobbies("Bungee Jumping");
		eid.clickNextButton();

		// Product Data
		epd.enterStartDate("8/16/2023");
		epd.selectInsurance("5.000.000,00");
		epd.selectDamageInsurance("Full Coverage");
		epd.selectOption("Euro Protection");
		epd.clickNextBtn();
		// Thread.sleep(5000);

		// PiceList
		pldata.CheckPrice(ExpPrice, ExpOnlClaim, ExpClaimDisc, ExpWWCover, Type);
		pldata.ClickNextButton();

		// SendQuote
		sdata.EnterEmail("pranit96@gmail.com");
		sdata.EnterPhone("9665114477");
		sdata.EnteruserName("pranu");
		sdata.EnterPassword("Pranit17");
		sdata.EnterConfirmPassword("Pranit17");
		sdata.EnterComments("No comments");
		sdata.ClickSendButton();
		sdata.GetErrMsg();

	}

	@Test(dataProvider = "getCamperData")
	public void CamperTest(String ExpPrice, String ExpOnlClaim, String ExpClaimDisc, String ExpWWCover, String Type) {
		System.out.println("Camper");

		driver.findElement(By.linkText("Camper")).click();

		// Vehicle Data
		evd.selectMake("Ford");
		evd.enterEnginePerformance("1600");
		Calendar cal = Calendar.getInstance(); // read today's date
		cal.add(Calendar.DATE, -1); // get yesterday's date
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		evd.selectDom(prvDate);
		evd.selectNumberOfSeats("9");
		evd.selectRHDrive("Yes");
		evd.selectFuelType("Diesel");
		evd.enterPayload("800");
		evd.enterTotalWeight("14000");
		evd.enterListPrice("84000");
		evd.enterLicensePlateNumber("AE34BH9945");
		evd.enterAnnualMileage("4550");
		evd.clickNextInsurantData();

		// Insurant Data
		eid.enterFirstName("Pranit");
		eid.enterLastName("Taksande");
		eid.selectDob("10/17/1996");
		eid.selectGender("male");
		eid.selectCountry("India");
		eid.enterZipCode("442987");
		eid.selectOccupation("Employee");
		eid.selectHobbies("Bungee Jumping");
		eid.clickNextButton();

		// Product Data
		epd.enterStartDate("8/16/2023");
		epd.selectInsurance("5.000.000,00");
		epd.selectDamageInsurance("Full Coverage");
		epd.selectOption("Euro Protection");
		epd.clickNextBtn();

		// PiceList
		pldata.CheckPrice(ExpPrice, ExpOnlClaim, ExpClaimDisc, ExpWWCover, Type);
		pldata.ClickNextButton();

		// SendQuote
		sdata.EnterEmail("pranit96@gmail.com");
		sdata.EnterPhone("9665114477");
		sdata.EnteruserName("pranu");
		sdata.EnterPassword("Pranit17");
		sdata.EnterConfirmPassword("Pranit17");
		sdata.EnterComments("No comments");
		sdata.ClickSendButton();
		sdata.GetErrMsg();

	}

	@DataProvider
	public Object[][] getAutomobileData() {
		return (new Object[][] { new Object[] { "235.00", "No", "No", "No", "Silver" },
				new Object[] { "692.00", "Submit", "2", "Limited", "Gold" },
				new Object[] { "1,359.00", "Submit", "5", "Limited", "Platinum" },
				new Object[] { "2,590.00", "Submit", "10", "Unlimited", "Ultimate" }, });

	}

	@DataProvider
	public Object[][] getTruckData() {
		return (new Object[][] { new Object[] { "298.00", "No", "No", "No", "Silver" },
				new Object[] { "897.00", "Submit", "2", "Limited", "Gold" },
				new Object[] { "1,725.00", "Submit", "5", "Limited", "Platinum" },
				new Object[] { "3,286.00", "Submit", "10", "Unlimited", "Ultimate" }, });

	}

	@DataProvider
	public Object[][] getMotorcycleData() {
		return (new Object[][] { new Object[] { "412.00", "No", "No", "No", "Silver" },
				new Object[] { "1,213.00", "Submit", "2", "Limited", "Gold" },
				new Object[] { "2,381.00", "Submit", "5", "Limited", "Platinum" },
				new Object[] { "4,536.00", "Submit", "10", "Unlimited", "Ultimate" }, });

	}

	@DataProvider
	public Object[][] getCamperData() {
		return (new Object[][] { new Object[] { "301.00", "No", "No", "No", "Silver" },
				new Object[] { "886.00", "Submit", "2", "Limited", "Gold" },
				new Object[] { "1,740.00", "Submit", "5", "Limited", "Platinum" },
				new Object[] { "3,314.00", "Submit", "10", "Unlimited", "Ultimate" }, });

	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sampleapp.tricentis.com/101/index.php#");

		evd = new EnterVehicleData(driver);
		eid = new EnterInsurantData(driver);
		epd = new EnterProductData(driver);
		pldata = new EnterPriceList(driver);
		sdata = new EnterSendQuote(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
