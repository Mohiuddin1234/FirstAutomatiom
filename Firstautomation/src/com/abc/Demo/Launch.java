package com.abc.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();

	driver.get("https://www.gmail.com");
	String expecte="gmail";
	String actual=driver.getTitle();
	if(actual.equalsIgnoreCase(expecte))
	{
		System.out.println("Tilte is Same");
	}
	else
	{
		System.out.println("Title is Different");
		
	}
	}

}
