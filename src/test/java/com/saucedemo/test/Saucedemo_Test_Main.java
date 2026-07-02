package com.saucedemo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Saucedemo_Test_Main {

	public static void main(String[] args) {
		
		//create object of driver
		WebDriver driver = new ChromeDriver();
		//launch brower
		driver.get("https://www.saucedemo.com/");
		
	
		//maximize browser
		driver.manage().window().maximize();
		
		
		//get user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 
		//get user password
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   
	   
	   //click login
	   driver.findElement(By.id("login-button")).click();
	   
	   //add product
	   driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	   
	   driver.findElement(By.className("shopping_cart_link")).click();
	   
	   driver.findElement(By.id("checkout")).click();
	   
	   driver.findElement(By.id("first-name")).sendKeys("prabhanshu");
	   driver.findElement(By.id("last-name")).sendKeys("lakshakar");
	   driver.findElement(By.id("postal-code")).sendKeys("145555");
	   
	   driver.findElement(By.id("continue")).click();
	   
	   //verify
	   String title  = driver.findElement(By.className("title")).getText();
	   if(title.equals("Ckeckout:Overview")) {
		   System.out.println("Intermedia page validated");
	   }else {
		   System.out.println("validation failed");
	   }
	   
	   
	   
	   
	 //  verify login 
	   if(driver.getCurrentUrl().contains("inventory")) {
		   System.out.println("Login Successfully");
	   }else {
		   System.out.println("login Failed");
	   }
	   
				 
	}

	
	
//	
//	WebDriver driver;
//	
//     @BeforeMethod
//	public void setup() {
//		driver=new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		
//	}
//	
//     @AfterMethod
//     public void tearDown() {
//    	 driver.quit();
//     }
//	
//     private static void main(String[] arg) {
//		// TODO Auto-generated method stub
//    	 
//    	 Saucedemo_Test_Main obj =new Saucedemo_Test_Main();
//    	 obj.setup();
//	}
//	
//	
	
	
	
	
	
	
	
	
}
