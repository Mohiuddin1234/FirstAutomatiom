package com.abc.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFirst {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/mohiuddin/Desktop/HTML%20files/1.html");
	
		WebElement pws = d.findElement(By.xpath("/html/body/bod/center/input[2]"));

		pws.sendKeys("inzi");
	
	}

}
