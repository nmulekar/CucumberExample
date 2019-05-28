package com.Cucumber.qa.glue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JBKSiteSteps {
	
	WebDriver driver;

	@Given("^Open a Browser$")
	public void open_a_Browser() throws Throwable {

		driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "E:\\Maven\\CucumberEx\\chromedriver.exe");

	}

	@When("^I open a jbkSite$")
	public void i_open_a_jbkSite() throws Throwable {

		driver.get("file:///C:/Users/hp/Desktop/Offline%20Website/index.html");

		driver.manage().window().maximize();
	}

	@Then("^career menu should be appears$")
	public void career_menu_should_be_appears() throws Throwable {
		
		System.out.println(1);
		/*driver.findElement(By.xpath("//nav//a[@href='careers.html']")).click();
		
		String act = driver.findElement(By.xpath("//nav//a[@href='careers.html']")).getText();
		
		String exp = "Careers";
		
		Assert.assertEquals(act, exp);
		
		System.out.println("Careers Actual = " + act);
		
		System.out.println("Careers Expected = " + exp);*/

	}

}
