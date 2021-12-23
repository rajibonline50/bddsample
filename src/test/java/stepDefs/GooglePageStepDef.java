package stepDefs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GooglePageStepDef {
	
		WebDriver driver;
		@Given("User is on Google Page")
		public void user_is_on_google_page() {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		}

		@When("USer search Java Tutorial")
		public void u_ser_search_java_tutorial() {
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Java Tutorial");
			searchBox.submit();
		}
		
		@Then("Should display Java Result Page")
		public void should_display_java_result_page() {
			Assert.assertEquals("Java Tutorial - Google Search",driver.getTitle());
		}
		
		@When("USer search Selenium Tutorial")
		public void u_ser_search_selenium_tutorial() {
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Selenium Tutorial");
			searchBox.submit();
		}
		
		@Then("Should display Selenium Result Page")
		public void should_display_selenium_result_page() {
			Assert.assertEquals("Selenium Tutorial - Google Search",driver.getTitle());
		}
			
		@Then("Close Browser")
		public void close_browser() {
			driver.close();
		}	

		@After
		public void attachImage(Scenario scenario) throws IOException {
			if(scenario.isFailed()) {
				TakesScreenshot scr = (TakesScreenshot)driver;
				File srcFile = scr.getScreenshotAs(OutputType.FILE);
				byte[] byteImg = FileUtils.readFileToByteArray(srcFile);
				scenario.attach(byteImg, "image/png", "image1");
			}
			
		}

}
