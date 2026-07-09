package com.seleniumtest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_website_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		// intialize the crome driver
		 WebDriver Driver = new ChromeDriver();
		 Driver.get("https://www.youtube.com");
		 
		 Driver.manage().window().maximize();
		 
		 String pageTitle= Driver.getTitle();
		 
		 System.out.println("this website title : "+ pageTitle);
		 
		 /// this is check open or not
		 if(pageTitle.contains(pageTitle)) {
			 System.out.println("success access youtube");
		 }
		 else {
			 System.out.println(" fail to access youtube");
		 }
		 }catch(Exception e) {
			 e.printStackTrace();
			 
		 }
		 
	}

}
