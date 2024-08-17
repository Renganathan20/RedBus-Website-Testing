package stepdef;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdefinitions {
	
	   WebDriver driver;
	
      @Given("I am on the  booking website")
      public void openBookingWebsite() {
    	 driver =new EdgeDriver();
    	 driver.get("https://www.redbus.in");
    	 driver.manage().window().maximize();
      }
      
      @When("I Enter Train Booking page")
      public void iEnterTrainBookingPage() {
          driver.findElement(By.xpath("//span[text()='Train Tickets']")).click();
      }
      @When("I Search Trichy as the departure city")
      public void iSearchTrichyAsTheDepartureCity() {
    	  driver.findElement(By.id("src")).sendKeys("Tiruchirappalli");
      }

      @When("I Search Chennai as the destination city")
      public void iSearchChennaiAsTheDestinationCity() {
    	 driver.findElement(By.id("dst")).sendKeys("Chennai Egmore");
      }
      
      @And("I enter Booking Date")
      public void EnterBookingDate() {
       driver.findElement(By.xpath("//div[@class='home_date_wrap']")).click();
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='calendar-wrapper']")));
      driver.findElement(By.xpath("//div[@class='sc-VigVT kFqgYD']")).click();
      driver.findElement(By.xpath("(//div[@class='sc-gzVnrw ktEypG'])[32]")).click();
      
      }
      @But("I click on the seacrh button ")
      public void iClickOnTheSeacrhButton() {
    	  driver.findElement(By.xpath("//button[text()='search trains']")).click();
    	  Alert alert=driver.switchTo().alert();
    	  String txt=alert.getText();
    	  System.out.println("Pop-up Text :"+txt);
    	  alert.accept();
    	      
      }


}
