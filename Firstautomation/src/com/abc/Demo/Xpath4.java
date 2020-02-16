package com.abc.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/mohiuddin/Desktop/HTML%20files/4.html");
		WebElement fn = driver.findElement(By.xpath("//td[contains(text(),'Automation Testing')]"));
		fn.sendKeys(" And Selenium");

	}

}
