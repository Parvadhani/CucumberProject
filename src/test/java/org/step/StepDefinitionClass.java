package org.step;



import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BaseClass {
	BaseClass b=new BaseClass();
	@Given("Launch the Website velayuthanadar Sweets")
	public void launch_the_website_velayuthanadar_sweets()
	{
	   b.launchBrowser();
	}
	@When("After loading the webpage selecting the product and adding it to the cart")
	public void after_loading_the_webpage_selecting_the_product_and_adding_it_to_the_cart() throws InterruptedException {
		Thread.sleep(3000);
	  WebElement cancelPopup = driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']"));
	  cancelPopup.click();	
	  WebElement shopButton = driver.findElement(By.xpath("//span[text()='Shop']"));
	  shopButton.click();
	  WebElement arusiMuruku = driver.findElement(By.xpath("//a[text()='Arusi Muruku']"));
	  arusiMuruku.click();
	  WebElement q500arusimuruku = driver.findElement(By.xpath("//li[@class='swatch swatch-label swatch-500g']"));
      q500arusimuruku.click();	
      WebElement CartBtn = driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt wp-element-button']"));
      CartBtn.click();
      
      System.out.println("I have change as Dev");
	}
	@Then("Checking that the count number of items added to the Cart")
	public void checking_that_the_count_number_of_items_added_to_the_cart() {
	   
	}
}
