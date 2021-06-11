package com.debasis.selenium;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class App 
{
   @Test 
	public static void main(String[] args) { 
		System.setProperty("webdriver.gecko.driver","/home/edureka/geckodriver"); 
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		options.addArguments("-headless");
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://172.31.30.247:8082/"); 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		driver.findElement(By.id("About Us")).click(); 
		String actualText = driver.findElement(By.id("PID-ab2-pg")).getText();
        System.out.println(driver.getTitle());
        String expectedText = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
  	    assertEquals(actualText, expectedText);
        System.out.println("Test passed!"); 
  	  driver.close(); 
         
	}
