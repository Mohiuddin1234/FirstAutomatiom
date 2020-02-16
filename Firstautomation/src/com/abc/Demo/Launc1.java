package com.abc.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launc1 {

	public static void main(String[] args) {
 		WebDriver driver = new FirefoxDriver();
 		driver.get("https://www.facebook.com");
 		System.out.println(driver.getPageSource());
 		driver.close();
 		
	}

}
