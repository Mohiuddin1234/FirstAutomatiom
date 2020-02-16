package com.abc.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/mohiuddin/Desktop/HTML%20files/2.html");
	
		WebElement pws = d.findElement(By.xpath("//input[1]"));

		pws.sendKeys("inzi");
	}

}
